package Operation;

import service.impl.TeacherImpl;
import service.inter.TeacherInter;
import models.Teacher;

import java.util.Scanner;


public class TeacherOperation {
    static TeacherImpl teacherImpl = new TeacherImpl();
    public static TeacherInter teacherInter = new TeacherImpl();

    public void addTeacherOperation() { //Data Collect class
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Mellimin adini daxil et");
        String name = scanner.nextLine();
        System.out.println("Mellimin soyadini daxil et");
        String surname = scanner.nextLine();
        System.out.println("Mellimin yasini daxil et");
        Integer age = scanner.nextInt();
        System.out.println("Mellimin maasini daxil et");
        Double salary = scanner.nextDouble();
        System.out.println("Mellimin finkodu daxil et");
        String finCode = input.nextLine();
        System.out.println("Mellimin ixtisasini daxil et");
        String Expertise = input.nextLine();

        Teacher teacher = new Teacher(name, surname, age, salary, finCode, Expertise);

        TeacherImpl teacher1 = new TeacherImpl();

        teacher1.addTeacher(teacher);

    }

    public void showTeacherOperation() { // Data Collect class


        Teacher[] teachers = teacherImpl.showTeacher();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(i + 1 + "-ci  mellimenin datalari\n" +
                        "");
                System.out.println(teachers[i]);
                break;
            } else if (teachers[i] == null) {
                System.out.println("Mellim daxil edilmeyibdir\n" +
                        "");
                break;
            }

        }
    }

    public void getTeacherByFinCodeOpeartion() { //Data Collect class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mellimin finkodunu daxil edin");
        String finCode = scanner.nextLine();

        TeacherImpl teacher = new TeacherImpl();

        System.out.println("Axtarilan mellimin datalari");
        teacher.getTeacherByFinCode(finCode);
        System.out.println(teacher.getTeacherByFinCode(finCode));
        System.out.println(" ");
    }

    public void getTeacherByExpertiseOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mellimin ixtisasini daxil et:");
        String expertise = scanner.nextLine();
        TeacherImpl teacher = new TeacherImpl();
        Teacher teachershow = teacher.getTeacher(expertise);
        System.out.println(teachershow);
    }

    public void deleteTeacherByFinCodeOperation() { //Data Collect
        Scanner scanner = new Scanner(System.in);
        String finCode = scanner.nextLine();
        teacherImpl.deleteTeacherByFinCode(finCode);
        System.out.println("Mellim ugurla silindi");
    }

    public void saveTeacherForFileOperation() { //File
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Mellimin adini daxil et");
        String name = scanner.nextLine();

        System.out.println("Mellimin soyadini daxil et");
        String surname = scanner.nextLine();

        System.out.println("Mellimin yasini daxil et");
        Integer age = scanner.nextInt();

        System.out.println("Mellimin finkodu daxil et");
        String finCode = scanner1.nextLine();

        System.out.println("Mellimin maasini daxil et");
        Double salary = scanner1.nextDouble();

        System.out.println("Mellimin ixtisasi daxil et");
        String expertise = scanner1.nextLine();

        Teacher teacher = new Teacher(name, surname, age, salary, finCode, expertise);
        teacherImpl.saveTeacherForFile(teacher);
    }

    public void GetdeleteTeacherByFinCodeForFileOperation() { //File
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silinecek mellimin finkodunu daxil et");
        String fincode = scanner.nextLine();
        teacherImpl.deleteTeacherForFile(fincode);
        System.out.println("Mellim ugurla silindi");
    }
    public void GetShowAllTeacherForFileOperation(){


    }
}

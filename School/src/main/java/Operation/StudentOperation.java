package Operation;

import models.datacollect.DataCollect;
import service.impl.StudentsImpl;
import models.Students;

import java.util.Scanner;

public class StudentOperation {
    public void addStudentOperation() {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Telebenin adini daxil et");
        String name = scanner.nextLine();
        System.out.println("Telebenin soyadini daxil et");
        String surname = scanner.nextLine();
        System.out.println("Telebenin yasini daxil et");
        Integer age = scanner.nextInt();
        System.out.println("Telebenin finkodu daxil et");
        String finCode = input.nextLine();
        System.out.println("Telebenin sinifini daxil et");
        String klass = input.nextLine();

        StudentsImpl studentimpl = new StudentsImpl();
        Students students = new Students(name, surname, age, finCode, klass);
        studentimpl.addStudents(students);
    }

    public void showStudentoperation(){
        Students[] students = DataCollect.getStudents();
        Students student = null;
        for (int i = 0; i <students.length ; i++) {
            if (students!=null){
                System.out.println(students[i]);
            }
            else System.out.println("Telebe tapilmadi");
        }


    }
}

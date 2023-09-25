import Operation.TeacherOperation;
import service.impl.TeacherImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {


        TeacherImpl teacher = new TeacherImpl();
        teacher.showTeacherForFile();

 //        throws methodun  basinda yazilir //checked
//        throw exception vermek
//
//        Scanner scanner = new Scanner(System.in);
//        boolean b = true;
//        while (b) {
//            System.out.println("Mellim opeation  -1- \n" +
//                    "Student operation -2- \n" +
//                    "Director operation -3- ");
//            Integer secim = scanner.nextInt();
//            switch (secim) {
//                case 1:
//                    TeacherOperationMethod();
//                    break;
//                default:
//                    b = false;
//            }
//
//        }
//
//    }
//
//    public static void TeacherOperationMethod() {
//        TeacherOperation teacherOperation = new TeacherOperation();
//        boolean d = true;
//        Scanner scanner = new Scanner(System.in);
//
//        while (d) {
//            System.out.println("Mellim elave etmek -1-");
//            System.out.println("Mellim silmek etmek -2-");
//            System.out.println("Mellimleri gormek -3-");
//            System.out.println("Mellimi fincoduna gore  tapmaq -4-");
//            System.out.println("Mellimi ixtisasina gore tapmaq -5-");
//            System.out.println("Mellimi fayla yazmaq -6-");
//            System.out.println("Mellimi fayldan silmek ucun -7-");
//            Integer secim = scanner.nextInt();
//
//
//            switch (secim) {
//                case 1:
//                    teacherOperation.addTeacherOperation();
//                    break;
//                case 2:
//                    teacherOperation.deleteTeacherByFinCodeOperation();
//                    break;
//                case 3:
//                    teacherOperation.showTeacherOperation();
//                    break;
//                case 4:
//                    teacherOperation.getTeacherByFinCodeOpeartion();
//                    break;
//                case 5:
//                    teacherOperation.getTeacherByExpertiseOperation();
//                    break;
//                case  6:
//                    teacherOperation.saveTeacherForFileOperation();
//                    break;
//                case 7:
//                  teacherOperation.GetdeleteTeacherByFinCodeForFileOperation();
//                    break;
//                default:
//                    d = false;
//            }
//        }


    }

}

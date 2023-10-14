package Operation;

import service.impl.DirectorImpl;
import service.inter.DirectorInter;
import models.Director;

import java.util.Scanner;

public class DirectorOperation {

    public static DirectorInter directorInter = new DirectorImpl();

    public void getDirectorByExpertiseOperation() { //operation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Directorun ixtisasini daxil et: ");
        String Expertise = scanner.nextLine();
        Director director = directorInter.getDirector(Expertise);
        System.out.println(director);
    }

    public void addDirectorOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Directorun datalarini daxil et : ");


        Director director = new Director("asa","asa",45,45.0,"aa1","Mellim");

        System.out.println(director);
    }




}

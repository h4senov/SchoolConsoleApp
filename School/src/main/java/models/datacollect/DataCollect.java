package models.datacollect;

import models.Director;
import models.Person;
import models.Students;
import models.Teacher;

public class DataCollect {

    private final static Teacher[] teachers = new Teacher[5];
    private final static Director[] directors = new Director[2];
    private final static Students[] students = new Students[10];
    public final static Person[] persons =  new Person[17];



    public static Person[] personsArray(){
        return persons;
    }
    public static Teacher[] getTeachers() {
        return teachers;
    }  // saxlanilan mellimleri gormek ucun geri qaytaran method

    public static Director[] getDirectors() {
        return directors;
    }

    public static Students[] getStudents() {
        return students;
    }
}

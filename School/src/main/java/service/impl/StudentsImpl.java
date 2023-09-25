package service.impl;

import service.abstrac.PersonAbstract;
import models.datacollect.DataCollect;
import service.inter.StudentsInter;
import models.Students;

public class StudentsImpl extends PersonAbstract implements StudentsInter {


    //Data collectde saxladigimiz arrayi doldurmag ucun addStudents methodunu yaradirig



    public void addStudents(Students student) { // Studente aid fieldleri yazmag ucun Student classini cagirdig
        Students[] students = DataCollect.getStudents();  // add elediyimiz studentleri datacollectde array kimi saxladigimiz ucun Student[] arrayi yaradirig
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student = students[i];
                break; // add edenden sonra for dongusu qirilsin
            }
        }
    }

    @Override
    public Students getStudent(String klass) {
        Students[] students = DataCollect.getStudents(); // DAta collectde saxladigimiz arraydeki datalari students arrayine menimsedirik
        Students student = null; // icini doldurmag ucun null verdik
        for (int i = 0; i < students.length; i++) {
            if (students[i].getKlass().equals(klass)) { // Students classindaki getklas methodu gelen klassa beraber olanda ise dusur
                student = students[i]; // studente  Datacollectediki [i] - ci studentu menimsetdik
            }
        }

        return student;
    }

    public Students getStudentByFinCode(String finCode) {
        Students[] students = DataCollect.getStudents();
        Students student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFinCode().equals(finCode)) {
                student = students[i];
            }
        }

        return student;
    }


    public void showStudent(){
        Students[] students = DataCollect.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }


}

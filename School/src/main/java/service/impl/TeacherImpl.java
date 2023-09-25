package service.impl;

import service.abstrac.PersonAbstract;
import models.datacollect.DataCollect;
import service.inter.TeacherInter;
import models.Teacher;
import util.FileReaderUtil;
import util.FileWriterUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TeacherImpl extends PersonAbstract implements TeacherInter {
    private final static FileWriterUtil fileWriter = new FileWriterUtil();
    private final static FileReaderUtil fileReaderUtil = new FileReaderUtil();

    @Override
    public Teacher ByFinCode(String finCode) {
        Teacher teacher = null;

        try {
            String[] strings = fileReaderUtil.reader();
            System.out.println(strings.length);
            System.out.println(strings[0]);
            for (int i = 0; i < strings.length; i++) {
                String[] strings1 = strings[i].split(" ");
                for (int j = 0; j < strings1.length; j++) {
                    if (strings1[4].equals(finCode)) {
                        teacher = new Teacher(strings1[0], strings[1], Integer.parseInt(strings1[2]), Double.parseDouble(strings1[3]), strings1[4], strings1[5]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Byfincode methodu ");
            System.out.println("System Error");
        }
        return teacher;
    }

    @Override
    public Teacher deleteTeacherForFile(String finCode) {
        try {
            String[] strings = fileReaderUtil.reader();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DataCollect.txt"));
            bufferedWriter.write("");
            bufferedWriter.close();
            for (int i = 0; i < strings.length; i++) {
                String[] strings1 = strings[i].split(" "); //null
                for (int j = 0; j < strings1.length; j++) {
                    if (strings1[4].equals(finCode)) {
                        strings[i] = null;

                    }
                }

                if (strings[i] != null) {
                    fileWriter.write(strings[i]);
                }

            }
        } catch (Exception e) {
            System.out.println("Server Error" + e.getMessage());
        }

        return null;
    }

    @Override
    public Teacher[] showTeacher() {
        return DataCollect.getTeachers();
    }

    @Override
    public Teacher showTeacherForFile() {

        try {
            BufferedReader bufferedReader1 = Files.newBufferedReader(Paths.get("DataCollect.txt"), StandardCharsets.UTF_8);

            String[] data = fileReaderUtil.reader();

            for (int i = 0; i < data.length; i++) {
                if (data != null) {
                    System.out.println(data[i]);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
return null;

    }

    @Override
    public String saveTeacherForFile(Teacher teacher) { // data collect file
        String value = teacher.getName() + " " + teacher.getSurname() + " " + teacher.getAge() + " " + teacher.getSalary() + " " + teacher.getFinCode() + " " + teacher.getExpertise();
        String notification = fileWriter.write(value);
        return notification;
    }

    public void addTeacher(Teacher teacher) { // data collect class

        Teacher[] teachers = DataCollect.getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }

    }


    public Teacher getTeacherByFinCode(String finCode) {
        Teacher[] teachers = DataCollect.getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getFinCode().equals(finCode)) {

                return teachers[i];
            }
        }
        return null;
    }


    @Override
    public Teacher getTeacher(String expertise) {
        Teacher[] teachers = DataCollect.getTeachers();

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getExpertise().equals(expertise)) {
                return teachers[i];
            }
        }
        return null;
    }

    public void deleteTeacherByFinCode(String finCode) {
        Teacher[] teachers = DataCollect.getTeachers();

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getFinCode().equals(finCode)) {
                teachers[i] = null;
            }
        }
    }


}

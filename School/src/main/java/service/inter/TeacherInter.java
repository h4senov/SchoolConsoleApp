package service.inter;

import models.Teacher;

public interface TeacherInter {
    public String saveTeacherForFile(Teacher teacher);

    public Teacher getTeacher(String Expertise);

    Teacher  ByFinCode(String finCode);
    Teacher deleteTeacherForFile(String finCode);
    Teacher[] showTeacher();
    Teacher showTeacherForFile();
}

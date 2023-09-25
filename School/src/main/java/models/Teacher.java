package models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import models.Person;
import models.Students;


@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Teacher extends Person {String expertise;


    public Teacher(String name, String surname, Integer age, Double salary, String finCode, String expertise) {
        super(name, surname, age, salary, finCode);
        this.expertise = expertise;
    }




    @Override
    public String toString() {

        return "Teacher{ name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", finCode='" + getFinCode() + '\'' +
                "expertise='" + expertise + '\'' +
                '}';
    }
}

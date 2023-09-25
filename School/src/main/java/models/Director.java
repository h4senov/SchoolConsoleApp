package models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Getter
@FieldDefaults(level =  AccessLevel.PRIVATE)
@Setter
public class Director extends Person {

   String Expertise;

    public Director(String name, String surname, Integer age, Double salary, String finCode, String expertise) {
        super(name, surname, age, salary, finCode);
        this.Expertise = expertise;
    }


}

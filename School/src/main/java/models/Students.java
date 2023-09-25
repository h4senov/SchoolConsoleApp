package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import models.Person;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Students extends Person {
    private String klass;

    public Students(String name, String surname, Integer age, String finCode, String klass) {
        super(name, surname, age, null, finCode);
        this.klass = klass;
    }



    @Override
    public String toString() {
        return "Students{ name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", finCode='" + getFinCode() + '\'' +
                "klass='" + klass + '\'' +
                '}';
    }
}

package service.abstrac;

import models.datacollect.DataCollect;
import models.Person;

import static models.datacollect.DataCollect.persons;

public abstract class PersonAbstract {


    public Person getPersonByFinCode(String finCode) { // Umumi insanlarin fincoduna gore axtaris eden method
        Person[] people = DataCollect.personsArray();  // Datacollectdeki person arayina gedir
        Person person = null;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getFinCode().equals(finCode)) {
                person = people[i];
            }
        }
        return person;
    }

    public Person[] collectPerson(Person[] person) {
        // butun insanlari bir yere toplayir

        for (int i = 0; i < persons.length; i++) {
            if (person[i] != null && persons[i] == null) {
                persons[i] = person[i];
            }
        }
        return persons;
    }






}

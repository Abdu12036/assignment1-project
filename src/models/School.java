package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class School {
    ArrayList<Person> person = new ArrayList<>();

    public void addMember(Person person) {
        this.person.add(person);
    }

    public void sortMembers(){
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.surname.compareTo(o2.surname);
            }
        });
    }

    @Override
    public String toString() {
        String members = "";
        for (Person person : person) {
            members += person.toString() + '\n';
        }
        return members;
    }
}


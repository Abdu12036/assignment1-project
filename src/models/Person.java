package models;

public class Person {
    private String name;
    protected String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, String gender) {
        setValues(name, surname, age, gender);
    }



    public void setValues(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        if(gender.equals("Male")){
            this.gender = true;
        }
        else{
            this.gender = false;
        }
    }

    public String toString(){
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " +
                (gender ? "Male":"Female");
    }
}

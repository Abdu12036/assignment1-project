package models;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;


    public Teacher(String name, String surname, int age, String gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        setSubject(subject);
        setYearsOfExperience(yearsOfExperience);
        setSalary(salary);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {return subject;}

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getYearsOfExperience() {return yearsOfExperience;}

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {return salary;}

    public void getRaise(int percentage) {
        this.salary = salary + salary * (percentage/100);
    }

    @Override
    public String toString() {
        return super.toString() + ", I teach: " + subject;
    }
}

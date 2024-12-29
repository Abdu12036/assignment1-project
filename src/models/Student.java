package models;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {return studentID;}

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double calculateAverageGrade(){
        double sum = 0;
        for(Integer grade : grades){
            sum += ((double) grade /100)*4.0;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", I am a student with ID " + studentID;
    }
}


import models.Person;
import models.Student;
import models.Teacher;
import models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\abdun\\IdeaProjects\\assignment1\\src\\students.txt");
        File file2 = new File("C:\\Users\\abdun\\IdeaProjects\\assignment1\\src\\teachers.txt");

        Scanner scan1 = new Scanner(file1);
        Scanner scan2 = new Scanner(file2);


        School school = new School();

        int generateID = 1;
        while (scan1.hasNext()) {
            Student student = new Student(scan1.next(), scan1.next(), scan1.nextInt(), scan1.next());
            while (scan1.hasNextInt()){
                student.addGrade(scan1.nextInt());
            }
            student.setStudentID(generateID);
            school.addMember(student);
            generateID++;
        }

        while (scan2.hasNext()) {
            Teacher teacher = new Teacher(scan2.next(), scan2.next(), scan2.nextInt(), scan2.next(), scan2.next(), scan2.nextInt(), scan2.nextInt());
            if(teacher.getYearsOfExperience() > 10){
                teacher.getRaise(30);
            }
            school.addMember(teacher);
        }

        school.sortMembers();

        System.out.println(school);

    }
}
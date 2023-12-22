package model;

import java.util.Arrays;

public class Teacher extends Person{


    private String[] coursesOffered;

    public Teacher() {

    }

    public Teacher(int id, String name,
                   String address, String faculty,
                   String[] coursesOffered) {
        super(id, name, address, faculty);
        this.coursesOffered = coursesOffered;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    @Override
    public String toString() {

        String personInfo = super.toString();

        return personInfo +  "\nTeacher{" +
                "coursesOffered=" + Arrays.toString(coursesOffered) +
                '}';
    }

    public void getHired(){
        System.out.println("Teacher for faculty " + getFaculty() + "\n is hired.");
    }
}

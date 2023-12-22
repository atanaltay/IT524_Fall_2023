package model;

import java.util.Arrays;

public class Student extends Person{


    private String[] registeredCourses;

    public Student(){}

    public Student(int id, String name,
                   String address,
                   String faculty, String[] registeredCourses) {
        super(id, name, address, faculty);
        this.registeredCourses = registeredCourses;
    }


    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    @Override
    public String toString() {

        String retVal = super.toString();
        return  retVal + "\nStudent{" +
                "registeredCourses=" + Arrays.toString(registeredCourses) +
                '}';
    }
}

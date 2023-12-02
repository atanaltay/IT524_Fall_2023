package com.sabanciuniv.model;

public class Instructor {

    private String name;
    private String area;

    private String faculty;

    private String[] courses;

    public Instructor() {
    }

    public Instructor(String name) {
        this.name = name;
    }

    public Instructor(String name, String area, String faculty) {
        this.name = name;
        this.area = area;
        this.faculty = faculty;
    }

    public Instructor(String name, String area, String faculty, String[] courses) {

        this.name = name;
        this.area = area;
        this.faculty = faculty;
        this.courses = courses;
    }

    public String getInfo(){

        String retVal = String.format("Name: %s, Area: %s, Faculty:%s\nCourses:\n",
                name,area,faculty);

        if(courses!=null){
            for (String course:  courses) {
                retVal  += course + "\n";
            }
        }


        return retVal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}

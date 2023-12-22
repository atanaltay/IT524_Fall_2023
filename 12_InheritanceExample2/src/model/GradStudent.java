package model;

public class GradStudent extends Student{

    private String thesisSubject;

    public GradStudent(int id, String name, String address,
                       String faculty, String[] registeredCourses,
                       String thesisSubject) {
        super(id, name, address, faculty, registeredCourses);
        this.thesisSubject = thesisSubject;
    }

    public String getThesisSubject() {
        return thesisSubject;
    }

    public void setThesisSubject(String thesisSubject) {
        this.thesisSubject = thesisSubject;
    }
}

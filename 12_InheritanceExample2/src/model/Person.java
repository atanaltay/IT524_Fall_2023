package model;

public class Person{

    private int id;
    private String name;
    private String address;
    private String faculty;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name, String address, String faculty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){

            if( this.id == ((Person)obj).getId()){
                return true;
            }

        }

        return false;

    }
}

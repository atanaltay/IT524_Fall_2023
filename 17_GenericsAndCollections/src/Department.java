import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> people;

    public Department(){

    }

    public Department(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}

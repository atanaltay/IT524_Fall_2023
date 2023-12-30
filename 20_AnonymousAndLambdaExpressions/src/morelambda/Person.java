package morelambda;

public class Person{
    private int id;
    private String name;


    public Person(){}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Person){

            //return new Integer(id).equals(((Person)obj).getId());

            return this.getName().equals(((Person)obj).getName());


        }

        return false;


    }

    @Override
    public int hashCode() {
        return id;
    }


}

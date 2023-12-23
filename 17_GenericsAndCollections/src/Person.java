public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person o) {
        /*
        if(this.id == o.getId()){
            return 0;
        }else if(this.id<o.getId()){
            return 1;
        }else{
            return -1;
        }

*/

        return -1*this.name.compareTo(o.getName());




    }
}

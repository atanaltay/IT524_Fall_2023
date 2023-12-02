public class Person {

    int id;
    String name;

    public Person(){

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    String getInfo(){

        //String.format

       String retVal = String.format("Name: %s, id: %d",name,id);
       return retVal;
    }



}

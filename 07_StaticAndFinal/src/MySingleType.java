
//Design Pattern: Singleton Pattern
public class MySingleType {

    private static MySingleType instance;

    private String name;

    private MySingleType(){}

    public static MySingleType getInstance(){

        if(instance == null){
            instance = new MySingleType();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

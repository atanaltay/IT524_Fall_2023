public class ImmutableType {

    private String value;


    public ImmutableType(String value){
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public static void main(String[] args) {

        ImmutableType immutableType = new ImmutableType("mehmet");

        System.out.println(immutableType.getValue());

        String s = "mehmet";

        s = "ali";


    }
}

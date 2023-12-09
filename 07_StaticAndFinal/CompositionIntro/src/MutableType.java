public class MutableType {

    private String value;


    public MutableType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //this.value = "ali";
        //value = "mehmet";

        MutableType mutableType = new MutableType("mehmet");
        mutableType.setValue("ali");

    }
}

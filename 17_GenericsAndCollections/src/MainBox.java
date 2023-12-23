public class MainBox {

    public static void main(String[] args) {

        Box<String> stringBox
                = new Box<>();

        stringBox.setaField("ali");

        System.out.println(stringBox.getaField());
        stringBox.getTypeInfo();

        //Generic types can only be reference types
        Box<Integer> intBox = new Box<>();
        intBox.setaField(23);
        System.out.println(intBox.getaField());
        intBox.getTypeInfo();

        //Boxing, from primitive to reference
       // Integer i = 23;
        //Unboxing, from reference to primitive
        //int z = i;

        String ss = "new string";
        changeValue(ss);
        System.out.println(ss);

        ss = changewithRetValue(ss);

        System.out.println(ss);



    }

    public static void changeValue(String s){
        s+=" added text";
    }

    public static String changewithRetValue(String s){
        s+=" added text";
        return s;
    }


}

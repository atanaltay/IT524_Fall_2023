public class Box<T> {

   private T aField;


   public void getTypeInfo(){
       System.out.println(aField.getClass().getName());
   }

    public void setaField(T aField) {
        this.aField = aField;
    }

    public T getaField() {
        return aField;
    }
}

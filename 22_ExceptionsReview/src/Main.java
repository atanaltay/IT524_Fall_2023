// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AProblematicOne obj = new AProblematicOne();

        try {
            System.out.print("C");
            obj.processData("");
            System.out.print("D");
        }catch (ArithmeticException arx){
            System.out.print("E");
           // arx.printStackTrace();
        } catch (Exception e) {
            System.out.print("F");
           //e.printStackTrace();
        }finally {
            System.out.println("G");
        }


    }
}
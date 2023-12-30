public class StringProcessorMain {


    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();

        try {
            processor.processArray(100);
        } catch (ProcessorException e) {
            System.out.println(e.getMessage());
            System.out.println("err code:" + e.getErrocode());
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }



}

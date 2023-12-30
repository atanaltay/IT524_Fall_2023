public class StringProcessor {

    String[] data = {"val1","val2","val3","val4"};

    public void processArray(int index) throws ProcessorException {
        if(index>data.length-1){
            throw  new ProcessorException(100,"Max index is 3");
        }
        System.out.println(data[index]);


    }




}

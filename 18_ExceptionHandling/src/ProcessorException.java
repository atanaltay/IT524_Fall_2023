public class ProcessorException extends Exception{

    private int errocode;


    public ProcessorException(int errocode,String errorMessage){

        super(errorMessage);
        this.errocode = errocode;

    }

    public int getErrocode() {
        return errocode;
    }


}

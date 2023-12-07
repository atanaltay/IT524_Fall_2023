public class TShirt {

    //0-> SMALL, 1-> MEDIUM, 2->LARGE

    public static final int SMALL=0;
    public static final int MEDIUM=1;
    public static final int LARGE=2;


    private int size;

    public TShirt(int size){
        this.size = size;
    }

    public double calculateCost(){
        if(size==0){
            return 200;
        }else if(size==1){
            return 250;
        }else{
            return 300;
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

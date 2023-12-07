public class TShirt2 {

    private Sizes size;

    public TShirt2(Sizes size){

        this.size = size;
    }

    public double calculateCost(){
        if(size==Sizes.SMALL){
            return 200;
        }else if(size==Sizes.MEDIUM){
            return 250;
        }else{
            return 300;
        }
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }
}

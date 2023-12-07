import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.time.LocalDateTime;

public class TShirtMain {

    private LocalDateTime startTime;

    public TShirtMain(){
        startTime = LocalDateTime.now();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public static void main(String[] args) {

        TShirt sportsTshirt = new TShirt(TShirt.SMALL);

        System.out.println("Cost is " + sportsTshirt.calculateCost());

        TShirt casualTshirt = new TShirt(TShirt.LARGE);

        System.out.println("Cost is " + sportsTshirt.calculateCost());

        TShirt2 tshirt2Sport = new TShirt2(Sizes.LARGE);

        System.out.println("Cost is " + tshirt2Sport.calculateCost());

        TShirtMain program = new TShirtMain();
        System.out.println(program.startTime);


    }




}

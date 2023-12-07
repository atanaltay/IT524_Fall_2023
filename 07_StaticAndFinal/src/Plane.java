import java.time.LocalDateTime;

public class Plane {

    private String destination;
    private LocalDateTime takeoff;

    public static int count;

    public Plane(){
        count++;

    }


    public Plane(String destination, LocalDateTime takeoff) {
        this();
        this.destination = destination;
        this.takeoff = takeoff;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(LocalDateTime takeoff) {
        this.takeoff = takeoff;
    }
}

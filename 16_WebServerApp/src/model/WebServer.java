package model;

import java.time.LocalDateTime;

public class WebServer {


    public WebServer(){
        System.out.println("Server started at "
                + LocalDateTime.now());
    }


    public void displayPage(Page page){

        System.out.println("Displayin page at " +
                LocalDateTime.now());
        page.getContent();
    }


}

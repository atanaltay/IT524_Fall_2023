package model;

public class HomePage implements Page{

    private String developer;
    private String title;
    private String textContent;

    public HomePage(String developer, String title, String textContent) {
        this.developer = developer;
        this.title = title;
        this.textContent = textContent;
    }

    @Override
    public void getContent() {
        System.out.println("Developed by:" + developer);
        System.out.println("Title:" + title);
        System.out.println("Text:" + textContent);
    }
}

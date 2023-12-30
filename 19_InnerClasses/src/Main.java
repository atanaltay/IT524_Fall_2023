// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Les Miserables");
        book.setAuthor("Victor Hugo");

       //Book.Chapter chapter1 = new Book(). new Chapter();
        Book.Chapter chapter1 = book. new Chapter(1,"Chapter 1");

       book.addChapter(chapter1);

        System.out.println(book.getChapter(0));


        CoverPage coverPage = new CoverPage();
        book.addPage(coverPage);


        //Anonymous inner class
        book.addPage(new Page(){

            @Override
            public void getContent() {
                System.out.println("This is second page....");
            }
        });

        //Lambda expression
        book.addPage(()-> {
            System.out.println("This is thirs page");

            ;
        });

        //lambda expression
        book.addPage(()-> System.out.println("This is fourth page"));

        book.getSummary();


    }
}
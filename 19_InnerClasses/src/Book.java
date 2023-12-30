import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;

    private List<Chapter> chapters = new ArrayList<>();

    private List<Page> pages = new ArrayList<>();


    public void addPage(Page page){

        this.pages.add(page);


    }

    public void getSummary(){
        for (Page page:pages
             ) {
            page.getContent();
        }
    }


    public void addChapter(Chapter chapter){
        this.chapters.add(chapter);
    }

    public Chapter getChapter(int index){
        return this.chapters.get(index);
    }

    //Member class, nested class
    class Chapter{
        private int no;
        private String title;


        public Chapter() {
        }

        public Chapter(int no, String title) {
            this.no = no;
            this.title = title;
        }



        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Chapter{" +
                    "no=" + no +
                    ", title='" + title + '\'' +
                    '}';
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

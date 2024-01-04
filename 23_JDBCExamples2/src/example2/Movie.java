package example2;

public class Movie implements Comparable<Movie>{

    private String title;
    private String category;

    private int year;

    public Movie() {
    }

    public Movie(String title, String category, int year) {
        this.title = title;
        this.category = category;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.title.compareTo(o.getTitle())*-1;
    }
}

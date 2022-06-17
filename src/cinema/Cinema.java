package cinema;

public class Cinema {

    private String name;

    private String genre;

    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Cinema(String name, String genre, int hours) {
        this.name = name;
        this.genre = genre;
        this.hours = hours;
    }
}

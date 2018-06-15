package model;

public class Film {
    private String name;
    private String director;
    private int year;
    private String genre;
    private String description;
    private double award;

    public Film(String name, String director, int year, String genre, String description, double award) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.description = description;
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAward() {
        return award;
    }

    public void setAward(double award) {
        this.award = award;
    }

    @Override
    public String toString() {
        return  name + " " + director + " " + year + " " + genre + " " + description + " " + award;
    }
}

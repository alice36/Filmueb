package model;

public class Serial {
    private String name;
    private int seasonNumber;
    private String producer;
    private String genre;
    private String description;
    private double award;

    public Serial(String name, int seasonNumber, String producer, String genre, String description, double award) {
        this.name = name;
        this.seasonNumber = seasonNumber;
        this.producer = producer;
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

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        return  name + " " + seasonNumber + " " + producer + " " + genre + " " + description + " " + award;
    }
}

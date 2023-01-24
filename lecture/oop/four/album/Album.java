package lecture.oop.four.album;

public class Album {
    private String name;
    private String artist;

    private double price;

    private int numberOfCopies;

    public void sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("One album has sold");
        } else {
            System.out.println("No more albums available");
        }
    }

    public void oderCopies(int num) {
        numberOfCopies += num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        } else {
            this.numberOfCopies = 0;
        }
    }
}

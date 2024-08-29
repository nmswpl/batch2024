package in.co.nmsworks.week4.day4;

public class Card {
    private String name;

    public Card(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

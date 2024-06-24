package itmo.java.basics.lesson6;

public enum Color {
    BLACK ("черный"),
    WHITE ("белый"),
    GREEN ("зеленый"),
    BLUE ("синий"),
    RED ("красный");

    private final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription () {
        return description;
    }
}

package itmo.java.basics.lesson2;

public enum Version {
    WINDOW("Оконый"),
    MOBILE("Мобильный"),
    SPLIT("Сплит-система"),
    CHANNEL("Канальный");

    private final String description;

    Version(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

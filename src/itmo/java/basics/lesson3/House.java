package itmo.java.basics.lesson3;

import java.time.Year;

public class House {
    private Integer floorCount;
    private Integer yearOfBuilt;
    private String name;

    public House() {}

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }
    public Integer getFloorCount() {
        return floorCount;
    }

    public void setYearOfBuilt(Integer yearOfBuilt) {
        this.yearOfBuilt = yearOfBuilt;
    }
    public Integer getYearOfBuilt() {
        return yearOfBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        Integer currentYear = Year.now().getValue();
        return currentYear - yearOfBuilt;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor count=" + floorCount + ", " +
                "year of build=" + yearOfBuilt + ", " +
                "name='" + name + "'" +
                "}";
    }
}

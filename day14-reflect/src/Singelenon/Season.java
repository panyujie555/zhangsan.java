package Singelenon;

public enum Season {
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");

private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package Builder_Pattern;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private int windows;
    private int doors;
    private boolean garage;
    private boolean garden;

    public House(HouseBuilder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
        this.garden = houseBuilder.garden;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", windows="
                + windows + ", doors=" + doors + ", garage=" + garage + ", garden=" + garden + "]";
    }
}

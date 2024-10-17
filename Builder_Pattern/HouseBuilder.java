package Builder_Pattern;

public class HouseBuilder {
    // Required Parameters
    public String foundation;
    public String structure;
    public String roof;

    // Optional parameters
    public int windows;
    public int doors;
    public boolean garage;
    public boolean garden;

    public HouseBuilder(String foundation, String structure, String roof) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
    }

    public HouseBuilder setWindows(int windows) {
        this.windows = windows;
        return this;

    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    public House build() {
        return new House(this);
    }
}

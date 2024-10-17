package Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        House simpleHouse = new HouseBuilder("Concrete", "Wood", "Tiles").setWindows(4).setDoors(2).build();

        System.out.println(simpleHouse);

        House luxuryHouse = new HouseBuilder("Concrete", "Brick", "Shingles").setWindows(10).setDoors(4).setGarage(true)
                .setGarage(true).build();

        System.out.println(luxuryHouse);
    }
}

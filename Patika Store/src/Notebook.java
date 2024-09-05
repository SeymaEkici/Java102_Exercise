import java.util.ArrayList;

public class Notebook extends Product{

    private final int memory;

    public Notebook(int id, String name, String productType, int price, int discountPercentage, int stock, double screenSize, int batteryCapacity, int ram, ArrayList<String> brands, int memory) {
        super(id, name, "Notebook", price, discountPercentage, stock, screenSize, batteryCapacity, ram, brands);
        this.ram = 16;
        this.screenSize = 14;
        this.memory = 512;
    }
}

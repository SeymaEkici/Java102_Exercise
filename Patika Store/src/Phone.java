import java.awt.desktop.AppReopenedEvent;
import java.util.ArrayList;

public class Phone extends Product{


    private PhoneMemorySize phoneMemorySize;
    private PhoneColor phoneColor;

    public Phone (int id, String name, ArrayList<String> brands, int price, int discountPercentage, int stock, final double screenSize, final int batteryCapacity, final int ram, PhoneMemorySize phoneMemorySize, PhoneColor phoneColor){
        super(id, name, "Phone", price, discountPercentage, stock, screenSize, batteryCapacity, ram, brands);
        this.screenSize = 6.1;
        this.batteryCapacity = 4000;
        this.ram = 8;
        this.phoneMemorySize = phoneMemorySize;
        this.phoneColor = phoneColor;

        // Validate each brand in the list of brands
        for (String brand : brands) {
            if (!isValidBrand(brand)) {
                throw new IllegalArgumentException("Invalid Brand: " + brand);
            }
        }
    }

    public PhoneMemorySize getPhoneMemorySize() {
        return phoneMemorySize;
    }

    public PhoneColor getPhoneColor() {
        return phoneColor;
    }
}

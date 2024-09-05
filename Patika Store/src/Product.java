import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Product {

    private int id;
    private String name;
    private String productType;
    private int price;
    private int discountPercentage;
    private int stock;
    protected double screenSize;
    protected int batteryCapacity;
    protected int ram;
    private ArrayList<String> brands = new ArrayList<>();
    private static final Set<String> validBrands = new HashSet<>();

    static {
        validBrands.add("Samsung");
        validBrands.add("Lenovo");
        validBrands.add("Apple");
        validBrands.add("Huawei");
        validBrands.add("Casper");
        validBrands.add("Asus");
        validBrands.add("HP");
        validBrands.add("Xiaomi");
        validBrands.add("Monster");
    }

    public Product() {
        // Default constructor
    }

    public Product(int id, String name, String productType, int price, int discountPercentage, int stock, double screenSize, int batteryCapacity, int ram, ArrayList<String> brands) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.stock = stock;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.brands = brands;
        Collections.sort(this.brands);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getram() {
        return ram;
    }

    public ArrayList<String> getBrands() {
        return brands;
    }

    public void setBrands(ArrayList<String> brands) {
        this.brands = brands;
        Collections.sort(this.brands);
    }

    public static boolean isValidBrand(String brand) {
        return validBrands.contains(brand);
    }

    public static Set<String> getValidBrands() {
        return validBrands;
    }
}

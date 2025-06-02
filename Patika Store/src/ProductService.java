import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {

    protected static ArrayList<Product> products = new ArrayList<>();

    public static void listProducts(String productType) {

        if (productType.equalsIgnoreCase("Notebook")){
            System.out.println("\nNotebook List:\n");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-30s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                    "ID", "Product Name", "Price", "Brand", "Memory", "Screen Size", "RAM");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (Product product : products) {
                if (product instanceof Notebook) {
                    Notebook nb = (Notebook) product;
                    System.out.printf("| %-3d | %-30s | %-10d TL | %-10s | %-10d | %-10.1f | %-10d |\n",
                            nb.getId(),
                            nb.getName(),
                            nb.getPrice(),
                            nb.getBrands().get(0),
                            nb.getMemory(),
                            nb.getScreenSize(),
                            nb.getRam()
                    );
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
        else if (productType.equalsIgnoreCase("Phone")){
            System.out.println("\nNotebook List:\n");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-30s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                    "ID", "Product Name", "Price", "Brand", "Memory", "Screen Size", "Camera");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (Product product : products) {
                if (product instanceof Phone) {
                    Phone phone = (Phone) product;
                    System.out.printf("| %-3d | %-30s | %-10d TL | %-10s | %-10d | %-10.1f | %-10d |\n",
                            phone.getId(),
                            phone.getName(),
                            phone.getPrice(),
                            phone.getBrands().get(0),
                            phone.getPhoneMemorySize(),
                            phone.getScreenSize(),
                            phone.getCameraMP()
                    );
                }
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
        else {
            System.out.println("Unknown product type.");
        }
    }

    public static void addProduct (String productType) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = input.nextInt();
        input.nextLine(); // dummy

        System.out.print("Enter product name: ");
        String name = input.nextLine();

        System.out.print("Enter product price: ");
        int price = input.nextInt();

        System.out.print("Enter discount percentage: ");
        int discount = input.nextInt();

        System.out.print("Enter stock quantity: ");
        int stock = input.nextInt();

        System.out.print("Enter screen size (inch): ");
        double screenSize = input.nextDouble();

        System.out.print("Enter battery capacity (mAh): ");
        int battery = input.nextInt();

        System.out.print("Enter RAM size (GB): ");
        int ram = input.nextInt();

        input.nextLine(); // dummy

        System.out.print("Enter brand(s) separated by commas: ");
        String brandInput = input.nextLine();
        ArrayList<String> brands = new ArrayList<>();
        for (String brand : brandInput.split(",")) {
            brands.add(brand.trim());
        }

        if (productType.equalsIgnoreCase("Notebook")) {
            System.out.print("Enter storage size (GB): ");
            int memory = input.nextInt();

            Notebook notebook = new Notebook(id, name, productType, price, discount, stock, screenSize, battery, ram, brands, memory);
            products.add(notebook);
            System.out.println("Notebook added successfully!");

        } else if (productType.equalsIgnoreCase("Phone")) {
            System.out.print("Enter storage size (enum): ");
            String memoryStr = input.next().toUpperCase();
            PhoneMemorySize memorySize = PhoneMemorySize.valueOf(memoryStr);

            System.out.print("Enter camera MP: ");
            int cameraMP = input.nextInt();

            System.out.print("Enter color (enum): ");
            String colorStr = input.next().toUpperCase();
            PhoneColor color = PhoneColor.valueOf(colorStr);

            Phone phone = new Phone(id, name, brands, price, discount, stock, screenSize, battery, ram, memorySize, color);
            phone.setCameraMP(cameraMP); // Eğer constructor'da yoksa bu setter'ı eklemelisin
            products.add(phone);
            System.out.println("Phone added successfully!");

        } else {
            System.out.println("Unknown product type!");
        }
    }

    public static void deleteProduct (String productType) {

    }
}

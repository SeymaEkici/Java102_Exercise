import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("PatikaStore Management Panel:\n" +
                "1 - Notebook Operations\n" +
                "2 - Phone Operations\n" +
                "3 - List the Brands\n" +
                "0 - Exit\n" +
                "Enter your choice:");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                break;

            case 2:
                break;

            case 3:
                listBrands();
                break;

            case 0:
                System.out.println("Thank you for visiting, see you again!");
                break;
        }


        scanner.close();
    }

    public static void listBrands(){
        System.out.println("Our Brands\n" +
                "------------------");
        for (String brand : Product.getValidBrands()){
            System.out.println("- " + brand);
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // input parameter
        String SerialNumber;
        String Name;
        String Model;
        String Year;
        String Manufacturer;
        String BaseCost;

        // Inputing
        System.out.println("Enter the serial number");
        SerialNumber = myObj.nextLine();
        System.out.println("Enter the car name");
        Name = myObj.nextLine();
        System.out.println("Enter the model name");
        Model = myObj.nextLine();
        System.out.println("Enter the car year");
        Year = myObj.nextLine();
        System.out.println("Enter the car manufacturer");
        Manufacturer = myObj.nextLine();
        System.out.println("Enter the car base cost");
        BaseCost = myObj.nextLine();

        System.out.println("Serial number: " + SerialNumber);
        System.out.println("Name: " + Name);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Manufacturer: " + Manufacturer);
        System.out.println("Base cost: " + BaseCost);
    }
}



// Main function to test those three classes


public class Test{

    public static void main(String args[])
        {
            // Create objects and access the class
        Bike testBike = new Bike("Round",2,"Cool");
        testBike.printBike();

        Bicycle testBicycle = new Bicycle(3,"star",3,"bad");

        testBicycle.printBicycle();

        Motorcycle testMotorcycle = new Motorcycle(4,"Rectangle",2,"Awesome","Huge","V8");

        testMotorcycle.printMotorcycle();

        }
        }
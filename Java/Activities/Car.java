package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres= 4;
        doors= 4;
    }

    public void displayCharacteristics(){
        System.out.println("Colour: "+color+ "\n Transmission: "+transmission+ "\n Make: "+make+ "\n Tyres: "
        +tyres+ "\n Doors: "+doors);
    }

    public void accelerate(){
        System.out.println( "Car is moving forward.");
    }

    public void brake(){
        System.out.println( "Car has stopped.");
    }
}

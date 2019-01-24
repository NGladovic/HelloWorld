
public class Car {
    
    int maxSpeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";
    
    double maxFuel = 100.0;
    double currentFuel = 50.0;
    int consumption = 5;//per 100km
    double mileagePassed = 2000.0;
    
    
    public void printVariables() {
        System.out.println("Maksimalna brzina: " + maxSpeed + "km/h");
        System.out.println("Tezina: " + weight + "kg");
        System.out.println("Da li je auto ukljucen: " + isTheCarOn);
        System.out.println("Model: " + model);
        System.out.println("Velicina rezervoara: " + maxFuel + "l");
        System.out.println("Trenutna kolicina goriva: " + currentFuel +"l");
        System.out.println("Potrosnja: " + consumption + "l na 100km");
        System.out.println("Predjena kilometraza: " + mileagePassed + "km");
    }
    
    
    
    
}

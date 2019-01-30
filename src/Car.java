
public class Car {
    
    private String model;
    private String license;
    private int maxSpeed;
    private double mileagePassed;
    
    private double weight;
    private double maxFuel;
    private double currentFuel;
    private double consumption;//per 100km
    private double consumption2 = 100;
    private double fuelKm;
    private double kmPerL;
    
    
    
    public void printVariables() {
        System.out.println("Model: " + model);
        System.out.println("Registracija: " + license);
        System.out.println("Maksimalna brzina: " + maxSpeed + "km/h");
        System.out.println("Predjena kilometraza: " + mileagePassed + "km");
        System.out.println("Tezina: " + weight + "kg");
        System.out.println("Velicina rezervoara: " + maxFuel + "L");
        System.out.println("Trenutna kolicina goriva: " + currentFuel +"L");
        System.out.println("Potrosnja: " + consumption + "L na 100km");
        System.out.println("Moze se preci " + fuelKm + " km sa trenutnom kolicinom goriva");
        
        System.out.println(" ");
    }
    
    
    public void Car(){
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.license = license;
        this.model = model;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
        this.consumption = consumption;
        this.consumption2 = consumption2;
        this.mileagePassed = mileagePassed;
        this.fuelKm = fuelKm;
        this.kmPerL = kmPerL;
    }
    
    public Car(String customModel,String customLicense){
        this.model = customModel;
        this.license = customLicense;
    }
    
    public Car(String model,String license,int maxSpeed,int mileagePassed,double weight,double maxFuel,double currentFuel,double consumption){
        this.model = model;
        this.license = license;
        this.maxSpeed = maxSpeed;
        this.mileagePassed = mileagePassed;
        this.weight = weight;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
        this.consumption = consumption;
        
        
    }
    
    public void setWeight(double customWeight){
        this.weight = customWeight;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setConsumption(double customConsupmtion){
        this.consumption = customConsupmtion;
    }
    
    public void setFuelKm(double fuel){
        this.fuelKm = fuel;
        this.fuelKm = fuel * (this.consumption2 / this.consumption);
        
    }

    public void fuelUp(){
        if(this.currentFuel<20){
            System.out.println("Treba da se napuni rezervoar");
         }else if(this.currentFuel<this.maxFuel){
            System.out.println("Dopuniti rezervoar");
        }else{
             System.out.println("Rezervoar je pun");
         }
    }
    
    
}

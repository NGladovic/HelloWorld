
public class Main {

    
    public static void main(String[] args) {
       
      System.out.println("Hello World");
      System.out.println("Nenad");
      
      String user = "Nenad Gladovic";
      
     // Car defaultCar = new Car();
      //defaultCar.printVariables();
      
      Car audi = new Car("Audi A4","BG-1234");
      //audi.printVariables();
      
      audi.setWeight(1000);
      audi.setConsumption(7);
     // audi.printVariables();
      
      Car bmw = new Car("BMW", "MILF:69 69", 210, 20000, 1500, 55, 15, 7.5);
     // bmw.printVariables();
      
     bmw.setFuelKm(55);
     bmw.printVariables();
     bmw.fuelUp();
     
             
      
      
     
      
    }
    
}

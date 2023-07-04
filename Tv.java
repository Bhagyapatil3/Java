public class Tv{
public static void main(String[] args){
//Using literals
 String brand = "Samsung";
 String screenSize = "32s";
 String resolution = "1920*1080px";
 String operatingSystem = "TizenTv";
 String screenType = "QLED";
 String speakers = "DolbyDigital";
 String design = "NeoQled";
 String model = "Samsung";
 String colour = "Black";
 String wattage = "157s";
 
 //Using New Keywords
 String modelYear = new String("2012s");
 String powerConsumption = new String("82.96kwh");
 String panel = new String("LED");
 String controlMethod = new String("Remote");
 String processor = new String("Gen1 4nm");
 String localDimming = new String("FullArray");
 String connectivity = new String("Bluetooth");
 String ports = new String("19-pin plug");
 String height = new String("833mm");
 String weight = new String("10.8kg");

 //methods
 String returnedValue = brand.toUpperCase();
 System.out.println(returnedValue);
 
 String oldValue = brand.toLowerCase();
 System.out.println(oldValue);
  
 boolean results = brand.startsWith("Samsung");
 System.out.println(results);
 
 boolean newValue = brand.endsWith("x20");
 System.out.println(newValue);
 
 String realValue = colour.replace('B','W');
 System.out.println(realValue);
}
}
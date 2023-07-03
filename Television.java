//Class and Objects
public class Television{
//states
static String brand;
static String screenSize;
static String resolution;
static String operatingSystem;
static String screenType;
static String speakers;
static boolean isSmartTv;
static String design;
static String model;
static String colour;
static String wattage;
static String modelYear;
static float weight;
static String powerConsumption;
static int usbPorts;
static boolean isBluetooth;
static String panel;
static int numberOfSpeakers;
static boolean remoteIncluded;
static String controlMethod;

public Television(String brand,String screenSize,String resolution,String operatingSystem,String screeTtype,String speakers,boolean isSmartTv,String design,String model,String colour,String wattage,String modelYear,float weight,String powerConsumption,int usbPorts,boolean isBluetooth,String panel,int numberOfSpeakers,boolean remoteIncluded,String controlMethod){

this.brand=brand;
this.screenSize=screenSize;
this.resolution=resolution;
this.operatingSystem=operatingSystem;
this.screenType=screenType;
this.speakers=speakers;
this.isSmartTv=isSmartTv;
this.design=design;
this.model=model;
this.colour=colour;
this.wattage=wattage;
this.modelYear=modelYear;
this.weight=weight;
this.powerConsumption=powerConsumption;
this.usbPorts=usbPorts;
this.isBluetooth=isBluetooth;
this.panel=panel;
this.numberOfSpeakers=numberOfSpeakers;
this.remoteIncluded=remoteIncluded;
this.controlMethod=controlMethod;

}
//Behaviour
public static void consumeElectricity(){
}
public static void entertainment(){
}
public static void toWatch(){
}
public static void socialNews(){
}
public static void music(){
}
public static void videos(){
}
public static void videoGames(){
}
public static void information(){
}
public static void education(){
}
public static void weather(){
}

public static void main(String[] args){
Television television = new Television("Samsung","32s","1920*1080px","TizenTV","QLED","DolbyDigital",true,"NeoQled","Samsung","Black","157s","2012s",3.5f,"82.96kwh",10,false,"LED",2,true,"controll");

System.out.println(Television.brand);
System.out.println(Television.screenSize);
System.out.println(Television.resolution);
System.out.println(Television.operatingSystem);
System.out.println(Television.screenType);
System.out.println(Television.isSmartTv);
System.out.println(Television.design);
System.out.println(Television.model);
System.out.println(Television.colour);
System.out.println(Television.wattage);
System.out.println(Television.modelYear);
System.out.println(Television.weight);
System.out.println(Television.powerConsumption);
System.out.println(Television.usbPorts);
System.out.println(Television.isBluetooth);
System.out.println(Television.panel);
System.out.println(Television.numberOfSpeakers);
System.out.println(Television.remoteIncluded);
System.out.println(Television.controlMethod);
}
}

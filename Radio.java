public class Radio{

int noOfSpeakers;
String powerSupply;
int noOfBatteries;
String batteryType;
String ledColor;
	RadioColor color = RadioColor.BLACK;
	NumberOfRadios radios=NumberOfRadios.ONE;

public Radio(int noOfSpeakers,String powerSupply,int noOfBatteries,String batteryType,String ledColor){
this.noOfSpeakers=noOfSpeakers;
this.powerSupply=powerSupply;
this.noOfBatteries=noOfBatteries;
this.batteryType=batteryType;
this.ledColor=ledColor;
}

public static void main(String[] args){
Radio radio = new Radio(1,"Battery",1,"Rechargeable","Red");
System.out.println(radio.noOfSpeakers);
System.out.println(radio.powerSupply);
System.out.println(radio.noOfBatteries);
System.out.println(radio.batteryType);
System.out.println(radio.ledColor);
System.out.println(radio.color.getValue());
System.out.println(radio.radios.getValue());
}

public int getNoOfSpeakers(){
return noOfSpeakers;
}

public String getPowerSupply(){
return powerSupply;
}

public int getNoOfBatteries(){
return noOfBatteries;
}

public String getBatteryType(){
return batteryType;
}

public String getLedColor(){
return ledColor;
}

}
enum RadioColor{
	BLACK("black"),WHITE("white"),GREY("grey");
	String value;
	RadioColor(String value){
		this.value=value;
		}
public String getValue(){
	return value;
}
}
enum NumberOfRadios{
	ONE(1),TWO(2),THREE(3);
	int value;
	NumberOfRadios(int value){
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	
}
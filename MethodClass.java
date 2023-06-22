public class MethodClass{
public static void main(String[] args){
add();
sub();
mul();
div();
mod();
}
public static void add(){
int[] noOfRooms = {1,2,3,4,5};
for(int i=0;i<noOfRooms.length;i++){
System.out.println(noOfRooms[i]);
}
}

public static void sub(){
float[] vegetableWeight = new float[5];
vegetableWeight[0] = 20.5f;
vegetableWeight[1] = 40.5f;
vegetableWeight[2] = 70.5f;
vegetableWeight[3] = 60.5f;
vegetableWeight[4] = 80.5f;
for(int i=0;i<vegetableWeight.length;i++){
System.out.println(vegetableWeight[i]);
}
}

public static void mul(){
int[] noOfFloors = {3,4,6,7,9};
for(int i=0;i<noOfFloors.length;i++){
System.out.println(noOfFloors[i]);
}
}

public static void div(){
float[] bodyTemperature = new float[5];
bodyTemperature[0] = 22.5f;
bodyTemperature[1] = 32.5f;
bodyTemperature[2] = 92.5f;
bodyTemperature[3] = 72.5f;
bodyTemperature[4] = 62.5f;
for(int i=0;i<bodyTemperature.length;i++){
System.out.println(bodyTemperature[i]);
}
}
public static void mod(){
int[] noOfBooks = {20,30,40,50,60};
for(int i=0;i<noOfBooks.length;i++){
	System.out.println(noOfBooks[i]);
}
}
}

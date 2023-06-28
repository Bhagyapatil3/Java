public class Chair{
int noOfFloors;
char grade;
float temperature;
int rooms;
String studentName;

//Default constructor
public Chair(){
System.out.println(noOfFloors);
System.out.println(grade);
System.out.println(temperature);
System.out.println(rooms);
System.out.println(studentName);
}

//Parametrised constructor
public Chair(int noOfFloors1,char grade1,float temperature1,int rooms1,String studentName1){
System.out.println("parametrised constructor");
noOfFloors = noOfFloors1;
grade = grade1;
temperature = temperature1;
rooms = rooms1;
studentName = studentName1;
}

public static void main(String[] args){
new Chair();

System.out.println("constructor is created");
Chair chair = new Chair(5,'A',6.8f,3,"Bhagya");

System.out.println(chair.noOfFloors);
System.out.println(chair.grade);
System.out.println(chair.temperature);
System.out.println(chair.rooms);
System.out.println(chair.studentName);
}
}                                                                                
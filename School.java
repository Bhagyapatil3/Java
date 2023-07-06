//Create a class , declare 5 static variables , 5 non static , initialize the variables -> create 5 objects

public class School{
	
static String schoolName ;
static String schoolBranchName;
static String schoolLocation;
static String contry;
static String nameOfFounder;

int noOfTeachers;
int salary;
String nameOfTeacher;
int noOfClassroom;
int ageOfTeacher;


public static void main(String[] args){
		School school = new School(20,10000,"Bhagya",10,25);
		System.out.println(school.noOfTeachers);

		School school1 = new School(30,12000,"Rakshita",10,25);
		System.out.println(school1.noOfTeachers);
		
		School school2 = new School(40,14000,"Puttu",10,25);
		System.out.println(school2.noOfTeachers);
		
		School school3 = new School(250,16000,"Nikhil",100,23);
		System.out.println(school3.noOfTeachers);
		
		School school4 = new School(100,18000,"Pratik",100,23);
		System.out.println(school4.noOfTeachers);
		}

		public School(int noOfTeachers,int salary,String nameOfTeacher,int noOfClassroom,int ageOfTeacher){
		this.noOfTeachers=noOfTeachers;
		this.salary=salary;
		this.nameOfTeacher=nameOfTeacher;
		this.noOfClassroom=noOfClassroom;
		this.ageOfTeacher=ageOfTeacher;
		
		}
}
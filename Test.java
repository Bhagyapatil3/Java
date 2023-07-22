//Java Test

1.31
2.Zudio
3.50
4.Sum is 200 length is 4
5.
6.Method Parameters are the values which specify inside the method braces.
*We can pass values to the method parameters, at the method call.

7.Compile time polymorphism is achieved through method overloading.Method overloading means having same method name but 
different parameters since this process is executed during compile time it is known as compile time polymorphism.
*Compile time polymorphism is also known as static polymorphism or early binding.

8.Var-args is a short name for Variable arguments. Variable argument is a method which takes the variable  number of argument.
Argument accept the variable number of values is called varargs.

9.A package is a group of similar types of classes, interfaces and sub-packages.
There are 2 types of packages:
#Built in packages
#User defined packages
Types of imports are 
*Implicit
*Explicit

10.Constructor chaining is the process of calling one constructor from another constructor.
We can achieve Constructor chaining by using
*this() keyword
*super() keyword

11.public class Fibonacci{  
 static int n1=0,
 static int n2=1,
 static int n3=0;    
 static void printFibonacci(int count){    
    if(count>0)````{    		 
         n1 = n2;    
         n2 = n3;   
         n3 = n1 + n2; 		 
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){    
  int count=10;    
  System.out.print(n1+" "+n2);//printing 0 and 1    
  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}  


12.By creating a isListOdd() function it will take list of integers as input and returns true if all the elements in the list
are odd.Otherwise it returns false.


14.Enumeration is a keyword which contains group of constants.
*Enum is used to restrict the data.
Ex:Human beings are categerised as Male,Female,others.

15.When we create an object JVM searches the file system for the definition of the class.

16.Members of classes are:
*Variables
*Methods
*inner class 
*constructor
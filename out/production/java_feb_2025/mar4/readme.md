## Recap 


1. arrays 
2. stack and heap memory 
3. static keyword , static block, instance block, static method 


static and instance block ?

static method ? 
why main method is static 

class Test {


Test t = new Test();

t ----> stack 
new Test()  ---> Heap 
}


static stores 
Method area 
java 8 + ----> Meta space


## Array 
types of array 
1. Single dimension
   2. Multi dimension array 

                    0       1           2   
int[] arr = {{10,20,30}, {40,50,60}, {70,80,90}};


int[][] arr = new int[3][3];
arr[0][0] = 10;
arr[0][1] = 20;
arr[0][2] = 30;
arr[1][0] = 40;
arr[1][1] = 50;
arr[1][2] = 60;
arr[2][0] = 70;
arr[2][1] = 80;
arr[2][2] = 90;


## Strings 

String is sequence of characters
Strings are immutable 


what is a string ? 
1. character array 
2.  String is a class 
3. Non primitive data type 


immutable  - we can change/modify existing string objects 


1. Using String literal 

String name = "Pragra";

String myName = "Pragra";

String company = "Pragra";



2. new keyword 
String name = new String("Pragra");
























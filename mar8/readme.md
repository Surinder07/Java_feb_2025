## Recap 


1. Strings 
2. memory - stack / heap 
3. Arrays - 1d and 2d array 


explain 

String s = "Pragra";  // String constant pool 
String s1 = new String("Pragra");
in terms of memory 


2. why Strings are immutable 

Mutable String s





## Basic Programming
30 mins - Test [MCQ ] - doubts 
Data types 
Opearators - Arithmetic, Logical [&& , || , !] , Comparison(> <  >= <=)
Loops 
if else 
switch case 
break  , continue 

class and Objects 

Constructor 
this keyword 
static keyword - method, block, instance block , 
Memory - heap and stack
Arrays - 1d 2d arrays 
Strings  

## Object Oriented Programming 


Object ? real world entity - physical entity 
class : Logical Entity 

Animal is class 
Dog and cat are objects 

            Animal 

          |             |
        Dog             Cat





            Dog
        |           |
        labrador        pitbull


        Bank
Account 


## Pillar of OOP
1. Inheritance 

        something which can be inherited from previous generation 

        Iphone X  - Face id, iOS - [features - abc] , calculator, calls
                    imesssage , findMyLocation, Camera - 5MP 
        
        Iphone 14 - Face id, iOS - [features - pqr] , scientific calculator, calls
                    imesssage[emojis] , findMyLocation, Camera - 8MP

        Iphone 16 - Face id, iOS - [features - xyz] , scientific calculator, calls  
                    can be recorded
                    imesssage[emojis] , findMyLocation, Camera - 13MP
            
reusability 
Previous features were also reused and added back so that we dont have write the coede for it 
again and again 


2. Polymorphism

Poly - many 
morphism - forms 

one thing could behave differently in diff situation. 

            insulators     - rubber, wood
            Semiconductors - in some scenario they conduct elect, in some they restrict
            conductions    - silicon, iron, water 

            Method will behave diffrenlty in diff situaions 

Method overloading  - Compile time Polymorphism  
-   
- sum(10,20,10)      -
sum(int a, int b); 

sum(int a, int b, int c)


# Method Overriding -  Runtime Polymorphism  


3. Abstraction - [Hiding the complex details] from the user and only showing whatever is necessary . 


 abstract - some form of idea , overview 
CAR ------> you need to learn how engine  works to drive car 


Mobile phone. 



4. Encapsulation

wrapping up the data into single unit 

you are only allowing user to access the data which you only want them to access 

Whatspp ---> status ----> number of users who can see the status 

Profile - lock your profile 
friend list - you can not access 




Data hiding - Abstraction/ Encapsulation



## Inheritance - 


inheriting the properties of the parent class 

         Mobile    - Parent class / Super class / Base class
            
            |

         SmartPhone  - Child class / Sub class  / Derived class 


[Multi level inheritance is not supported in Java directly ]


Single
A
|
B


Multi level
A
|
B
|
C

Multiple inheritance- 
[not supported in Java classes directlty ] - interfaces[which supports it ] 
          
Camera    Calculator    MusicPlayer
      |      |        |
         Smartphone[Iphone/Samsung]
            
                  






























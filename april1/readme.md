##  Recap 

Wrapper classes 
Autoboxing 
unboxing 


## Immutable classes  :
we can not modify it 

all the wrapper classes
Integer 
Double 

String are immutable ?
why Strings are immutable ? 


# How to make a class immutable 
class final 
all the fields should be private and final 
no setter methods. 
equals and hashcode implemented


Strings

string constant pool 
1. Literal   - String s = "Pragra"; // where? SCP inside the heap 
2. New keyword  - String s1 = new String("Pragra"); // inside the heap memory but outside scp. 


Character array. 
sequence of characters. 


Intro to Collections
Equals and Hashcode 

## Generic Classes 

type safefy and flexibility to work with any type 

## Maven  - Project management tool/ Build tool
mvn clean 
mvn clean install 
mvn package 
mvn test 


## Lombok 
reduce the boilerplate code. 
@Annotations. 


File Handling : Skip-Optional 


@RequiredArgConstructor



##  Collection  - 60% interview 

1. List<E>
            - ArrayList
            - LinkedList 



## ArrayList 
internally its backed by Array
its dynamic in nature. 

elements are stored in order of insertion
it also allows duplicate elements 
null is also supported.


int[] arr = new int[5]; // size = 5



## Internal Implementation of arraylist
//  Java 7
/*
        List<Integer> list = new ArrayList<>();
        a default array of size 10 is created
        // threashold   // Load Factor.  : 75%

        need to create a new array
        of size

      10 + 10/2 + 1     = 16
        n + n/2 + 1


new array of size 16 is created.


if we know the size = array
if we dont know the size , its gonna grow dynamically = arraylist

         */






// Java 8

       //  List<Integer> list = new ArrayList<>();
        /*

        ## Lazy Initilization of arrayList
        array of size 0 is created.
        when you insert first element
        then array of size 10 will be created.

         */


































12-04-2022
=========
java is an object oriented programming.

Everything is an Object in java.

java (oak) is developed by james gossling.

To develop java applications we need JDK installed , any IDE.

To check whether java is installed or not use command called  java -version

Components of JDK
===============

JDK=JRE+JVM

JRE= java runtime environement. it contains JVM  and other libraries and helps to run java program

JVM= java virtual machine. it actually run byte code.

Every Java program has an extension .java

HelloWorld.java ---> when you compile java file--> generate .class file (.class file contains byte code )

If you want to run java program you need to set PATH in environement variables.

we need to set PATH; (it is used to specify where java is installed in ur machine)

After setting path : we use java -version command to check whether PATH set correctly or not.


==================================

public class HelloWorld{

public static void main(String[] args){

System.out.println("hello world");

}

}

public : from any where we can access.
HelloWorld: java class name
class : to create a java class
static: without creating object we can access this  method.
void: method is not returning a value
main : name of the method.
String[] args= during program execution if you want send some data, then that data we store in args.
System.out.println() : to print data on to the console.

to compile java program
==================

javac HelloWorld.java    (.class file will generate)

to run java program
=================

java HelloWorld 


IDE (Integrated Developement Environement)
================================
Eclipse
Intellij
Netbeans
notepad
notepad++

java versions:
============
jdk 1
jdk 2
jdk 5 --
jdk 7 --
jdk8 --
jdk 11 --
jdk 17 --
jdk 18  leatest version

to know which version of java is installed :
===============================

java -version

packages:
-------------
package: a package is a group of related classes or interfaces.

syntax : package pacakage_name;

			com --> commercial
			com.scb.retail.transactions;
			
			org.springframework.something.something;  --> open source
			
purpose : to resolve naming conflicts:

      example : Date class is present in two different packages (java.util, java.sql)
	  
=============== 13-4-2022 =======================

Data Types:

data: any information is called data.

example: name, salary, department,college etc.

each data has a type, which specifies what data it contains.

  age: 10
  name: characters
  money$: 12.9 rupees (decimal point)
 
 In Java data types are divided into 2:
 
 1. primitive:
		
		int,byte,short,long,boolean,float,double,char. (system defined)
		
 2. non-primitives: 
	
		array,String, all java classes  (user defined),interfaces.
 
in java if we want to store some data then we create a variable and we store the data in that.
each data has a data type.

variable: is a name given to a data , so that we can reuse in program.

syntax: access-specifier datatype variableName; // declaration of varaible
 
 access specifiers
 =============
 public
 private
 protected
 default
 
 comments:  2 types
 ========
 1.   // single line comment
 
 2.
 /* multline comment 
  my comment
  my comment

 */
			variableName=some value: assignment , we use = operator for assignment;
			
			Example: int number; //declaration
						   number=100; // assignment ( assigning a value to a varaible)
						   int x=10; intialization
						   
data type range:  Each data type has a range.

container example: 1 liter milk

byte -127 to 128

byte y=105;


======================================================
Data Type 		Size 						Description
======================================================
Number
======
byte 				1 byte 					Stores whole numbers from -128 to 127
short 			2 bytes 				Stores whole numbers from -32,768 to 32,767
int 				4 bytes 				Stores whole numbers from -2,147,483,648 to 2,147,483,647
long 				8 bytes 				Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

with decimal points:
float 				4 bytes 				Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits 14.9666666
double 			8 bytes 				Stores fractional numbers. Sufficient for storing 15 decimal digits 14.56848584594549574

boolean 		1 bit 						Stores true or false values
char 				2 bytes 				Stores a single character/letter or ASCII values   'y'
=======================================================

Example:
======
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String


Java Operators:
===========

Operators are used to perform operations on variables and values.

int x = 100 + 50;   // performing operations on values.

int sum = a + b;   // performing operations on variables.

Java divides the operators into the following groups:

=>    Arithmetic operators
=>    Assignment operators
=>    Comparison operators
=>    Logical operators

===========================================================
Operator 		Name 				Description 										Example   ||
===========================================================
+ 					Addition 			Adds together two values 							x + y 	
- 					Subtraction 		Subtracts one value from another 				x - y 	
* 					Multiplication 	Multiplies two values 									x * y 	
/ 					Division 			Divides one value by another 					x / y 	   10/3 3
% 				Modulus 			Returns the division remainder 					x % y 	10%3=1
++ 				Increment 		Increases the value of a variable by 1 		++x 	
-- 					Decrement 		Decreases the value of a variable by 1 		--x
===========================================================

Assignment operators are used to assign values to variables.

int x = 10;

we use the assignment operator (=) to assign the value 10 to a variable.

Comparison operators are used to compare two values:
-----------------------------------------------------------
Operator 	 Name 								Example   x=10,y=10
-----------------------------------------------------------
== 			Equal to 								x == y 	   true
!= 			Not equal 								x != y 	     ?
> 				Greater than 						x > y 	     ?
< 				Less than 								x < y 	
>= 			Greater than or equal to 		x >= y 	
<= 			Less than or equal to 			x <= y
====================================

Java Logical Operators
==================
Operator 			Name 				Description 														Example 
=============================================================================
&&  				Logical and 			Returns true if both statements are true 					x < 5 &&  x < 10 	  ?
||  				Logical or 				Returns true if one of the statements is true 				x < 5 || x < 4 	     ?
! 					Logical not 			Reverse the result, returns false if the result is true 	!(x < 5 && x < 10)   ?
==============================================================================

==========14-4-22===================================
Java Conditions and If Statements:
===================================================
Java supports the usual logical conditions from mathematics:
    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to a == b
    Not Equal to: a != b

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

    Use if to specify a block of code to be executed, 
				if a specified condition is true
    Use else to specify a block of code to be executed, 
				if the same condition is false
    Use else if to specify a new condition to test, 
				if the first condition is false
    Use switch to specify many alternative blocks of code to be executed
	
Syntax:
----------
if(condition)  // here condition is type of boolean

{
//Set of statements//
}
else
{
//set of statements
}

Notes:

writing else is not mandatory,we can add it as per our requirement.
- condition type must be boolean
- if we have only one statement inside if { } then we can skip/omit flower brackets
- when if is true else will not be executed

1. WAP to check whether 10 and 20 are equal or not
2. WAP to check whether 10 is positive or negative
3. WAP to check whether yogi is eligible to cast a vote or not, yogi's age 21
4. WAP to check whether 22 is divisible in 4 or not
5. WAP to check whether 32 is even number or not
6  WAP to find greatest of 3 numbers a=10,b=27,c=6.
7. WAP to check whether a person is a valid voter or not.
8. WAP to check a number is even or not.
9. WAP to check a number is positive or negative.


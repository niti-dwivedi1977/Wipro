Fundamentals and basics of java
features of java
normal program , data types (P / NP) Casting
loop / Switch case 

Control Statements

Switch statement
Menu driven program

switch statement in java is used to select one of the many code blocks to be
executed. The value of the expression in switch case in java will be compared
with the values of each case.

If conditions 
if else statement
nested if (age, weight)
if else if statement
for loop
while loop
do while
break & continue

String is an important concept or plays an important role 

first of string has it's own pool or memory . String class
is used for creating and manipulating strings

concat(), length() , compareTo()  , equals()
char is a primitive data type - one character 

char[] ch = {'N','I','T','I'}.

String stdName = "Niti";   heap // String constant Pool

String object can be created via two ways

a) String Literal
b) new Keyword


OOPS -> object oriented programming  

In Java we start the program with class / everything is inside the class. Blueprint 

Object --> We deal with the class members or access the data members via object.
mapped with the real world .....

modular approach where data and functions can be combined into a single unit known as an object.

OOPS provides different properties/ pillars 
a) Inheritance
b) Polymorphism
c) Abstraction
d) Encapsulation

access specifiers / Modifiers(Visibility mode of variables , class or methods

a) private -- class cannot be private ,protected 
b) public -- open for all 
c) protected -- open for only child members
d) default -- within

Inheritance :

It's a mechanism of deriving one class from another class which allows the derived class to inherit features from a parent class, (features includes attributes and methods)

Reusability 

Employee (Base):  name, salary , companyname 
Manager (child): name , salary , reuse the companyname variable from Employee class

base  -   derived /child 
parent  - child
super -   child 

Types of inheritance :

a) single inheritance  : A -> B
b) Multilevel :  A -> B -> C
c) Hybrid :  Mixing 
d) Heirarchical : A ->
                 B & C


WAP on inheritance where there is a base class as Employee and two child classes full time employee and part time employee inherited the parent class some of the properties like organization name , salary which is set by the hr based on some
criteria he will be getting extra incentive :
if salary >10K then incentive will be 1k
if salary <10K then there will be no incentive 

part time employees will not be getting any incentive.


DATA is important so for that we need to secure Encapsulation /Abstraction -- > Data Hiding

Encapsulation: is a technique of making the fields in a class private and providing access to them via 
public methods . It restricts direct access , data members and protects or secure the data by providing
some validation to the users .

Benefits:

Improved Maintainability 
Enhanced security
Controlled Access
Flexibility and Reusability


1. declare all the attributes of a class as private.
2. provide a public getter and setter methods to access and modify the fields.


for eg:

Medical Records of the patients needs to be encapsulated


Banking system 


Abstraction :hiding the implementation details and showing only the functionality to the user.
It just focusses on what the object does instead of how it does.

Abstraction can be achieved by using abstract classes and interfaces .. (Multiple inheritance)

Benefits :
 reduces complexity
 Improves code readability
 Enhances maintainability
 code reuse
 
Difference between abstract and interface
1. abstract : it contains both abstract or non-abstract methods
while interface contains only abstract methods if required then static or default method can be there

2. abstract class contains class instance variables but interface contains only final or static variable


3. Multiple inheritance can be achieved by an interface but not by abstract class

4. Methods are implicitly public in an interface but in abstract it may have any access modifier

5. Abstract may have constructors but interface cannot have constructor


POLYMORPHISM  : Many Forms

One method is performing many roles


doPayment() Polymorphism --->  client  --> via cash , or via credit , neft

Employee -- Developer , Testing

Overloading (in one class you have created  many methods with same name with different signatures , compile time -- Static Polymorphism

class Transaction
{

private int transactionid;


void doPayment(int orderno , String address)
void doPayment(int orderno. , int cardno)
void doPayment(int orderno. , int accno, String Bankname)
void doPayment(String address,int orderno)
void doPayment(String address,String orderno)


}

overiding --- Inheritance there we have same method needs to be overridden in a child class with the same signature .. at Run time -- Dynamic Polymorphism
class Employee
{
    doBonus(String position)
    {
    
    }

}


class Developer extends Employee
{

doBonus(String position)
{
bonus=20000

}

}

class Tester extends Employee
{

doBonus(String position)
{
bonus=10000

}

}

class Main
{

Employee = new Developer("Niti");
Employee = new Tester("Niti");

}

compile time errors -- syntax errors  /   runtime errors     errors & Exceptions
Exception Handling  : --  handle runtime errors , ensuring the normal flow of the application . 
when an exception occurs, the normal flow of the program is disrupted  and the runtime system searches
for an appropriate exception handler .

Types of Exceptions:

Checked Exceptions -- compile time -- try / Catch block , throws / 
Unchecked Exceptions - Run time exceptions

Arithmetic exceptions , nullpointerexception

Errors - outofmemoryerror , stack

 

Keywords we use in exception handling


try --- peice of code / logic  try{ c=a+b} -- critical statements 

immediately after try block you have to define either one or many catch block or finally block

catch ---   catch the exception -- use to gracefully catch the exception and display the message 
finally  --- this block will execute no matter there is any exception or not

Array : holding similar data type of values/collection  , static in nature 

int arr[] = new int[5];

primitive type ==   int i = 20;

class type  ==  group of primitive type of data (int, string , boolean)

array - -- searching  sorting / adding - manipulation was quite difficult

Collection : -- Java framework , provides an architecture to store 
and manipulate a group of object : dynamically , size is allocated dynamically.

core java J2SE-- window based applications -- jar  --api --JVM

framework -- collection
J2EE -- web based applications  -- war -- api -- 

frameworks

Spring /  Spring boot  -- IOC container/  Hibernate

In sql --  (database)

1) Database -- it's a collection of tables 

2) table --- Collection of records in the form of rows and columns

3) record -- collection of data of a particular entity (Niti - 35 -- 

class Employee
{
String name;
int age;
String designation;

}

























 









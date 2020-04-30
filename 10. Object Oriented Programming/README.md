# Object Oriented Programming

Object Oriented Programming is at the heart of Java. OOP uses object which have certain data/attributes called the state of the object and certain member functions called the actions performed by the object. The object entities sometimes correspond to things in the real-world and the relations between them. For example, all humans have name, age & sex and we perform actions such as eating, walking and sleeping. Like humans, each object might have different attributes or a different state, but each can perform the same functions. A class provides the attributes and available actions for an object. It serves as a blueprint for each object instance. We can call Homosapiens as the class and each human as its object. 

4 basic pillars of OOP are Inheritance, Encapsulation, Polymorphism and Abstraction. Inheritance is deriving properties from a super class, just like all humans are mammals. Encapsulation means bundling of the data and and functions that operate on them. Polymorphism allows us to perform different operations using the same interface, just like humans walk for movement while whales swim for movement. Abstraction means hiding the implementation details and only showing the relevant and simple interface.

### TigerRunner Output
```bash
Food Eaten!
Prey: Deer
Animal Details ->
Name: Tiger
Age:  10
Has Tail: true
Food Habits: CARNIVORE
Species: Bengal Tiger
Last Prey: Deer
ROARRRR!!!!
```

A class is created in Java using the class keyword. All classes which don't inherit any class, inherit the predefined Object Class by default. It is best practice to keep all state variables with private access and implement public getter and setter functions to access them as it allows us to define certain checks on data manipulation and avoid unwanted changes. In the Animal Class, we checked if age was valid or not, and only then allow any changes.

Enumeration is a data type used for denoting fixed constants. We generally use enumerations when we don't expect the value to change and are fixed. They are created similar to a class, using the keyword **enum**. Here we use enums to specify the different eating habits of animals which are known to be fixed. Some other uses of enums could be to store the months of the year, days of the week and sex of a person. 

The Tiger Class inherits from the Animal class and adds extra states and actions such as roar. This action is unique to the Tiger and hence a subclass was made. This helps reduce code redundancy in the Tiger Class. The eatFood() method performs different actions depending upon whether a string argument is entered or not. In this way we can implement polymorphism in Classes. 

Each class has a Constructor which is defined as a function with its name equal to the class name and no return type. It gets executed whenever a new class object is created. We can also have various implementations of the Constructor, similar to the eatFood() method depending upon the type of argument. Also, note that we have to call the constructor of the parent class before the constructor of the child class is executed. Java provides a default constructor which excepts no argument and initialises all states with a 0 or a null value. If we create a custom constructor for a class, then Java doesn't create any default constructor.

## Abstract Class

An abstract class is declared with the abstract keyword in Java. We usually specify abstract member functions inside an abstract class which are not implemented. An abstract class cannot be instantiated and it must be inherited in another subclass where all its abstract methods are implemented. It is possible to have abstract or non-abstract methods in an abstract class along with data members. These classes help deploy a common functionality across all the inheriting classes. 

Abstract class denotes an **IS-A relationship** between itself and the inheriting classes.

Device class acts like a template for all devices to be made and ensures that all devices implement a switchOn() and a switchOff() method.

MediaPlayer inherits Device class and provides its own implementation of all its abstract methods. 

### MediaPlayerRunner Output
```bash
Player turned On!
Player turned Off!
```

An instance of the MediaPlayer class can also be access by a variable of its Parent Class type. This is useful when we want to access objects of all classes inheriting the abstract class using a single variable. When we call the abstract methods from this variable, they would behave differently for different classes. This is called as **runtime polymorphism**.

## Interface

An interface represents what actions must be done by an object. It represents a blueprint for a class. It is used as a contract between developers while using different Classes on how certain objects must behave. It is practically helpful in establishing common method names across similar classes and establishing a common usage protocol. Interfaces help achieve abstraction in Java.

An interface can contain any number of methods. We cannot create its instances. All the methods inside an interface are abstract and must be implemented. It is only possible to have static final variables in an interface. We can provide a default implementation for a method in interface by using the default keyword. If we don't override this method in the implementing class, then the default method is run.

Interfaces help us in tackling the lack of multiple inheritance in Java. A class can implement more than one interfaces. However, interface musn't be confused with a class. It doesn't reflect an **IS-A relationship** between the implementing class and the interface, rather it reflects a feature of the class/how a class works.


### BluetoothRunner Output
```bash
Connected to OnePlus
File sent successfully!
File received successfully!
Disconnected OnePlus
```

Just like with abstract classes, we can use a variable of the interface type to access different implementing classes thus allowing runtime polymorphism.
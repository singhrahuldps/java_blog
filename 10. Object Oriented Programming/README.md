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

The Tiger Class inherits from the Animal class and adds extra states and actions such as roar. This action is unique to the Tiger and hence a subclass was made. This helps reduce code redundancy in the Tiger Class. The eatFood() method performs different actions depending upon whether a string argument is entered or not. In such way we can implement polymorphism in Classes. 

Each class has a Constructor which is defined as a function with its name equal to the class name and no return type. It gets executed whenever a new class object is created. We can also have various implementations of the Constructor, similar to the eatFood() method depending upon the type of argument. Also, we note that we have to call the constructor of the parent class before the constructor of the child class is executed. Java provides a default constructor which excepts no argument and initialises all states with a 0 or a null value. If we create a custom constructor for a class, then Java doesn't create any default constructor.


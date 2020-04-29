# Non-Primitive Data Type

Non-Primitive Data Types are also called as Reference Data types as they themselves don't store the data but store the pointer to the data in Stack memory. The main data is generally stored in the Heap memory.

Primitive data types are predefined in Java whereas we can create custom Non-primitive data types of our own. Reference data types may also contain certain methods to operate on the data. These can also be initialized as null. The size of all Non-Primitive data types stored in stack memory is same because they all store an address pointer.

The types of Non-Primitive Data Types available are:

* **String**

  It is a class which stores a sequence of characters(char). String objects are immutable and also have many helper functions to perform operations on the string data.

### StringClass Output
```bash
null
This is a string.
THIS IS A STRING.
```

* **Array**

  Arrays are a data structure which stores homogeneous objects or the objects of the same type together in an ordered manner. Array objects can be accessed by their index. 

* **Class**

  A class in Java is used to implement the Object Oriented Paradigm. It is basically a blueprint of the object and defines some data and methods and the relation between them. It can also be used to create our own custom data types in Java.

  For every primitive data type in Java, we have a special Wrapper Class which helps us perform additional operations through predefined methods. These classes have the same name as the primitive data type with their first alphabet capitalized. Only exception is Character class for char.

### WrapperClass Output
```bash
null
10
false
```

* **Interface**

  An Interface is like a contract which enforces that certain methods be defined in the Class implementing that interface. It allows us to establish a standard protocol of usage while creating and using classes. It specifies what a class must do but doesn't provide us with the exact implementation.

We will learn more about Arrays, Classes and Interfaces in the later topics.
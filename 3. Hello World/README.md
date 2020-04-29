# Hello World

The first program we would write in Java would simply output the phrase "Hello World!".

Each executable java program is mainly written as a class which has a main() method that gets executed first whenever we run the program. The name of the Java file must be the same as the Class name. In Java, we preferably use the camel-case convention.

In the class definition we first specify the package of the class. A package is a collection of related classes which are intended to perform a similar logic, hence they are packed together in the same directory.

The main method is given public **access specifier** so that it could be accessed by those trying to run the program and a static **access modifier** so that the it could be run without creating an instance of the class. I recommend reading up about other access specifiers and access modifiers. Main method has void **return type**, thus it doesn't return a value.

To output to console, we use the System class and it's System.out.println() method which prints the argument along with an additional new line character. The System class is one of the few classes imported by default in any java class.


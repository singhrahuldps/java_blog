# Methods

A method runs a block of code whenever called. It helps reduce code redundancy. In Java, methods are defined inside classes.

### Syntax
```bash
access-specifier access-modifier return-type method-name(parameter-list, data-type... var-name){
	statements;
}
```

Each method in a class must have a unique name. Access specifiers decide from where we can access the method. Non-access modifiers add certain characteristics to the method. These specifiers and modifiers can also be used for member data variables. For more details on different access specifiers and non-access modifiers, go to these links[[1](https://www.geeksforgeeks.org/access-modifiers-java/),[2](https://www.tutorialspoint.com/java/java_nonaccess_modifiers.htm)].

For a given return-type, every function must return a value of that type except for void which requires no return value. 

Parameters can be a single parameter or several comma separated parameters. It allows Java to know what type of data to expect for the method. If we expect a list of elements but with unknown size, we can use variable arguments to accept such data. This is shown as var-name in the given syntax. However remember that variable argument must be the last argument inside the function.

Static methods can be accessed without creating an object instance of the class, however to access non-static methods we must use the class object using the dot (.) operator. We've been doing the same for all predefined Java classes till now.

### Methods Output
```bash
96.33333333333333
```
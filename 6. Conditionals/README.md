# Conditionals

Whenever we compare two values or evaluate expressions or check conditions, Java stores the result as booleans, i.e. true or false. This allows us to establish control flow by producing different outcomes depending upon these boolean results. Java uses three different types of conditional statements:

## If-Else

It allows us to check for various conditions using else if clause. 

### Syntax
```bash
if(condition1){
	statements;
}else if(condition2){
	statements;
}else{
	statements;
}
```

Once a true condition is met, we stop checking for further conditions and if no condition is true we execute the else code block. 

### IfElse Output
```bash
Enter first number
5
Enter second number
6
Enter the operation to perform (+,-,*,/)
+
11.0
```

The Scanner class is used to scan any stream for inputs and allows us to access it through method functions. We used the System.in stream to check for inputs. We must always be vigilant to close the scanner after use otherwise it will lead to resource leakage as it will not be collected by the Java Garbage collector.

## Switch

Switch provides a more intuitive approach to check for conditions. 

### Syntax
```bash
switch(variable){
case value1: //statements
		break;
case value2: //statements
		break;
	default: //statements
}
```

Whenever the value of the variable matches that given in respective case, execution begins and all the subsequent lines below it are run. It won't check for the condition again. However this leads to unwanted output. We can control this behavior by putting break statement after each case. If the variable matches no case, then the statements following the default tag are run. 

### Switch Output
```bash
Enter the code for the day of the week (1-7)
9
Invalid Input
```

## Ternary Operator

It is a re-factored if-else statement. It helps us to write one-line if else statements.

### Syntax
```bash
variable = condition ? value1 : value2;
```

If the given condition is true, then value1 is assigned to the variable, otherwise value2 is assigned.

### Ternary Output
```bash
true
```


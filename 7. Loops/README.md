# Loops in Java

Loops are generally used to execute a block of code multiple times. It helps to reduce the amount of written code required to run the logic and also allows us to repeat code when we don't know how many times it is to be repeated.

We introduce the four basic loops in Java i.e. For loop, Enhanced-For loop, While loop & Do-While loop.

Each of these loops have a different syntax and it is advised to use each for different use cases however any loop implementation could is possible using any of these loops. They could also be used interchangeably but it is not advised to do so.

## For Loops

This loop is used to execute a block of code a known set of time.

### ForLoop Output

```bash
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

### Syntax

```java
for(initialization; condition; increment/decrement){
	statements;
}
```

This is used when we know the starting and ending conditions of the loop. Initialization is ran only once at the beginning of the loop and then the condition is checked. If found to be true, the following code block is executed. After that the increment/decrement operation is performed and then the condition is checked again. This task is repeated until the condition becomes false.

## Enhanced For Loops

This loop is a simpler variant of the classic for loop and it enables us to easily iterate over list elements.

### EnhancedForLoop Output

```bash
Rahul
Virat
Sourav
```

### Syntax

```java
for(DataType var:list){
	doSomething(var);
}
```

We can traverse over a List elements easily through this enhanced for loop. The variable var refers to each element of list sequentially and allows us to perform the desired operations on them.

## While Loops

It is used to execute a block of code repeatedly when we are not sure about how many iterations need to be done.

### WhileLoop Output

```bash
1 3 5 7 9 11 13 15 17 19 
```

### Syntax

```java
while(condition){
	statements;
}
```

At the beginning of the loop, the condition is evaluated and if found to be true, the following code block is evaluated. This action is repeated while the condition remains true. The loop terminates when the condition becomes false.

## Do-While Loops

This loop is used whenever we want the loop to be executed atleast once.

### DoWhileLoop Output

```bash
Enter first number: 
5
Enter second number: 
12
Sum is 17 
Press 1 to add more numbers, 0 to exit: 
0
```

### Syntax

```java
do{
	statements;
} while(condition);
```

The body of a do-while loop gets executed atleast one time and then the condition in while is checked. This block gets executed again if the expression in while is evaluated to be true and it keeps on repeating until the condition is false.
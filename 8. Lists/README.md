# Lists

Lists are used to store data of same logic and same data type together. It is a collection of closely related data. Arrays are a reference data type and can be based upon any data type. 

We can create arrays by using a square bracket ([]) after the declaration of data type. Such arrays have a limited functionality because we can only modify their values, but no new elements can be added or removed. We can access elements by the array name followed by the index of the element in square brackets. Putting in an index value greater than array size throws an error.

### Lists Output
```bash
20 21 22 23 24 
95 95 98 95 96 
```

We can use the ArrayList class provided by Java to create mutable lists. This class provides us the ability to add/remove elements to the list but it comes at the cost of added time complexity. Many other classes such as Vector & Stack also implement the List interface and can be used whenever suitable. Vector is similar to ArrayList but all it's methods are synchronised hence thread safe.

### ArrayListClass Output
```bash
[Rahul, Virat, Sourav, Rohit]
[Rahul, Sourav, Rohit]
```

The ArrayList and Iterator Class use **Generics** to make it possible to create a list and iterator of any desired data type. We specify the data type here in <> as ArrayList<String> to create a list of strings. We can also create a list of our own custom classes. We would learn more about Generics in later topics.
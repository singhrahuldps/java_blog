# Primitive Data Type

Java is a static language, which means that we must declare the variable data type before creating it.

### PrintData Output
```bash
The details are: true, 18, 50000 D
```

Java supports 8 predefined data types called primitive data types:
* **int**: It is a 32-bit integer value which has a minimum value of -2<sup>31</sup> and a maximum value of 2<sup>31</sup>-1. We can also use octal or hexadecimal number systems as integers which can be specified by starting the value with "0" or "0x" respectively.
* **byte**: It is an 8-bit integer value which has a minimum value of -128 and a maximum value of 127. It is useful to save memory when storing numeric codes, age etc in large arrays.
* **short**: It is a 16-bit integer value which has a minimum value of -32,768 and a maximum value of 32,767.
* **long**: It is a 64-bit integer value which has a minimum value of -2<sup>63</sup> and a maximum value of 2<sup>63</sup>-1.
* **float**: It is a 32-bit floating point value with precision up to 6-7 decimal points.
* **double**: It is a 64-bit floating point value with precision up to 15-16 decimal points.
* **boolean**: It has only two possible values, true and false. Used to store conditional results or flags.
* **char**:  It is a single 16-bit Unicode character.

All these values default to a 0 value or a false value. However the Java compiler doesn't initialize the local variables.

### TypeCasting Output
```bash
Original integer      : 1000
Narrow casted to byte : -24
Wide casted to double : 1000.0
```

 Java allows us to Type Cast(or Convert) one type of data to another data type. Whenever we convert from a data type with shorter memory size to a data type with larger memory size, it is called as Widening type casting and no data loss takes place. However, the vice-versa is called Narrowing type casting and data loss may take place.

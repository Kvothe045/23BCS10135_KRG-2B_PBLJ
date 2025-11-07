# JAVA NOTES

## Typecasting in Java

### Implicit Typecasting
When you type cast from a lower data type to a larger one, there is no chance of data loss, so the compiler can do the typecasting automatically.

```java
// Example of implicit typecasting
int a = 10;
long b = a; // int to long, implicit typecasting
```

### Explicit Typecasting
When you type cast from a larger data type to a lower one, there is a chance of data loss, so you have to do the typecasting manually.

```java
// Example of explicit typecasting in Java:
double x = 9.78;
float y = (float) x; // double to float, explicit typecasting

float num1 = 134.6f; // 'f' indicates a float literal
int num2 = (int) num1; // float to int, explicit typecasting
// Note: This will truncate the decimal part, resulting in num2 being 134
```

---

## Static Keyword in Java

**Q) What is the use of static keyword in Java?**  
**A)** The `static` keyword in Java is used to indicate that a particular member (variable or method) belongs to the class itself rather than to instances of the class. Static members can be accessed without creating an instance and are shared among all instances of the class.

---

## Static vs Non-Static Methods

**Q) What is the difference between static and non-static methods in Java?**

### Static Methods
- Belong to the class itself, not to any specific instance.
- Can be called without creating an instance of the class.
- Can only access static variables and static methods directly.
- Cannot access instance variables or instance methods directly.

### Non-Static Methods
- Belong to instances of the class.
- Must be called on an instance of the class.
- Can access both static and instance variables and methods.

---

### Example

```java
public class Example {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
    public static void main(String[] args) {
        Example obj = new Example();
        Example.staticMethod(); // Calling static method without instance
        obj.nonStaticMethod();  // Calling non-static method with instance
    }
}
```
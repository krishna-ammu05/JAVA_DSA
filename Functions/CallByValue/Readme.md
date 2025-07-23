# 🔁 Call by Value vs Call by Reference in Java

Understanding how Java passes data to methods is important for writing bug-free code.

---

## 📘 1. Call by Value

### ✅ Definition:
In **Call by Value**, **a copy of the actual value** is passed to the function. Changes made to the parameter inside the function **do not affect** the original value.

### 📙 Meaning:
- Java **always** passes **primitive data types** (like `int`, `float`, `char`) by value.
- Any changes to parameters are made on a **copy**, not the original variable.

---

### 💡 Example: Swap Using Call by Value

```java
public class CallByValueExample {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap() → a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before swap() → x: " + x + ", y: " + y);
        swap(x, y);
        System.out.println("After swap() → x: " + x + ", y: " + y);
    }
}
### Output
Before swap() → x: 5, y: 10  
Inside swap() → a: 10, b: 5  
After swap() → x: 5, y: 10


# 🔁 Call by Reference in Java (Simulated with Objects)
# 📌 What is Call by Reference?

---

## ✅ Definition

**Call by Reference** means passing the **memory address (reference)** of a variable to a method so that changes affect the original object.

> ⚠️ In Java, object references are passed **by value**, but the method receives the reference to the object, which allows modifying its contents.

---

## 📙 Meaning

- Used with **objects and arrays**.
- Java passes a **copy of the reference**, so both caller and method refer to the **same object**.
- **Fields (data members)** can be modified inside the method.
- Reassigning the object itself does **not affect** the original reference.

---

## 💡 Example: Call by Reference (Simulated in Java Using Objects)

```java
class Numbers {
    int a;
    int b;
}

public class CallByReferenceExample {
    public static void swap(Numbers obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("Inside swap() → a: " + obj.a + ", b: " + obj.b);
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.a = 5;
        num.b = 10;

        System.out.println("Before swap() → a: " + num.a + ", b: " + num.b);
        swap(num);
        System.out.println("After swap() → a: " + num.a + ", b: " + num.b);
    }
}

## 💡 Output
Before swap() → a: 5, b: 10  
Inside swap() → a: 10, b: 5  
After swap() → a: 10, b: 5

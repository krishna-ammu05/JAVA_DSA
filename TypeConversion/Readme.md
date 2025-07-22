# 🔁 Widening Type Conversion in Java

## 📌 Definition
**Widening Type Conversion** (also known as **Implicit Type Casting**) in Java is the automatic conversion of a **smaller data type to a larger data type** by the compiler.  
It is safe because no data is lost, and no explicit casting is required.

---

## 🧱 Format
```java
largerType variable = smallerTypeValue;
byte → short → int → long → float → double
          ↑
        char
###h3 example:byte to double
public class WideningExample {
    public static void main(String[] args) {
        byte b = 25;           // 1 byte
        short s = b;           // byte → short
        int i = s;             // short → int
        long l = i;            // int → long
        float f = l;           // long → float
        double d = f;          // float → double

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}

### h3 Outpt:
byte: 25
short: 25
int: 25
long: 25
float: 25.0
double: 25.0

| From Type | To Type(s)                      |
| --------- | ------------------------------- |
| byte      | short, int, long, float, double |
| short     | int, long, float, double        |
| char      | int, long, float, double        |
| int       | long, float, double             |
| long      | float, double                   |
| float     | double                          |

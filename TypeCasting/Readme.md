# 🔄 Type Casting in Java

## 📌 Definition

**Type Casting** in Java refers to **converting a variable from one data type to another**. It is mainly of two types:

1. **Widening Casting** (Implicit) – Smaller to larger type (Safe)
2. **Narrowing Casting** (Explicit) – Larger to smaller type (Risky, may lose data)

---

## 🧰 Types of Type Casting

### ✅ 1. Widening Type Casting (Implicit)
- Automatically done by Java compiler.
- Converts smaller data type to a larger one.
- No data loss.

```java
byte → short → int → long → float → double
          ↑
        char
 ### Widening (Implicit)
largerType variable = smallerTypeValue;

### Narrowing(Explicit)
smallerType variable = (smallerType) largerTypeValue;

public class NarrowingExample {
    public static void main(String[] args) {
        double x = 123.45;
        int y = (int) x;  // double to int
        System.out.println(y);  // Output: 123 (decimal part lost)
    }
}

<p>❗ Things to Note</p>
<p>Widening is safe and automatic.</p>
<p>Narrowing must be done manually and may cause:</p>
<p>Loss of data</p>
<p>Truncation of decimal values</p>
<p>Overflow/underflow</p>

| Conversion Type | Description             | Example               |
| --------------- | ----------------------- | --------------------- |
| Widening        | Smaller → Larger        | `int → long → float`  |
| Narrowing       | Larger → Smaller (cast) | `double → int → byte` |

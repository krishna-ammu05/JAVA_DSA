# ⚙️ Type Promotion in Java

## 📌 What is Type Promotion?

**Type Promotion** in Java refers to the automatic conversion of **smaller data types to larger data types during expressions** or operations.  
When different types are used together in an arithmetic or logical operation, Java promotes them to a common larger type to avoid data loss.

---

## 🔁 Promotion Hierarchy

Java promotes data types in the following order:

byte → short → int → long → float → double
↑
char


This means:
- `byte`, `short`, and `char` are promoted to `int`.
- If one operand is of a higher type, the other is promoted to match.

---

## 🧠 Why Type Promotion?

- To prevent **data loss** during operations.
- To ensure **type compatibility** in expressions.
- To enable **accurate and consistent calculations**.

---

## 📜 Type Promotion Rules

1. **All `byte`, `short`, and `char` are promoted to `int`** in expressions.
2. If one operand is `long`, the result is `long`.
3. If one operand is `float`, the result is `float`.
4. If one operand is `double`, the result is `double`.

---

## 🧪 Examples

**Example 1: `byte + byte → int`**

```java
public class PromotionExample1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        // byte sum = a + b; // ❌ Error: a + b is int
        int sum = a + b;      // ✅ Correct
        System.out.println("Sum: " + sum);
    }
}
Both `byte` values are promoted to `int`, so you must assign the result to an `int` or use casting.

**Example 2: `char + int → int`**

public class PromotionExample2 {
    public static void main(String[] args) {
        char ch = 'A';  // Unicode: 65
        int num = 5;
        int result = ch + num;
        System.out.println("Result: " + result);  // Output: 70
    }
}
Characters are internally stored as Unicode integers. Any operation with `char` and `int` results in an `int`.

**Example 3: `int + float → float`**

public class PromotionExample3 {
    public static void main(String[] args) {
        int x = 100;
        float y = 25.5f;
        float res = x + y;  // int promoted to float
        System.out.println("Result: " + res);  // Output: 125.5
    }
}
In mixed operations, `int` is promoted to `float`. The result is also `float`.

**Example 4: Manual Casting Required After Promotion**

Even if both operands are of type `byte`, the result is still `int`. You need to explicitly cast the result back to `byte` to store it.

---

## 🔎 Expression Type Promotion Table

| Operand Types       | Result Type |
|---------------------|-------------|
| byte + byte         | int         |
| short + short       | int         |
| char + char         | int         |
| int + long          | long        |
| int + float         | float       |
| float + double      | double      |
| long + double       | double      |

---

## 📌 Type Promotion vs Type Casting

| Feature           | Type Promotion                    | Type Casting                          |
|-------------------|-----------------------------------|----------------------------------------|
| Type              | Implicit (automatic)              | Explicit (manual)                      |
| Direction         | Smaller → Larger (safe)           | Larger → Smaller (may lose data)       |
| Usage             | During expressions                | During assignments                     |
| Example           | `int + float → float`             | `(int) 5.9 → 5`                        |

---

## ✅ Summary

- Type promotion is Java's **automatic way** of promoting types in expressions.
- Used for safe evaluation of operations involving **mixed types**.
- All arithmetic with `byte`, `short`, or `char` promotes them to `int`.
- Prevents data loss and maintains **type safety** in operations.

---

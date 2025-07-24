# 🧠 Java Scopes: Block Scope, Method Scope, and Class Scope

Understanding variable scopes in Java is essential for writing bug-free and modular code.

---

## 🔒 What is "Scope"?

> Scope refers to **where a variable is accessible or visible** in a Java program.

Java has three main types of variable scopes:
- **Block Scope**
- **Method Scope**
- **Class Scope**

---

## 1️⃣ Block Scope

### ✅ Definition:
Variables declared inside `{}` (like in `if`, `for`, `while`, etc.) have **block scope**.  
They are accessible **only within that block**.

### 📌 Example:

```java
if (true) {
    int x = 10; // block-scoped variable
    System.out.println(x); // ✅ works
}







# 📘 Java String Functions – Full Guide

---

##  1. `length()`

**Definition:** Returns the number of characters in the string.  
**Syntax:** `str.length()`  
**Example:**
```java
String s = "Java";
System.out.println(s.length());  // Output: 4
```

## 2. `charAt(int index)`
**Definition:** Returns the character at the specified index.
**Syntax:** str.charAt(index)
**Example:**

```java
String s = "Hello";
System.out.println(s.charAt(1));  // Output: e
```

##  3. `substring`

**Definition:** Returns a part of the string from beginIndex to endIndex - 1.
**Syntax:** `ssubstring(int beginIndex, int endIndex)`  
**Example:**
```java
String s = "Programming";
System.out.println(s.substring(0, 4));  // Output: Prog
```

##  4. `Equals`

**Definition:** Compares the contents of two strings (case-sensitive).
**Syntax:** `equals(String anotherString)`  
**Example:**
```java
String a = "Java";
String b = "Java";
System.out.println(a.equals(b));  // true
```

##  5. `equalsIgnorecase`

**Definition:** Compares strings, ignoring case.
**Syntax:** `equalsIgnoreCase(String anotherString)`  
**Example:**
```java
String a = "Java";
String b = "java";
System.out.println(a.equalsIgnoreCase(b));  // true
```

##  6. `contains`

**Definition:** Checks if the string contains a given sequence.
**Syntax:** `ssubstring(str.contains(word))`  
**Example:**
```java
String s = "Hello World";
System.out.println(s.contains("World"));  // true
```

##  7. `startsWith && endsWith`

**Definition:** Checks if a string starts or ends with given characters.
**Syntax:** `startsWith(String prefix) / endsWith(String suffix)`  
**Example:**
```java
String s = "programming";
System.out.println(s.startsWith("pro"));  // true
System.out.println(s.endsWith("ing"));    // true
```

##  8. `toUpperCase() / toLowerCase()`

**Definition:** Converts string to upper/lower case.
**Syntax:** `str.toUpprtCase() `  
**Syntax:** `str.toLowerCase() `  
**Example:**
```java
String s = "Java";
System.out.println(s.toUpperCase());  // JAVA
System.out.println(s.toLowerCase());  // java
```

##  9. `trim()`

**Definition:** Removes leading and trailing whitespaces.
**Syntax:** `str.trim() `  
**Example:**
```java
String s = "  Hello Java  ";
System.out.println(s.trim());  // Output: Hello Java

```

##  10. `replace()`

**Definition:** Replaces all occurrences of a character.
**Syntax:** `replace(char oldChar,char newChar)`  
**Example:**
```java
String s = "banana";
System.out.println(s.replace('a', 'o'));  // Output: bonono


```

##  11. `indexOf()/lastIndexOf()`

**Definition:** Finds the first or last index of a character.
**Syntax:** `str.indexOf(char) `  
**Syntax:** `str.lastindexOf(char) `  
**Example:**
```java
String s = "program";
System.out.println(s.indexOf('r'));      // 2
System.out.println(s.lastIndexOf('r'));  // 5

```
##  12. `split()`

**Definition:** Splits the string into an array using a delimiter.
**Syntax:** `split(String regex)`  
**Example:**
```java
String data = "apple,banana,grapes";
String[] fruits = data.split(",");
```

##  13. `isEmpty()/isBlank()`

**Definition:** isEmpty() → true if string length is 0
isBlank() → true if empty or whitespace only
**Syntax:** `str.isEmpty()`  
**Syntax:** `str.isBlank()`  
**Example:**
```java
String s1 = "";
String s2 = "   ";
System.out.println(s1.isEmpty());  // true
System.out.println(s2.isBlank());  // true
```

##  14. `toCharArray()`

**Definition:** SConverts a string to a character array.
**Syntax:** `str.toCharArray()`  
**Example:**
```java
String s = "Java";
char[] arr = s.toCharArray();

```

| Method             | Description                         |
| ------------------ | ----------------------------------- |
| `length()`         | Returns string length               |
| `charAt(i)`        | Gets char at index                  |
| `substring(i,j)`   | Extracts part of string             |
| `equals()`         | Compares strings                    |
| `equalsIgnoreCase` | Ignores case while comparing        |
| `compareTo()`      | Lexicographic comparison            |
| `contains()`       | Checks if sequence exists           |
| `startsWith()`     | Checks if string starts with prefix |
| `endsWith()`       | Checks if string ends with suffix   |
| `toUpperCase()`    | Converts to uppercase               |
| `toLowerCase()`    | Converts to lowercase               |
| `trim()`           | Removes spaces from ends            |
| `replace()`        | Replaces characters                 |
| `indexOf()`        | First index of char                 |
| `lastIndexOf()`    | Last index of char                  |
| `split()`          | Splits string using regex           |
| `isEmpty()`        | true if string is empty             |
| `isBlank()`        | true if only whitespace (Java 11+)  |
| `toCharArray()`    | Converts to char array              |

# 🧠 Divide and Conquer 
This project demonstrates the **Divide and Conquer** approach using the classic **Merge Sort** algorithm in Java.

---

## 🔍 What is Divide and Conquer?

**Divide and Conquer** is an algorithm design technique that works by:
1. **Dividing** the problem into smaller subproblems.
2. **Conquering** each subproblem recursively.
3. **Combining** the results to solve the original problem.

---

## 📚 Algorithm: Merge Sort

### ✅ How It Works
- **Divide**: Split the array into two halves.
- **Conquer**: Recursively sort both halves.
- **Combine**: Merge the two sorted halves into one.

### 🕒 Time Complexity
- Best Case: `O(n log n)`
- Average Case: `O(n log n)`
- Worst Case: `O(n log n)`

### 🧠 Space Complexity
- `O(n)` (temporary array used during merging)

---

## 🧪 Sample Input / Output

### Input:
```
Original array: [5, 2, 9, 1, 3, 7]
```

### Output:
```
Sorted array: [1, 2, 3, 5, 7, 9]
```

---

## 💻 Files

- `MergeSort.java` → Main Java file containing the merge sort implementation.
- `README.md` → This documentation file.

---

## 📦 How to Run

1. Clone this repository or copy the code.
2. Compile the Java file:
   ```bash
   javac MergeSort.java
   ```
3. Run the program:
   ```bash
   java MergeSort
   ```

---

## 🧩 Real-World Analogy

> Think of sorting a big pile of cards. You split the pile in half, sort each half, and then merge them back into one sorted pile. That’s divide and conquer!

---

## 🚀 Related Topics

- Quick Sort
- Binary Search
- Maximum Subarray (Kadane’s Algorithm)
- Matrix Multiplication (Strassen’s Algorithm)

---

## 📜 License

This project is open-source and free to use for educational purposes.

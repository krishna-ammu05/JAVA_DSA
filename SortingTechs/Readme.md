
# 📊 Sorting Algorithms

Sorting algorithms are techniques used to reorder elements in a list or array in a specific order (ascending or descending). Sorting is essential in computer science for optimizing search operations and organizing data.

---

## 🔹 Types of Sorting Algorithms

### 1. Comparison-Based Sorting
- Compare elements to decide order.
- Examples: Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, Heap Sort.

### 2. Non-Comparison-Based Sorting
- Do not compare elements directly.
- Examples: Counting Sort, Radix Sort, Bucket Sort.

---

## 📘 Sorting Algorithms 
### ✅ 1. Bubble Sort

**Definition**:  
Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

**Logic**:
```java
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            swap(arr[j], arr[j + 1]);
        }
    }
}
```

---

### ✅ 2. Selection Sort

**Definition**:  
Selection Sort selects the smallest (or largest) element from the unsorted part and places it at the beginning.

**Logic**:
```java
for (int i = 0; i < n - 1; i++) {
    int min = i;
    for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
            min = j;
        }
    }
    swap(arr[i], arr[min]);
}
```

---

### ✅ 3. Insertion Sort

**Definition**:  
Insertion Sort builds the sorted array one element at a time by inserting each element into its proper place in the sorted part.

**Logic**:
```java
for (int i = 1; i < n; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = key;
}
```

---

### ✅ 4. Merge Sort

**Definition**:  
Merge Sort is a divide-and-conquer algorithm that divides the array into halves, sorts each half, and then merges them.

**Logic**:
```java
mergeSort(arr, left, right):
    if left < right:
        mid = (left + right) / 2
        mergeSort(arr, left, mid)
        mergeSort(arr, mid + 1, right)
        merge(arr, left, mid, right)
```

---

### ✅ 5. Quick Sort

**Definition**:  
Quick Sort selects a "pivot" element and partitions the array such that elements less than pivot are on one side, and greater on the other. Then it recursively sorts both sides.

**Logic**:
```java
quickSort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)
        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)
```

---

### ✅ 6. Heap Sort

**Definition**:  
Heap Sort converts the array into a heap structure (max heap or min heap), and then repeatedly extracts the maximum (or minimum) to build the sorted array.

**Logic**:
```java
heapSort(arr):
    buildMaxHeap(arr)
    for i from n-1 to 1:
        swap(arr[0], arr[i])
        heapify(arr, 0, i)
```

---

### ✅ 7. Counting Sort

**Definition**:  
Counting Sort works for non-negative integers. It counts the occurrences of each element and uses that information to place them in the correct position.

**Logic**:
1. Find max element (k)  
2. Initialize count[k + 1]  
3. Count frequency of each element  
4. Compute prefix sum  
5. Place elements in output array  

---

### ✅ 8. Radix Sort

**Definition**:  
Radix Sort processes digits from least significant to most significant and uses a stable sort (like Counting Sort) at each digit level.

**Logic**:
```java
for digit from LSD to MSD:
    apply stable counting sort on that digit
```

---

## 📊 Time & Space Complexities

| Algorithm      | Best Case | Average Case | Worst Case | Space     | Stable |
|----------------|-----------|--------------|------------|-----------|--------|
| Bubble Sort    | O(n)      | O(n²)        | O(n²)      | O(1)      |      |
| Selection Sort | O(n²)     | O(n²)        | O(n²)      | O(1)      |      |
| Insertion Sort | O(n)      | O(n²)        | O(n²)      | O(1)      |      |
| Merge Sort     | O(n log n)| O(n log n)   | O(n log n) | O(n)      |      |
| Quick Sort     | O(n log n)| O(n log n)   | O(n²)      | O(log n)  |      |
| Heap Sort      | O(n log n)| O(n log n)   | O(n log n) | O(1)      |      |
| Counting Sort  | O(n+k)    | O(n+k)       | O(n+k)     | O(k)      |      |
| Radix Sort     | O(nk)     | O(nk)        | O(nk)      | O(n+k)    |      |

---




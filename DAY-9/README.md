# Reverse Array in Groups

## Problem Statement

Given an array `arr[]` and an integer `k`, reverse every group of `k` elements in the array. If the remaining elements are fewer than `k`, reverse them as well.

## Examples

### Example 1

**Input:**

arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 3


**Output:**

{3, 2, 1, 6, 5, 4, 8, 7}


**Explanation:**
- Reverse first group: `{1, 2, 3}` → `{3, 2, 1}`
- Reverse second group: `{4, 5, 6}` → `{6, 5, 4}`
- Reverse third group: `{7, 8}` → `{8, 7}`

Final array:
{3, 2, 1, 6, 5, 4, 8, 7}



## Algorithm

1. Find the length of the array `n`.
2. Traverse the array in steps of `k`.
3. For each group:
   - Set `left = i`
   - Set `right = min(i + k - 1, n - 1)`
4. Reverse the elements between `left` and `right` using the two-pointer technique.
5. Repeat the process for all groups.


---

### Input

```java
arr = {1, 2, 3, 4, 5, 6, 7, 8}
k = 3
```

### Step 1

Reverse first group:

```java
{1, 2, 3} → {3, 2, 1}
```

Array becomes:

```java
{3, 2, 1, 4, 5, 6, 7, 8}
```

### Step 2

Reverse second group:

```java
{4, 5, 6} → {6, 5, 4}
```

Array becomes:

```java
{3, 2, 1, 6, 5, 4, 7, 8}
```

### Step 3

Reverse third group:

```java
{7, 8} → {8, 7}
```

Final array:

```java
{3, 2, 1, 6, 5, 4, 8, 7}
```

---

## Time Complexity

**O(n)**

Each element is visited at most once during the reversal process.

---

## Space Complexity

**O(1)**

No extra array is used. The reversal is performed in-place.

---

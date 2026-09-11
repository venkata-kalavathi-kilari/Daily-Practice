# Searching Algorithms – Basics

## Problem

Searching algorithms are used to **find a specific element** in a collection of data.

When searching in an array, two common searching algorithms are:

1. Linear Search
2. Binary Search

## 1. Linear Search

### Definition

Linear Search is used mainly for an **unsorted array**.

It checks the elements **one by one** from the beginning until the required element is found.

### Example

Array: `[10, 25, 30, 45, 50]`

Search: `45`

Steps:
- Check 10 → Not found
- Check 25 → Not found
- Check 30 → Not found
- Check 45 → Found

### Time Complexity

**O(n)**

Because in the worst case, we may need to check all `n` elements.

### Space Complexity

**O(1)**

No extra data structure is required.

---

## 2. Binary Search

### Definition

Binary Search is used for a **sorted array**.

It checks the **middle element** first.

- If the middle element is the target → element is found.
- If the target is smaller → search the left half.
- If the target is greater → search the right half.

This process continues until the element is found or the search space becomes empty.

### Example

Array: `[10, 20, 30, 40, 50, 60, 70]`

Search: `60`

Steps:
- Middle = 40 → 60 is greater, so search right half.
- Middle = 60 → Found.

### Time Complexity

**O(log n)**

### Space Complexity

**O(1)** for the iterative implementation.
→ O(log n)**

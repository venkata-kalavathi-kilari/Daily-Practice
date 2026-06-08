# Factorial of a Number using Recursion

## 📌 Problem 
Given a positive integer `n`, find its factorial using recursion.

The factorial of a number is the product of all positive integers less than or equal to that number.

Factorial Formula:

n! = n × (n-1) × (n-2) × ... × 2 × 1

Special Cases:
- 0! = 1
- 1! = 1

## 🧾 Example

### Input:
n = 5

### Output:
120

### Explanation:
5! = 5 × 4 × 3 × 2 × 1 = 120

---

## 💡 Algorithm

1. If `n` is 0 or 1, return 1.
2. Otherwise, return `n * factorial(n - 1)`.
3. The function keeps calling itself until it reaches the base case.


## ⏱️ Time Complexity

O(n)

Reason: The function makes `n` recursive calls.

## 🧠 Space Complexity

O(n)

Reason: Recursive calls are stored in the call stack.

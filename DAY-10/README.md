# 🔄 Array Rotation using Reverse Algorithm

## 📌 Problem Statement
Given an array arr[] . Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.
## 🧾 Example

### Input:
arr[] = [1, 2, 3, 4, 5]  
d = 2

### Output:
[3, 4, 5, 1, 2]
## 💡 Algorithm

We use 3 steps:

1. Reverse first `d` elements  
2. Reverse remaining `n - d` elements  
3. Reverse whole array  

## 🔁 Working

Original:
[1, 2, 3, 4, 5]

Step 1:
[2, 1, 3, 4, 5]

Step 2:
[2, 1, 5, 4, 3]

Step 3:
[3, 4, 5, 1, 2]

## ⏱️ Time Complexity
O(n)

## 🧠 Space Complexity
O(1)

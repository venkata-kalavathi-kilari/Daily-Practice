# Problem
Given a string `s` and an integer `k`, check whether the string can be divided into substrings of length `k` such that all substrings are the same or only one substring is different.

# Example
Input:
s = "abababac"
k = 2

Output:
true

Explanation:
Substrings = ["ab", "ab", "ab", "ac"]
Only one substring is different, so the answer is true.

# Algorithm
1. Check if the length of the string is divisible by `k`.
2. Divide the string into substrings of length `k`.
3. Store the frequency of each substring in a HashMap.
4. If only one unique substring exists, return true.
5. If more than two unique substrings exist, return false.
6. If exactly two unique substrings exist, check whether one substring appears only once or all except one time.
7. Return the result.

# Time Complexity
O(n)

# Space Complexity
O(n / k)


2. Smallest Non-Representable Sum (Amazon)

File: SmallestNonRepresentableSum.java
Description: Given a sorted array of positive integers, find the smallest positive integer that cannot be formed as a sum of any subset of the array. For example, for the array [1, 2, 3, 10], we can form sums like 1, 2, 3, 4, 5, 6, but not 7, so the answer is 7.
Constraints:
Array size: 1 ≤ N ≤ 10^5
Element values: 1 ≤ a[i] ≤ 10^9
Input array is sorted in increasing order


My Approach:
I used a greedy approach, starting with smallest = 1 (the smallest positive integer).
I iterate through the sorted array. If the current number is greater than smallest, it means we can’t form smallest, so it’s the answer. Otherwise, I add the number to smallest to extend the range of possible sums.
I used long for smallest to handle large sums (up to 10^9).
Input is read using Scanner, splitting a space-separated line into an integer array.


Time Complexity: O(n), where n is the array length (single pass through the array).
Space Complexity: O(1), excluding the input array.
Example:Input: 1 2 3 10
Output: Smallest non-representable positive integer: 7
Explanation: We can form 1, 2, 3, 4, 5, 6, but not 7.

My Development Journey
I tackled these problems one at a time, starting with the LCS problem. The 3D DP concept was new to me, so I spent time understanding the transitions by practicing with smaller examples and referring to online resources. I implemented the solution iteratively, testing with the example input to ensure correctness. For the Subset Sum problem, the greedy approach was initially confusing, but I worked through small test cases (like [1, 2, 3]) to see how the smallest variable tracks the range of sums. I made sure to handle large inputs by using long. My commit history shows my step-by-step process:

Challenges I Faced

LCS Problem:
Grasping the 3D DP table was tough since I’d only done 2-string LCS before. I had to debug indexing errors (e.g., off-by-one issues) to get the transitions right.
Ensuring the input handling worked for strings with spaces or mixed case took extra care.


Resources I Used

LCS Problem:
GeeksforGeeks – LCS of three strings
LeetCode – Related LCS problem
YouTube video on LCS of three strings (helped visualize the DP table)

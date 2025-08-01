🧩 Equal Sum Partition
📌 Problem Statement
Given a multiset (an array that may contain duplicate non-negative integers), determine whether it can be partitioned into two subsets such that the sum of elements in both subsets is equal.
This is a variation of the classic Subset Sum Problem and a well-known dynamic programming challenge known as Partition Equal Subset Sum (Leetcode #416).

🧠 Approach & Solution Strategy
Step 1: Total Sum Check
- First, calculate the total sum of the array elements.
- If the total sum is odd, it's impossible to split it into two equal integer subsets. Return false.

Step 2: Define Target
- If the total sum is even, set the target to be half of the sum.
- The goal becomes: “Can we find a subset that adds up to target?”

Step 3: Dynamic Programming
We use a 1D DP array dp[] where:
- dp[i] = true means there exists a subset that sums to i.

Initialization:
- dp[0] = true → A sum of 0 is always possible (empty subset).



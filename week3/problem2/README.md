Problem of the Week – Count Unival Subtrees
Problem Description
The task is to count the number of unival subtrees in a given binary tree. A unival tree (or universal value tree) is defined as a subtree where all its nodes have the same value. A single node by itself is always considered a unival subtree.

Approaches
1. Recursive Post-Order Traversal (Optimal Approach)
This approach uses a single recursive function that traverses the tree in a post-order fashion (visiting children before the parent). The key idea is to process information from the bottom up, from the leaves to the root.

Algorithm:

We define a helper function, let's call it isUnivalHelper, that takes a node and returns a boolean. This boolean indicates whether the subtree rooted at the current node is unival.

The main function initializes a global or instance counter to 0. It then calls the helper function on the root.

Inside isUnivalHelper:

Base Case: If the current node is null (an empty subtree), it is considered unival. We return true.

Recursive Step: We recursively call isUnivalHelper on the left and right children. This gives us booleans for whether the left subtree (isLeftUnival) and the right subtree (isRightUnival) are unival.

Check Conditions:

First, we check if isLeftUnival and isRightUnival are both true. If either is false, the current subtree cannot be unival.

Next, we check if the current node's value matches the value of its children (if they exist).

Updating the Count: If all of the above conditions are met, it means the subtree rooted at the current node is itself a unival subtree. We increment our global counter.

Finally, we return true or false based on whether the current subtree is unival, allowing the parent node in the recursion to use this information.

2. Brute-Force Approach (Less Efficient)
A less optimal approach would be to iterate through every node in the tree. For each node, you would then perform a separate traversal (e.g., Breadth-First Search or Depth-First Search) on the subtree rooted at that node to check if all its values are the same. This approach would involve redundant traversals of the same subtrees, leading to a higher time complexity.

Time and Space Complexity
Time Complexity: O(N)

The recursive post-order traversal visits each of the N nodes in the tree exactly once. Each node is processed in constant time, making the overall time complexity linear with respect to the number of nodes.

Space Complexity: O(H)

The space complexity is determined by the maximum depth of the recursion call stack, which is equal to the height of the tree, H. In the worst-case scenario (a skewed tree), H can be O(N). In the best-case (a balanced tree), H is O(log N).
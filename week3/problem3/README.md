Problem of the Week – Word Search in 2D Matrix
Problem Description
The problem requires checking for the existence of a given word within a 2D character matrix. The search is limited to two directions:

Horizontally: From left-to-right within any row.

Vertically: From top-to-bottom within any column.

The function should return true if the word is found, and false otherwise.

Approaches
1. Direct Traversal (Optimal Approach)
The most straightforward and efficient approach for this problem is to perform two separate searches: one for horizontal matches and one for vertical matches.

Algorithm:

Horizontal Search: Iterate through each row of the matrix. For each row, concatenate all the characters to form a single string. Then, use a string matching function (like String.contains() in Java) to check if the target word exists in this newly formed row string. If a match is found, we can immediately return true.

Vertical Search: If no horizontal match is found after checking all rows, proceed to search vertically. Iterate through each column index. For each column, build a string by appending characters from each row at that specific column index. Again, use a string matching function to check if the word exists in this new column string. If a match is found, return true.

Final Result: If the loops complete without finding any matches in either direction, return false.

Time and Space Complexity
Time Complexity: O(M * N)

The algorithm involves two main loops. The first loop iterates through each of the M rows, and within it, a loop iterates through each of the N columns to build the string. The second loop iterates through the N columns, and within it, a loop iterates through the M rows. Since each character in the matrix is visited a constant number of times, the overall time complexity is linear with respect to the number of elements in the matrix, i.e., O(M × N).

Space Complexity: O(max(M, N))

The space complexity is determined by the temporary string built for each row or column. In the worst case, this string will have a length equal to the number of columns (N) for the horizontal search or the number of rows (M) for the vertical search. Therefore, the space complexity is proportional to the maximum dimension of the matrix.
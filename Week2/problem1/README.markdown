### My Solution
- **File**: `LCSOfThreeStrings.java`
- **Approach**: I used a dynamic programming (DP) approach with a 3D array (`dp[i][j][k]`) to store the length of the LCS for the first `i` characters of the first string, `j` characters of the second, and `k` characters of the third. The logic is:
  - If the characters at the current positions match (i.e., `s1[i-1] == s2[j-1] == s3[k-1]`), I add 1 to the LCS length from the previous state (`dp[i-1][j-1][k-1]`).
  - If they don’t match, I take the maximum of the LCS lengths by excluding one character from any of the strings (`dp[i-1][j][k]`, `dp[i][j-1][k]`, or `dp[i][j][k-1]`).
- **Implementation Details**:
  - I used a `Scanner` to handle input, reading three strings from the console.
  - The DP table is initialized with zeros, and I iterate through all possible indices of the three strings.
  - The final answer is stored in `dp[m][n][o]`, where `m`, `n`, and `o` are the lengths of the input strings.
- **Time Complexity**: O(m * n * o), where m, n, o are the lengths of the input strings. This is acceptable since the maximum length is 100.
- **Space Complexity**: O(m * n * o) for the 3D DP table.

### Example
**Input**:
```
epidemiologist
refrigeration
supercalifragilisticexpialodocious
```
**Output**:
```
Length of LCS: 5
```
**Explanation**: The longest common subsequence is "eieio", so the output is 5.


## My Development Process
I started by understanding the problem and the hint about using a 3D DP table. I first wrote a simple version of the code to test the logic with small inputs. After ensuring it worked, I added proper input handling with `Scanner` and tested it with the example case. I also added comments to make the code readable and organized the repository with a clear structure. The commit history reflects my iterative process:
- **Initial Commit**: Created the Java file with the core DP logic.
- **Second Commit**: Added input handling and tested with example cases.
- **Final Commit**: Wrote this README to document my work and ensure clarity.

## Challenges Faced
- Understanding the 3D DP table was tricky at first, as I was more familiar with the 2-string LCS problem. I referred to the GeeksforGeeks article on LCS of three strings to solidify my understanding.
- Ensuring the input handling was robust (e.g., trimming whitespace) took some trial and error.
- I considered a recursive approach but realized it would be slower for larger inputs, so I stuck with the iterative DP solution.

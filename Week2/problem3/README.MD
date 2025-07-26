## 3. Step Words Finder (Pivotal)
- **File**: `StepWordsFinder.java`
- **Description**: Given a word and a dictionary, find all step words formed by adding one letter to the input word and anagramming to a dictionary word. For example, for "apple" and dictionary ["appeal", "apply", "pepla", "papple", "apples"], the step words are "appeal" and "papple".
- **Constraints**:
  - Word length: 1 ≤ len(W) ≤ 15
  - Dictionary size: 1 ≤ N ≤ 10^5
  - Dictionary words are lowercase, alphabetic, no spaces
- **My Approach**:
  - Used frequency arrays (size 26) to count characters in the input word and dictionary words.
  - Checked if each dictionary word has length = input word length + 1 and matches the input word’s frequency plus one extra character.
  - Sorted results lexicographically with `Collections.sort`.
  - Added input validation for word length, dictionary size, and lowercase characters.
- **Time Complexity**: O(N * K), where N is dictionary size and K is max word length (up to 15).
- **Space Complexity**: O(1) for frequency arrays, plus O(M) for results (M is number of step words).
- **Example**:
  ```
  Input:
  apple
  5
  appeal
  apply
  pepla
  papple
  apples
  Output:
  appeal
  papple
  Explanation: "appeal" (add 'a', anagram "applea") and "papple" (add 'p', anagram "applep") are valid.
  ```
  4. Follow prompts:
     - `LCSOfThreeStrings.java`: Enter three strings, each on a new line.
     - `SmallestNonRepresentableSum.java`: Enter space-separated sorted integers.
     - `StepWordsFinder.java`: Enter the word, dictionary size, and dictionary words (one per line).
  5. The program outputs the result as specified.


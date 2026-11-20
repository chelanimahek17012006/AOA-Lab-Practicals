# Experiment 11 – Longest Common Subsequence (LCS) using Dynamic Programming

**Aim:** To find the longest subsequence common to two strings using dynamic programming.

## Sample Output
```text
Enter first string: ABCDGH
Enter second string: AEDFHR
Length of LCS: 3
Longest Common Subsequence: ADH
Time Complexity: O(m * n)
Space Complexity: O(m * n)
```

## Explanation (English)
LCS finds the longest sequence that appears in both strings in the same relative order; characters do not need to be adjacent. If the current characters match, add one to the diagonal DP value. Otherwise, take the maximum of the value from the top or left cell.

## Explanation (Hinglish)
Hinglish: LCS do strings ka aisa longest sequence hota hai jo dono mein same order mein present ho. Characters continuous hona zaroori nahi. Agar current characters same hain to diagonal value +1 karte hain. Agar different hain to top aur left mein se maximum lete hain.

## Time and Space Complexity
Time: O(mn) • Space: O(mn), where m and n are the lengths of the two strings.
Quick Revision – Viva Points
Recursion Tree: Expand recurrence as a tree; add cost level by level.
Master Theorem: Compare k with log_b(a) for T(n)=aT(n/b)+O(n^k).
B-Tree: Balanced multiway search tree; keys can be in internal and leaf nodes.
B+ Tree: All data keys are in leaves; leaf nodes are linked.
Binary Search: Requires sorted array; halves search space each iteration.
Merge Sort: Divide, recursively sort, and merge; stable sorting algorithm.
Quick Sort: Partition around pivot; average O(n log n), worst O(n²).
Fractional Knapsack: Greedy by descending profit/weight ratio; fractions allowed.
Job Sequencing: Sort by profit; assign each job to latest available slot before deadline.
0/1 Knapsack: DP; each item is either selected once or not selected.
LCS: Longest common subsequence preserves order, not necessarily adjacency.
Important before the practical
Save each program in a file whose name matches its public class (for example, BinarySearch.java). Compile with: javac BinarySearch.java. Run with: java BinarySearch.
For the B+ Tree code in this quick guide, the implementation is intentionally limited to a compact classroom demonstration and does not implement full multi-level split propagation or deletion. If your teacher expects the exact B+ Tree menu/code from your own PDF, use that PDF as the reference.
The uploaded Exp-4 AOA.pdf is RedBlackTree, not Binary Search. If your college practical list actually includes Red-Black Tree instead of Binary Search, tell me and I can prepare that additional practical too.
            }
Item 2     3            5
Item 5     9            20

## Run
```bash
javac LCS.java
java LCS
```

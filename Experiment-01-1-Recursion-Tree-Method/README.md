# Experiment 1 – Recursion Tree Method

**Aim:** To analyse the recurrence T(n) = 2T(n/2) + n using a recursion tree.

## Sample Output
```text
             T(8) + 8
            /         \
       T(4) + 4     T(4) + 4
        /    \       /    \
   T(2)+2 T(2)+2 T(2)+2 T(2)+2
    / \     / \    / \     / \
 T(1)+1 repeated eight times
Overhead Cost at Each Level:
Level 0 : n
Level 1 : n/2 + n/2 = n
Level 2 : n/4 + n/4 + n/4 + n/4 = n
Level 3 : eight leaves; constant work per leaf
Recurrence Relation : T(n) = 2T(n/2) + n
Time Complexity : O(n log n)
Execution Time : machine dependent
```

## Explanation (English)
The recursion tree method expands a recurrence into a tree. Each node represents one recursive call and its non-recursive work. Here every level contributes a total cost proportional to n. The tree has log₂n levels, so the total work is n multiplied by log n.

## Explanation (Hinglish)
Hinglish mein: recursion tree mein hum recursive function ko tree ke form mein todte hain. Root par T(n), phir do branches T(n/2), aur aage har branch split hoti hai. Har level ka total extra kaam n hai aur total levels log n hain. Isliye total time O(n log n) hota hai.

## Time and Space Complexity
Time: O(n log n) • Auxiliary recursion stack: O(log n). The displayed tree is for n = 8.

## Run
```bash
javac RecursionTree.java
java RecursionTree
```

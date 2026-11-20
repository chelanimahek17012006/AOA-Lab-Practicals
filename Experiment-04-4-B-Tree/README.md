# Experiment 4 – B+ Tree

**Aim:** To implement insertion, searching and leaf-level traversal in a B+ Tree.

## Sample Output
```text
B+ TREE MENU
1. Insert
2. Search
3. Display
4. Exit
Enter your choice: 1
Enter key: 10
Enter your choice: 1
Enter key: 20
Enter your choice: 1
Enter key: 5
Enter your choice: 3
B+ Tree Leaf Sequence: 5 10 20
Enter your choice: 4
```

## Explanation (English)
A B+ Tree is a balanced multiway search tree. Internal nodes guide the search, while all actual data keys are stored in leaf nodes. Leaf nodes are linked, so sequential and range traversal is efficient.

## Explanation (Hinglish)
Hinglish: B+ Tree mein actual records leaf nodes mein store hote hain. Internal nodes sirf searching ke liye guide karte hain. Saare leaf nodes linked hote hain, isliye sorted order mein data print karna aur range search karna easy hota hai.

## Time and Space Complexity
Search/insert: O(log n) • Leaf traversal: O(n) • Space: O(n).

## Run
```bash
javac Main.java
java Main
```

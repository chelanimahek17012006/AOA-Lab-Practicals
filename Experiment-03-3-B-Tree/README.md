# Experiment 3 – B-Tree

**Aim:** To implement insertion, searching and traversal in a B-Tree.

## Sample Output
```text
B-TREE MENU
1. Insert
2. Search
3. Traversal
4. Exit
Enter your choice: 1
Enter key: 10
Enter your choice: 1
Enter key: 20
Enter your choice: 1
Enter key: 5
Enter your choice: 3
B-Tree Traversal: 5 10 20
Enter your choice: 4
```

## Explanation (English)
A B-Tree is a self-balancing multiway search tree. A node can store multiple sorted keys and have multiple children. During insertion, a full node is split and its middle key moves to the parent. This keeps the tree balanced and supports efficient searching.

## Explanation (Hinglish)
Hinglish: B-Tree ek balanced search tree hai jisme ek node ke andar multiple keys ho sakti hain. Keys sorted order mein rehti hain. Jab node full ho jata hai, to usko split karte hain aur middle key parent mein bhejte hain. Isse tree balanced rehta hai.

## Time and Space Complexity
Search/insert: O(log n) for fixed order • Space: O(n). This compact implementation uses minimum degree T=2 and includes insert, search and traversal; deletion is not included.

## Run
```bash
javac Main.java
java Main
```

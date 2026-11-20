# Experiment 5 – Binary Search Algorithm

**Aim:** To search an element in a sorted array using divide and conquer.

## Sample Output
```text
Enter number of elements: 5
Enter elements in sorted order:
8 40 48 56 68
Enter element to search: 56
Divide and Conquer Process
STEP 1
low = 0
high = 4
mid = 2
Middle Element = 48
56 > 48 : Search Right Half
STEP 2
low = 3
high = 4
mid = 3
Middle Element = 56
Element Found at position 4
```

## Explanation (English)
Binary Search works only on a sorted array. It compares the key with the middle element. If equal, the search ends. If the key is smaller, it searches the left half; otherwise, it searches the right half. The search interval is halved at every step.

## Explanation (Hinglish)
Hinglish: Binary Search ke liye array sorted hona zaroori hai. Har step mein middle element check hota hai. Key middle se chhoti ho to left side, badi ho to right side mein search karte hain. Har step mein aadha array eliminate ho jata hai.

## Time and Space Complexity
Time: Best O(1), Average/Worst O(log n) • Space: O(1) iterative.

## Run
```bash
javac BinarySearch.java
java BinarySearch
```

# Experiment 7 – Quick Sort

**Aim:** To sort product prices using Quick Sort and count comparisons.

## Sample Output
```text
Enter number of product prices: 8
Enter product prices:
35 50 15 25 80 20 90 45
Original Product Prices:
[35, 50, 15, 25, 80, 20, 90, 45]
Sorted Product Prices:
[15, 20, 25, 35, 45, 50, 80, 90]
Number of Comparisons : depends on partition counting
Execution Time : machine dependent
TIME COMPLEXITY ANALYSIS
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n^2)
Space Complexity: Average O(log n), Worst O(n)
```

## Explanation (English)
Quick Sort selects a pivot and partitions the array so that smaller elements go to its left and larger elements go to its right. It recursively sorts the left and right partitions. The uploaded code uses the first element as pivot.

## Explanation (Hinglish)
Hinglish: Quick Sort mein ek pivot choose hota hai. Pivot se chhote elements left mein aur bade elements right mein arrange hote hain. Phir left aur right parts par same process recursively lagta hai. Average case fast hota hai, lekin bad pivot selection se worst case O(n²) ho sakta hai.

## Time and Space Complexity
Best/Average: O(n log n) • Worst: O(n²) • Auxiliary stack: average O(log n), worst O(n).

## Run
```bash
javac QuickSortExperiment.java
java QuickSortExperiment
```

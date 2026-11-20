# Experiment 6 – Merge Sort

**Aim:** To sort an array using the divide-and-conquer merge sort algorithm.

## Sample Output
```text
Enter numbers separated by space (count first): 9
2 4 5 7 8 3 1 4 5
Original Array : [2, 4, 5, 7, 8, 3, 1, 4, 5]
Sorted Array   : [1, 2, 3, 4, 4, 5, 5, 7, 8]
Execution Time : machine dependent
Time Complexity : O(n log n)
Space Complexity: O(n)
```

## Explanation (English)
Merge Sort divides the array into two halves until each subarray contains one element. It then merges the subarrays in sorted order by repeatedly comparing their front elements. The merging process produces the final sorted array.

## Explanation (Hinglish)
Hinglish: Merge Sort array ko baar-baar do halves mein divide karta hai jab tak single elements na bach jaayein. Phir do sorted parts ko compare karke merge karta hai. Isi tarah bade sorted parts bante hain aur final array sorted milta hai.

## Time and Space Complexity
Time: O(n log n) in best, average and worst cases • Extra space: O(n).

## Run
```bash
javac MergeSort.java
java MergeSort
```

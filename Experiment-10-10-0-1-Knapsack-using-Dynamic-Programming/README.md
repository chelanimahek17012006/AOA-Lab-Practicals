# Experiment 10 – 0/1 Knapsack using Dynamic Programming

**Aim:** To find the maximum value that can be carried without exceeding knapsack capacity, where each item is either selected or rejected.

## Sample Output
```text
Item Details:
Item       Weight (kg)  Value
Item 1     2            10
Item 2     3            5
Item 3     5            15
Item 4     7            7
Item 5     9            20
Selected Items:
Item       Weight (kg)  Value
Item 1     2            10
Total Weight : 14 kg
Total Value  : 35
Capacity     : 15 kg
Time Complexity: O(n * W)
Space Complexity: O(n * W)
```

## Explanation (English)
Dynamic Programming stores the best value for each prefix of items and each capacity. For every item, it compares two choices: include the item (if it fits) or exclude it. The maximum of these choices is stored in dp[i][w]. A backtracking step identifies the selected items.

## Explanation (Hinglish)
Hinglish: 0/1 ka matlab item ko ya to poora lena hai ya bilkul nahi lena; fraction allowed nahi hai. DP table mein har item aur capacity ke liye maximum value store hoti hai. Har cell mein include aur exclude dono options compare hote hain. Last cell se selected items trace back karte hain.

## Time and Space Complexity
Time: O(nW) • Space: O(nW), where n = number of items and W = capacity.

## Run
```bash
javac KnapsackDP.java
java KnapsackDP
```

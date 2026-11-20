# Experiment 8 – Fractional Knapsack using Greedy Algorithm

**Aim:** To maximise profit by selecting whole or fractional items according to profit/weight ratio.

## Sample Output
```text
Enter number of items: 3
Enter details for Item 1
Enter profit: 60
Enter weight: 10
Enter details for Item 2
Enter profit: 100
Enter weight: 20
Enter details for Item 3
Enter profit: 120
Enter weight: 30
Enter knapsack capacity: 50
Items after sorting by Profit/Weight ratio:
Item     Profit     Weight     Profit/Weight
1        60.00      10.00      6.00
2        100.00     20.00      5.00
3        120.00     30.00      4.00
Selection of Items:
Item 1 -> 100.00% selected, Weight = 10.00, Profit = 60.00
Item 2 -> 100.00% selected, Weight = 20.00, Profit = 100.00
Item 3 -> 66.67% selected, Weight = 20.00, Profit = 80.00
Maximum Profit = 240.00
Overall Complexity: O(n log n)
```

## Explanation (English)
The Fractional Knapsack problem allows taking a fraction of an item. First calculate profit/weight ratio for every item and sort items in descending ratio. Select the highest-ratio items first. If the remaining capacity cannot fit the next item fully, take the required fraction.

## Explanation (Hinglish)
Hinglish: Har item ka profit divided by weight ratio nikalte hain. Jiska ratio sabse zyada hota hai, use pehle lete hain. Agar bag mein poora item fit nahi hota, to uska fraction le sakte hain. Is example mein 10 kg aur 20 kg poore liye, phir 30 kg wale item ka 20 kg part liya. Total profit 240.

## Time and Space Complexity
Time: O(n log n) due to sorting • Space: O(n) for item storage. The greedy method is optimal for the fractional version, not generally for 0/1 knapsack.

## Run
```bash
javac FractionalKnapsack.java
java FractionalKnapsack
```

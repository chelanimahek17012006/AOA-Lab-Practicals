# Experiment 2 – Master Theorem

**Aim:** To determine the time complexity of a divide-and-conquer recurrence using Master Theorem.

## Sample Output
```text
===== Master's Theorem =====
Enter value of a: 2
Enter value of b: 2
Enter exponent k of f(n) = O(n^k): 1
Recurrence:
T(n) = 2.0 T(n/2.0) + O(n^1.0)
Value of log_b(a): 1.0
Master's Theorem Case 2 applies.
Since k = log_b(a)
Time Complexity: O(n^1.00 log n)
```

## Explanation (English)
For a recurrence T(n) = aT(n/b) + O(n^k), calculate p = log_b(a). If k is smaller than p, Case 1 applies and the answer is O(n^p). If k equals p, Case 2 applies and the answer is O(n^p log n). If k is greater than p, Case 3 may apply, provided the regularity condition is satisfied, and the answer is O(n^k).

## Explanation (Hinglish)
Hinglish: pehle a, b aur k input karte hain. Phir log base b of a calculate karte hain. Agar k chhota hai to Case 1, equal hai to Case 2, aur bada hai to Case 3. Is example mein a=2, b=2, k=1, isliye log₂2=1 aur Case 2 lagta hai. Complexity O(n log n).

## Time and Space Complexity
Time: O(1) arithmetic operations • Space: O(1). Case 3 assumes the regularity condition.

## Run
```bash
javac MastersTheorem.java
java MastersTheorem
```

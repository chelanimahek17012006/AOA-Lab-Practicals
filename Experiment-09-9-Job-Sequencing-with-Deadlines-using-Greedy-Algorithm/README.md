# Experiment 9 – Job Sequencing with Deadlines using Greedy Algorithm

**Aim:** To schedule jobs before their deadlines to obtain maximum total profit.

## Sample Output
```text
Enter number of jobs: 5
Enter details for Job 1
Job ID: J1
Deadline: 2
Profit: 100
Enter details for Job 2
Job ID: J2
Deadline: 1
Profit: 19
Enter details for Job 3
Job ID: J3
Deadline: 2
Profit: 27
Enter details for Job 4
Job ID: J4
Deadline: 1
Profit: 25
Enter details for Job 5
Job ID: J5
Deadline: 3
Profit: 15
Scheduled Jobs:
Slot 1: J3 (Profit = 27, Deadline = 2)
Slot 2: J1 (Profit = 100, Deadline = 2)
Slot 3: J5 (Profit = 15, Deadline = 3)
Maximum Profit = 142
```

## Explanation (English)
Each job takes one unit of time and has a deadline and profit. Sort jobs in descending order of profit. For each job, place it in the latest free time slot on or before its deadline. This greedy choice preserves earlier slots for jobs with tighter deadlines.

## Explanation (Hinglish)
Hinglish: Sabse pehle jobs ko profit ke descending order mein sort karte hain. Har job ko uski deadline se pehle ka latest khaali slot dete hain. Agar slot available hai to job schedule hoti hai aur profit add hota hai. Is tarah maximum profit obtain karne ki koshish hoti hai.

## Time and Space Complexity
Time: O(n log n + nD), where D is maximum deadline; with D ≤ n, O(n²) after sorting • Space: O(D).

## Run
```bash
javac JobSequencing.java
java JobSequencing
```

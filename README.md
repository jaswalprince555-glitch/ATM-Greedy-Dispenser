# ATM-Greedy-Dispenser
java greedy-algorithm atm cash-dispenser console-app dsa beginner-project

# 💵 Greedy Cash Dispenser (Java)

A simple **Java console application** that simulates an ATM cash dispenser.  
It takes a total withdrawal amount from the user and calculates how many **₹500**, **₹200**, and **₹100** notes are needed using the **Greedy Algorithm**.

---

## 📌 Overview

The program uses the **greedy approach** — it always picks the largest possible note first, then moves to the next smaller denomination. This guarantees the **minimum number of notes** for the given denominations.

**Available denominations:**
- ₹500
- ₹200
- ₹100

---

## 🧠 How It Works

1. The user enters the total withdrawal amount.
2. The program divides the amount by **500** to find how many ₹500 notes are needed.
3. The remainder is then divided by **200** for ₹200 notes.
4. The new remainder is divided by **100** for ₹100 notes.
5. Any leftover amount (less than ₹100) is printed as the remaining balance.

### Example
If the user enters `1700`:

| Step | Calculation | Result |
|------|-------------|--------|
| ₹500 notes | 1700 / 500 | 3 notes, remainder 200 |
| ₹200 notes | 200 / 200 | 1 note, remainder 0 |
| ₹100 notes | 0 / 100 | 0 notes, remainder 0 |

**Output:**

~~~
$ javac GreedyDispenser.java
$ java GreedyDispenser
total withdrawal amount : 1700

================
AMOUNT: 0
500 Notes : 3
200 Notes: 1
100 Notes: 0
====================
~~~

int notes500 = totalwithdrawal / 500;
totalwithdrawal = totalwithdrawal % 500;

int notes200 = totalwithdrawal / 200;
totalwithdrawal = totalwithdrawal % 200;

int notes100 = totalwithdrawal / 100;
totalwithdrawal = totalwithdrawal % 100;

/ gives the number of notes of that denomination.

% gives the remaining amount after dispensing those notes.

The leftover value is printed as AMOUNT:.




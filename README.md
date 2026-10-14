# Task 01: Shopping Bill — GST First, Discount After

**Internship Program:** Java and Python Programming Internship  
**Organization:** Kiran Academy  

---

## 📌 Project Overview
This repository contains the complete implementation for **Task 01: Shopping Bill — GST First, Discount After** in both **Python** and **Java**.

The billing system calculates the final payable amount for five items categorized across three departments:
- **Electronics:** Items `a` and `b` (18% GST)
- **Fashion:** Items `c` and `d` (13% GST)
- **Food:** Item `e` (7% GST)

---

## 📐 Calculation Rules & Workflow

1. **Category GST (GST First):**
   - **Electronics:** `(a + b) + 18% GST`
   - **Fashion:** `(c + d) + 13% GST`
   - **Food:** `e + 7% GST`
2. **Total Bill after GST:**
   - Sum of the three GST-inclusive amounts: `Electronics + Fashion + Food`
3. **Discount Calculation (Discount After):**
   - 20% discount applied directly on the **Total Bill after GST**: `Discount = Total * 0.20`
4. **Final Payable Amount:**
   - Net payable bill: `Total after GST - Discount`

---

## 📁 Functions & Methods Specification

The exact function and method names implemented in both [`shopping_bill.py`](file:///d:/Kiran%20Academy%20internship%20Tasks/Task1/shopping_bill.py) and [`ShoppingBill.java`](file:///d:/Kiran%20Academy%20internship%20Tasks/Task1/ShoppingBill.java):

| Function / Method | Parameters | Description | Return Type |
| :--- | :--- | :--- | :--- |
| `calculateElectronicsGST(a, b)` | `a, b` | Adds `a` and `b`, then applies 18% GST | `float` / `double` |
| `calculateFashionGST(c, d)` | `c, d` | Adds `c` and `d`, then applies 13% GST | `float` / `double` |
| `calculateFoodGST(e)` | `e` | Applies 7% GST to `e` | `float` / `double` |
| `totalBill(a, b, c, d, e)` | `a, b, c, d, e` | Calls the 3 GST functions, sums them, and returns total | `float` / `double` |
| `calculateDiscountedBill(a, b, c, d, e)` | `a, b, c, d, e` | Calls `totalBill()`, deducts 20% discount, returns final bill | `float` / `double` |

> [!NOTE]
> Neither `input()` (Python) nor `Scanner` (Java) is used. All item amounts are passed directly as arguments.

---

## 🧪 Sample Test Values & Expected Results

### Input Values
- `a = 100.00` (Electronics Item 1)
- `b = 100.00` (Electronics Item 2)
- `c = 100.00` (Fashion Item 1)
- `d = 100.00` (Fashion Item 2)
- `e = 100.00` (Food Item)

### Expected & Verified Output
```text
Electronics after GST: 236.00
Fashion after GST: 226.00
Food after GST: 107.00
Total after GST: 569.00
Discount (20%): 113.80
Final payable amount: 455.20
```

---

## 🚀 How to Run and Test

### 1. Python Execution
```bash
python shopping_bill.py
```

### 2. Java Compilation & Execution
```bash
javac ShoppingBill.java
java ShoppingBill
```

---

## 📂 Project Structure

```text
Task1/
├── .gitignore          # Ignores .class, __pycache__, and editor files
├── README.md           # Assignment documentation and run guide
├── ShoppingBill.java   # Java source code
└── shopping_bill.py    # Python source code
```

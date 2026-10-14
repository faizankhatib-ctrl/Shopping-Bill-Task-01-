# Task 01: Shopping Bill — GST First, Discount After

**Internship Program:** Python Programming Internship  
**Organization:** Kiran Academy  

---

## 📌 Project Overview
This repository contains the Python implementation for **Task 01: Shopping Bill — GST First, Discount After**.

The objective of this assignment is to calculate the final billing amount for 5 purchased items categorized into three specific product departments:
- **Electronics:** Items `a` and `b` (18% GST)
- **Fashion:** Items `c` and `d` (13% GST)
- **Food:** Item `e` (7% GST)

---

## 📐 Calculation Rules & Billing Sequence

1. **Category GST (GST First):**
   - **Electronics:** `(a + b) + 18% GST`
   - **Fashion:** `(c + d) + 13% GST`
   - **Food:** `e + 7% GST`
2. **Total Bill after GST:**
   - Sum of the three category amounts: `Electronics + Fashion + Food`
3. **Discount Calculation (Discount After):**
   - A **20% discount** is calculated on the total GST-inclusive bill: `Discount = Total * 0.20`
4. **Final Payable Amount:**
   - `Final Amount = Total after GST - Discount`

---

## 📁 Python Functions Specification

All functions are implemented in [`shopping_bill.py`](file:///d:/Kiran%20Academy%20internship%20Tasks/Task1/shopping_bill.py):

| Function | Parameters | Description | Return Type |
| :--- | :--- | :--- | :--- |
| `calculateElectronicsGST(a, b)` | `a, b` | Adds items `a` and `b`, applies 18% GST | `float` |
| `calculateFashionGST(c, d)` | `c, d` | Adds items `c` and `d`, applies 13% GST | `float` |
| `calculateFoodGST(e)` | `e` | Applies 7% GST to item `e` | `float` |
| `totalBill(a, b, c, d, e)` | `a, b, c, d, e` | Calls the 3 GST functions, sums their returned amounts, and returns the total | `float` |
| `calculateDiscountedBill(a, b, c, d, e)` | `a, b, c, d, e` | Calls `totalBill()`, deducts a 20% discount, and returns final payable amount | `float` |

> [!NOTE]
> All item values are passed directly as function arguments. No `input()` or interactive user prompts are used.

---

## 🧪 Sample Test Values & Expected Output

### Input Arguments
- `a = 100.00` (Electronics Item 1)
- `b = 100.00` (Electronics Item 2)
- `c = 100.00` (Fashion Item 1)
- `d = 100.00` (Fashion Item 2)
- `e = 100.00` (Food Item)

### Expected Output
```text
Electronics after GST: 236.00
Fashion after GST: 226.00
Food after GST: 107.00
Total after GST: 569.00
Discount (20%): 113.80
Final payable amount: 455.20
```

---

## 🚀 How to Run

Execute the script from the project root:

```bash
python shopping_bill.py
```

---

## 📂 Project Structure

```text
Shopping-Bill-Task-01/
├── .gitignore          # Ignores __pycache__, bytecode, and IDE files
├── README.md           # Documentation, function references, and instructions
└── shopping_bill.py    # Python source code
```

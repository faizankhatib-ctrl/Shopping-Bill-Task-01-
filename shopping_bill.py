"""
Task 01: Shopping Bill — GST First, Discount After
Kiran Academy - Python Programming Internship

Description:
Calculates the shopping bill for five items categorized as:
- Electronics: Items 'a' and 'b' (18% GST)
- Fashion: Items 'c' and 'd' (13% GST)
- Food: Item 'e' (7% GST)

Billing Sequence:
1. Apply GST to each category first.
2. Sum the GST-inclusive category amounts to get the total bill.
3. Calculate and deduct a 20% discount on the GST-inclusive total bill.
4. Return and display the final payable amount.
"""


def calculateElectronicsGST(a, b):
    """
    Adds items a and b, then applies 18% GST.
    """
    subtotal = a + b
    gst = subtotal * 0.18
    return subtotal + gst


def calculateFashionGST(c, d):
    """
    Adds items c and d, then applies 13% GST.
    """
    subtotal = c + d
    gst = subtotal * 0.13
    return subtotal + gst


def calculateFoodGST(e):
    """
    Applies 7% GST to item e.
    """
    subtotal = e
    gst = subtotal * 0.07
    return subtotal + gst


def totalBill(a, b, c, d, e):
    """
    Calls the three GST functions, adds their returned amounts,
    and returns the total bill after GST.
    """
    electronics_total = calculateElectronicsGST(a, b)
    fashion_total = calculateFashionGST(c, d)
    food_total = calculateFoodGST(e)
    return electronics_total + fashion_total + food_total


def calculateDiscountedBill(a, b, c, d, e):
    """
    Calls totalBill(), calculates a 20% discount on the GST-inclusive total,
    subtracts the discount, and returns the final payable amount.
    """
    total = totalBill(a, b, c, d, e)
    discount = total * 0.20
    final_amount = total - discount
    return final_amount


def main():
    # Sample test values specified in assignment
    a = 100.0
    b = 100.0
    c = 100.0
    d = 100.0
    e = 100.0

    # Calculate individual category amounts after GST
    electronics_after_gst = calculateElectronicsGST(a, b)
    fashion_after_gst = calculateFashionGST(c, d)
    food_after_gst = calculateFoodGST(e)

    # Calculate total after GST and discount details
    total_after_gst = totalBill(a, b, c, d, e)
    discount_amount = total_after_gst * 0.20
    final_payable = calculateDiscountedBill(a, b, c, d, e)

    # Display results formatted to two decimal places
    print(f"Electronics after GST: {electronics_after_gst:.2f}")
    print(f"Fashion after GST: {fashion_after_gst:.2f}")
    print(f"Food after GST: {food_after_gst:.2f}")
    print(f"Total after GST: {total_after_gst:.2f}")
    print(f"Discount (20%): {discount_amount:.2f}")
    print(f"Final payable amount: {final_payable:.2f}")


if __name__ == "__main__":
    main()

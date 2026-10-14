import java.util.Locale;

/**
 * Task 01: Shopping Bill — GST First, Discount After
 * Kiran Academy - Java and Python Programming Internship
 * 
 * Description:
 * Calculates the shopping bill for five items categorized as:
 * - Electronics: Items 'a' and 'b' (18% GST)
 * - Fashion: Items 'c' and 'd' (13% GST)
 * - Food: Item 'e' (7% GST)
 * 
 * Billing Sequence:
 * 1. Apply GST to each category first.
 * 2. Sum the GST-inclusive category amounts to get the total bill.
 * 3. Calculate and deduct a 20% discount on the GST-inclusive total bill.
 * 4. Return and display the final payable amount.
 */
public class ShoppingBill {

    /**
     * Adds items a and b, then applies 18% GST.
     * 
     * @param a Amount of electronics item 1
     * @param b Amount of electronics item 2
     * @return Total electronics amount after 18% GST
     */
    public static double calculateElectronicsGST(double a, double b) {
        double subtotal = a + b;
        double gst = subtotal * 0.18;
        return subtotal + gst;
    }

    /**
     * Adds items c and d, then applies 13% GST.
     * 
     * @param c Amount of fashion item 1
     * @param d Amount of fashion item 2
     * @return Total fashion amount after 13% GST
     */
    public static double calculateFashionGST(double c, double d) {
        double subtotal = c + d;
        double gst = subtotal * 0.13;
        return subtotal + gst;
    }

    /**
     * Applies 7% GST to item e.
     * 
     * @param e Amount of food item
     * @return Food amount after 7% GST
     */
    public static double calculateFoodGST(double e) {
        double subtotal = e;
        double gst = subtotal * 0.07;
        return subtotal + gst;
    }

    /**
     * Calls the three GST methods, adds their returned amounts,
     * and returns the total bill after GST.
     * 
     * @param a Amount of electronics item 1
     * @param b Amount of electronics item 2
     * @param c Amount of fashion item 1
     * @param d Amount of fashion item 2
     * @param e Amount of food item
     * @return Total bill after GST
     */
    public static double totalBill(double a, double b, double c, double d, double e) {
        double electronicsTotal = calculateElectronicsGST(a, b);
        double fashionTotal = calculateFashionGST(c, d);
        double foodTotal = calculateFoodGST(e);
        return electronicsTotal + fashionTotal + foodTotal;
    }

    /**
     * Calls totalBill(), calculates a 20% discount on the GST-inclusive total,
     * subtracts the discount, and returns the final payable amount.
     * 
     * @param a Amount of electronics item 1
     * @param b Amount of electronics item 2
     * @param c Amount of fashion item 1
     * @param d Amount of fashion item 2
     * @param e Amount of food item
     * @return Final payable amount after discount
     */
    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        double finalAmount = total - discount;
        return finalAmount;
    }

    public static void main(String[] args) {
        // Sample test values specified in assignment
        double a = 100.0;
        double b = 100.0;
        double c = 100.0;
        double d = 100.0;
        double e = 100.0;

        // Calculate individual category amounts after GST
        double electronicsAfterGst = calculateElectronicsGST(a, b);
        double fashionAfterGst = calculateFashionGST(c, d);
        double foodAfterGst = calculateFoodGST(e);

        // Calculate total after GST and discount details
        double totalAfterGst = totalBill(a, b, c, d, e);
        double discountAmount = totalAfterGst * 0.20;
        double finalPayable = calculateDiscountedBill(a, b, c, d, e);

        // Display results formatted to two decimal places
        System.out.printf(Locale.US, "Electronics after GST: %.2f%n", electronicsAfterGst);
        System.out.printf(Locale.US, "Fashion after GST: %.2f%n", fashionAfterGst);
        System.out.printf(Locale.US, "Food after GST: %.2f%n", foodAfterGst);
        System.out.printf(Locale.US, "Total after GST: %.2f%n", totalAfterGst);
        System.out.printf(Locale.US, "Discount (20%%): %.2f%n", discountAmount);
        System.out.printf(Locale.US, "Final payable amount: %.2f%n", finalPayable);
    }
}

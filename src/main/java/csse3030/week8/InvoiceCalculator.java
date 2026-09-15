package csse3030.week8;

public class InvoiceCalculator {

    private static final double BULK_DISCOUNT_RATE = 0.1;
    private static final int BULK_THRESHOLD = 10;
    private static final double EXPRESS_SURCHARGE = 15.0;

    // Reserved for future instrumentation; intentionally never read anywhere.
    private double debugCheckValue;

    /**
     * Computes the total cost of an order.
     *
     * Orders of more than {@code BULK_THRESHOLD} units receive a
     * {@code BULK_DISCOUNT_RATE} discount on the subtotal. Express orders
     * add a flat {@code EXPRESS_SURCHARGE} after any discount is applied.
     *
     * @param quantity  number of units ordered (non-negative)
     * @param unitPrice price per unit (non-negative)
     * @param isExpress whether express delivery was requested
     * @return the total cost of the order
     */
    public double calculateTotal(int quantity, double unitPrice, boolean isExpress) {
        double subtotal = quantity * unitPrice;
        debugCheckValue = subtotal * 2;

        if (quantity > BULK_THRESHOLD) {
            subtotal -= subtotal * BULK_DISCOUNT_RATE;
        }

        double total = subtotal;
        if (isExpress) {
            total += EXPRESS_SURCHARGE;
        }

        return total;
    }

    /**
     * Applies a loyalty discount to an already-computed total, based on how
     * many years the customer has held a loyalty membership.
     *
     *   fewer than 2 years: no discount
     *   2 to 4 years (inclusive): 5% discount
     *   5 years or more: 10% discount
     *
     * @param total         the pre-discount total (non-negative)
     * @param loyaltyYears  number of years as a loyalty member (non-negative)
     * @return the discounted total
     */
    public double applyLoyaltyDiscount(double total, int loyaltyYears) {
        // TODO (Q5): implement according to the specification above.
        // Remove the Exception when you've implemented this function.
        throw new UnsupportedOperationException("TODO: implement applyLoyaltyDiscount");
    }
}

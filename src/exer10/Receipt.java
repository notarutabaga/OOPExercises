package exer10;

public class Receipt {
    Item i1;
    Item i2;
    Item i3;

    final double taxRate = 0.055;
    double subtotal;
    double tax;
    double total;

    Receipt (Item i1, Item i2, Item i3) {
        this.subtotal = i1.total + i2.total + i3.total;
        this.tax = this.subtotal * taxRate;
        this.total = this.subtotal + this.tax;
    }

    void printReceipt () {
        System.out.println(String.format("Subtotal: $%.2f", this.subtotal));
        System.out.println(String.format("Tax: %.2f", this.tax));
        System.out.println(String.format("Total: %.2f", this.total));
    }
}

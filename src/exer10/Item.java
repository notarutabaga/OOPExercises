package exer10;

public class Item {
    double price;
    int quantity;
    double total;

    Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }
}

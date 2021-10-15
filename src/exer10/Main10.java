package exer10;

import java.util.Scanner;

public class Main10 {
    Scanner scanboi = new Scanner(System.in);

    System.out.print("Enter the price of item 1: ");
    double price = scanboi.nextDouble();
    System.out.print("Enter the quantity of item 1: ");
    int quantity = scanboi.nextInt();
    Item i1 = new Item(price, quantity);

    System.out.print("Enter the price of item 2: ");
    price = scanboi.nextDouble();
    System.out.print("Enter the quantity of item 2: ");
    quantity = scanboi.nextInt();
    Item i2 = new Item(price, quantity);

    System.out.print("Enter the price of item 3: ");
    price = scanboi.nextDouble();
    System.out.print("Enter the quantity of item 3: ");
    quantity = scanboi.nextInt();
    Item i3 = new Item(price, quantity);

    Receipt receipt = new Receipt(i1, i2, i3);
    receipt.printReceipt();
}

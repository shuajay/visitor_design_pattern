package client;

import visitable.Book;
import visitable.Fruit;
import visitable.ItemElement;
import visitor.ShoppingCartVisitor;
import visitor.ShoppingCartVisitorImplementation;

public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[]{new Book(20.0, "1123"), new Book(50.5, "2121"),
        new Fruit(5.5, 2, "Bananas"), new Fruit(8.4, 5, "Strawberries")};

        double total = calculatePrice(itemElements);
        System.out.println("Total Cost = $ " + total);

    }

    private static double calculatePrice(ItemElement[] itemElements){
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImplementation();
        double sum = 0;
        for (ItemElement itemElement: itemElements) {
            sum += itemElement.accept(visitor);
        }
        return sum;
    }
}

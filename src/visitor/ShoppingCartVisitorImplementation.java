package visitor;

import visitable.Book;
import visitable.Fruit;

public class ShoppingCartVisitorImplementation implements ShoppingCartVisitor{
    @Override
    public double visit(Book book) {
        double cost = 0;
        if (book.getPrice() > 50.0){
            cost = book.getPrice() - 2;
        }else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN:: " + book.getIsbnNumber() + " cost: $ " + cost);
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " Cost: $ " + cost);
        return cost;
    }
}

package visitor;

import visitable.Book;
import visitable.Fruit;

public interface ShoppingCartVisitor {
    double visit(Book book);
    double visit(Fruit fruit);
}

package visitable;

import visitor.ShoppingCartVisitor;

public interface ItemElement {
    double accept (ShoppingCartVisitor visitor);
}

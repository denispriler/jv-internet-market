package internet.market.service;

import internet.market.model.Product;
import internet.market.model.ShoppingCart;

public interface ShoppingCartService extends GenericService<ShoppingCart, Long> {

    ShoppingCart addProduct(ShoppingCart shoppingCart, Product product);

    boolean deleteProduct(ShoppingCart shoppingCart, Product product);

    void clear(ShoppingCart shoppingCart);

    ShoppingCart getByUserId(Long userId);

    boolean delete(ShoppingCart shoppingCart);
}

package Products;

import java.util.Objects;
import static Products.ProductsList.addProductToList;

public class Products {
    private String name;
    private int price;

    public Products(String name, int price) {
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0) {
            this.name = name;
            this.price = price;
            addProductToList(this);
        } else {
            throw new RuntimeException("Заполните карточку товара " + name + " корректно!");
        }
    }

    @Override
    public String toString() {
        return name +
                " - стоимость" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return price == products.price && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
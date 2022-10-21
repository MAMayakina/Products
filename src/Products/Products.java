package Products;

import java.util.Objects;

public class Products {
    String name;
    int price;
    int requiredQuantity;

    public Products(String name, int price, int requiredQuantity) {
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0 && requiredQuantity > 0) {
            this.name = name;
            this.price = price;
            this.requiredQuantity = requiredQuantity;
        } else {
            throw new RuntimeException("Заполните карточку товара " + name + " корректно!");
        }
    }

    @Override
    public String toString() {
        return name + " (" + price + "руб/кг)" + " - " + requiredQuantity + "кг";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return price == products.price && requiredQuantity == products.requiredQuantity && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, requiredQuantity);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }




}
import java.util.LinkedList;
import java.util.List;
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

    private static List<Products> listOfProducts = new LinkedList<>();

    public static void addListOfProducts(Products newProduct) {
        if (listOfProducts.size() != 0) {
            for (Products product : listOfProducts) {
                if (product.getName().equals(newProduct.getName())) {
                    throw new RuntimeException("Данный продукт уже есть!");
                }
            }
        }
        listOfProducts.add(newProduct);
        System.out.println(newProduct.getName() + " успешно добавлен!");
    }

    public static void сheckProductInList(String nameToCheck) {
        boolean check = false;
        for (Products product : listOfProducts) {
            if (product.getName().equals(nameToCheck)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(nameToCheck + " уже куплен!");
        } else {
            System.out.println(nameToCheck + " еще не куплен!");
        }
    }

    public static void removeProductInList(String nameToRemove) {
        boolean check = false;
        for (Products product : listOfProducts) {
            if (product.getName().equals(nameToRemove)) {
                listOfProducts.remove(product);
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(nameToRemove + " удален из множества!");
        } else {
            System.out.println("Продукт " + nameToRemove + " не найден в множестве!");
        }
    }

    public static void printListOfProduct() {
        System.out.println("*** Список продуктов: ");
        int count = 1;
        for (Products product : listOfProducts) {
            System.out.println(count + ". " + product.getName() + " (" + product.getPrice() + "руб/кг)" + " - " + product.getRequiredQuantity() + "кг");
        count++;
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

    public static List<Products> getListOfProducts() {
        return listOfProducts;
    }


}
package Products;

import java.util.LinkedList;
import java.util.List;

public class ProductsList {

    public static List<Products> productsList = new LinkedList<>();

    public ProductsList() {
    }

    public static void printListOfProduct() {
        System.out.println("*** Список продуктов: ");

        for (Products products : productsList) {
            System.out.println(products.getName()+" - "+products.getPrice()+" руб");
        }
    }

    protected static void addProductToList(Products newProduct) {
        if (productsList.size() != 0) {
            for (Products products : productsList) {
                if (products.getName().equals(newProduct.getName())) {
                    throw new RuntimeException("Данный продукт уже есть!");
                }
            }
       }
            productsList.add(newProduct);
            System.out.println(newProduct.getName() + " успешно добавлен!");
    }

    public static boolean removeProductOnList(String nameToRemove) {
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(nameToRemove)) {
                productsList.remove(i);
                System.out.println(nameToRemove + " удален из множества!");
                return true;
            }
        }
        System.out.println("Продукт " + nameToRemove + " не найден в множестве!");
        return false;
    }

    public static boolean сheckProductInList(String nameToCheck) {
        for (Products product : productsList) {
            if (product.getName().equals(nameToCheck)) {
                System.out.println(nameToCheck + " уже куплен!");
                return true;
            }
        }
        System.out.println(nameToCheck + " еще не куплен!");
        return false;
    }

    public static List<Products> getProductsList() {
        return productsList;
    }
}

package Products;

import Products.Products;

import java.util.LinkedList;
import java.util.List;

public class ListOfProduct {
    private static List<Products> listOfProducts = new LinkedList<>();


    public ListOfProduct() {
    }


    public static void printListOfProduct() {
        System.out.println("*** Список продуктов: ");
        int count = 1;
        for (Products product : listOfProducts) {
            System.out.println(count + ". " + product.getName() + " (" + product.getPrice() + "руб/кг)" + " - " + product.getRequiredQuantity() + "кг");
            count++;
        }
    }

    public static void addProductToList(Products newProduct) {
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

    public static boolean removeProductInList(String nameToRemove) {
        boolean check = false;
        for (Products product : listOfProducts) {
            if (product.getName().equals(nameToRemove)) {
                listOfProducts.remove(product);
                System.out.println(nameToRemove + " удален из множества!");
                return true;
            }
        }
        System.out.println("Продукт " + nameToRemove + " не найден в множестве!");
        return false;
    }

    public static boolean сheckProductInList(String nameToCheck) {
        for (Products product : listOfProducts) {
            if (product.getName().equals(nameToCheck)) {
                System.out.println(nameToCheck + " уже куплен!");
                return true;
            }
        }
        System.out.println(nameToCheck + " еще не куплен!");
        return false;
    }

    public static List<Products> getListOfProducts() {
        return listOfProducts;
    }
}

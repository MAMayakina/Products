package Recipes;

import Products.ProductsList;
import ProductsForRecipe.ProductsForRecipe;
import ProductsForRecipe.ProductsForRecipeList;

import java.util.HashMap;
import java.util.Map;

public class RecipesSet {
    private static Map<String, ProductsForRecipe[]> setOfRecipes = new HashMap();

    public RecipesSet() {
    }

    protected static void addNewRecipe(String nameOfRecipe, ProductsForRecipe... productsForRecipe) {
        setOfRecipes.put(nameOfRecipe, productsForRecipe);
        System.out.println("Рецепт \"" + nameOfRecipe + "\" успешно добавлен!");
    }

    public static void printAllRecipes() {
        if (setOfRecipes.size() != 0) {
            System.out.println("***Книга рецептов***");
            for (Map.Entry<String, ProductsForRecipe[]> recipe : setOfRecipes.entrySet()) {
                int totalCostOfProducts = 0;
                for (ProductsForRecipe products : recipe.getValue()) {
                    totalCostOfProducts = totalCostOfProducts + products.getRequiredQuantity() * getPrice(products.getProductForRecipe());
                }

                System.out.print("Рецепт \"" + recipe.getKey() + "\": ");
                for (ProductsForRecipe productForRecipe : recipe.getValue()) {
                    productForRecipe.printProductForRecipe();
                }
                System.out.println("- общая стоимость продуктов " + totalCostOfProducts + "руб");
            }

        } else {
            System.out.println("В книге еще нет рецептов!");
        }
    }

    public static int getPrice(String nameOfProduct) {
        for (int i = 0; i < ProductsList.productsList.size(); i++) {
            if (ProductsList.productsList.get(i).getName().equals(nameOfProduct)) {
                return ProductsList.productsList.get(i).getPrice();
            }

        }
        throw new RuntimeException("Совпадений не найдено");
    }

}

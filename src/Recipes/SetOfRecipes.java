package Recipes;

import Products.Products;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetOfRecipes {
    public static Set<Recipes> recipes = new HashSet<>();

    public static void printAllRecipes() {
        System.out.println("***Книга рецептов");
        for (Recipes recipe : recipes) {
            System.out.print(recipe.getNameOfRecipe() + ": ");
          for (Map.Entry<Products, Integer> entry : recipe.getProducts().entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue() + "кг, ");
          }
          System.out.println("Общая стоимость продуктов "+recipe.getTotalCostReceipe() + "руб");
        }
    }
}

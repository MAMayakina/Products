package Recipe;

import Recipe.Recipe;

import java.util.HashSet;
import java.util.Set;

public class SetOfRecipe {
    private static Set<Recipe> setOfRecipes = new HashSet<Recipe>();

    public SetOfRecipe() {
    }

    public static void addSetOfRecipes(Recipe newRecipe) {
        if (setOfRecipes.size() != 0) {
            for (Recipe recipe : setOfRecipes) {
                if (recipe.getName().equals(newRecipe.getName())) {
                    throw new RuntimeException("Данный рецепт уже есть!");
                }
            }
        }
        setOfRecipes.add(newRecipe);
        System.out.println("Рецепт " + newRecipe.getName() + " успешно добавлен!");
    }

    public static void printSetOfRecipes() {
        System.out.println("*** Список рецептов: ");
        int count = 1;
        for (Recipe recipe : setOfRecipes) {
            System.out.println(count + ". " + recipe.getName() + ": ");
            System.out.print("Продукты: ");
            Recipe.printProductsForRecipe(recipe);
            System.out.println();
            System.out.println("Стоимость всех продуктов у данного рецепта - " + recipe.getTotalCostOfProducts() + "руб.");
            count++;
        }
    }

    public static Set<Recipe> getSetOfRecipes() {
        return setOfRecipes;
    }
}

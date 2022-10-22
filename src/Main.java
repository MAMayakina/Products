import Products.Products;
import ProductsForRecipe.ProductsForRecipe;
import Recipes.Recipes;

import static Products.ProductsList.*;
import static Recipes.RecipesSet.printAllRecipes;

public class Main {
    public static void main(String[] args) {
        //Добавление продуктов
        Products potato = new Products("Картофель", 30);
        Products carrot = new Products("Морковь", 40);
        Products onion = new Products("Лук", 30);
        Products meat = new Products("Мясо", 500);

        сheckProductInList("Лук");
        сheckProductInList("Томат");

        removeProductOnList("Томат");
        removeProductOnList("Морковь");

        System.out.println();
        printListOfProduct();

        //Рецепты
        System.out.println();
        Recipes recipe1 = new Recipes("Картофель с мясом", new ProductsForRecipe("Картофель", 2), new ProductsForRecipe("Мясо", 1), new ProductsForRecipe("Лук", 1));
        Recipes recipe2 = new Recipes("Драники", new ProductsForRecipe("Картофель", 2));
        Recipes recipe3 = new Recipes("Шашлык", new ProductsForRecipe("Мясо", 1), new ProductsForRecipe("Лук", 1));

        System.out.println();
        printAllRecipes();
    }
}
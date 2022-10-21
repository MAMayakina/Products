
import Products.Products;
import Recipe.Recipe;

import static Products.ListOfProduct.*;
import static Recipe.SetOfRecipe.addSetOfRecipes;
import static Recipe.SetOfRecipe.printSetOfRecipes;


public class Main {
    public static void main(String[] args) {
        //Добавление продуктов
        addProductToList(new Products("Морковь", 40, 1));
        addProductToList(new Products("Лук", 30, 1));
        addProductToList(new Products("Мясо", 500, 2));

        сheckProductInList("Лук");
        сheckProductInList("Томат");

        removeProductInList("Лук");
        removeProductInList("Томат");

        System.out.println();
        printListOfProduct();

        //Рецепты
        System.out.println();
        addSetOfRecipes(new Recipe("Картофель с мясом", new Products("Картофель", 50, 2), new Products("Мясо", 500, 1), new Products("Лук", 30, 1)));
        addSetOfRecipes(new Recipe("Драники", new Products("Картофель", 50, 2)));
        addSetOfRecipes(new Recipe("Шашлык", new Products("Мясо", 500, 1), new Products("Лук", 30, 1)));

        System.out.println();
        printSetOfRecipes();
    }

}
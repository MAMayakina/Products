import Products.Products;
import Recipes.Recipes;
import Recipes.SetOfRecipes;
import static Products.ProductsList.*;

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
        Recipes recipe1 = new Recipes("Картофель с мясом");
        recipe1.addProductInReceipe(potato, 3);
        recipe1.addProductInReceipe(meat, 4);
        recipe1.addProductInReceipe(onion, 1);

        Recipes recipe2 = new Recipes("Драники");
        recipe2.addProductInReceipe(potato, 2);

        Recipes recipe3 = new Recipes("Шашлык");
        recipe3.addProductInReceipe(meat, 4);
        recipe3.addProductInReceipe(onion, 1);

        SetOfRecipes.printAllRecipes();

    }
}
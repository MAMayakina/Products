public class Main {
    public static void main(String[] args) {
        //Добавление продуктов
        Products.addListOfProducts(new Products("Картофель", 50, 4));
        Products.addListOfProducts(new Products("Морковь", 40, 1));
        Products.addListOfProducts(new Products("Лук", 30, 1));
        Products.addListOfProducts(new Products("Мясо", 500, 2));

        //Вывод на печать
        System.out.println();
        Products.printListOfProduct();

       /* //Проверка продуктов
        System.out.println();
        Products.сheckProductInSet("Лук");
        Products.сheckProductInSet("Томат");

        //Удаление продуктов
        System.out.println();
        Products.removeProductInSet("Лук");
        Products.removeProductInSet("Томат");

        //Вывод на печать
        System.out.println();
        Products.printSetOfProduct();
*/
        //Рецепты
        System.out.println();
        Recipe.addSetOfRecipes(new Recipe("Картофель с мясом", new Products("Картофель", 50, 2), new Products("Мясо", 500, 1), new Products("Лук", 30, 1)));
        Recipe.addSetOfRecipes(new Recipe("Драники", new Products("Картофель", 50, 2)));
        Recipe.addSetOfRecipes(new Recipe("Шашлык", new Products("Мясо", 500, 1), new Products("Лук", 30, 1)));

        //Вывод на печать
        System.out.println();
        Recipe.printSetOfRecipes();
    }

}
import java.util.*;

public class Recipe {
    private String name;
    private Products productsForRecipe;
    private int totalCostOfProducts;
    private List<Products> listProductsForRecipe = new LinkedList<Products>();
    private static Set<Recipe> setOfRecipes = new HashSet<Recipe>();

    public Recipe(String name, Products... productsForRecipe) {
        this.name = name;

        for (Products product : productsForRecipe) {
            this.listProductsForRecipe.add(product);
        }

        totalCostOfProducts = 0;
        for (Products product : listProductsForRecipe) {
            totalCostOfProducts = totalCostOfProducts + product.getPrice() * product.getRequiredQuantity();
        }
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
            printProductsForRecipe(recipe);
            System.out.println();
            System.out.println("Стоимость всех продуктов у данного рецепта - " + recipe.totalCostOfProducts + "руб.");
            count++;
        }
    }

    private static void printProductsForRecipe(Recipe recipe) {
        for (Products product : recipe.listProductsForRecipe) {
            System.out.print(product.toString() + ", ");
        }
    }

    @Override
    public String toString() {
        return name + ": " + productsForRecipe.getName() + " (общая стоимость продуктов " + totalCostOfProducts + "руб)";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return totalCostOfProducts == recipe.totalCostOfProducts && Objects.equals(name, recipe.name) && Objects.equals(productsForRecipe, recipe.productsForRecipe) && Objects.equals(listProductsForRecipe, recipe.listProductsForRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productsForRecipe, totalCostOfProducts, listProductsForRecipe);
    }

    public String getName() {
        return name;
    }

    public Products getProductsForRecipe() {
        return productsForRecipe;
    }

    public int getTotalCostOfProducts() {
        return totalCostOfProducts;
    }

    public static Set<Recipe> getSetOfRecipes() {
        return setOfRecipes;
    }

    public List<Products> getListProductsForRecipe() {
        return listProductsForRecipe;
    }
}

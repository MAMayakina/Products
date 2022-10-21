package Recipe;

import Products.Products;

import java.util.*;

public class Recipe {
    private String name;
    private Products productsForRecipe;
    private int totalCostOfProducts;
    private List<Products> listProductsForRecipe = new LinkedList<Products>();

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

    public static void printProductsForRecipe(Recipe recipe) {
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

    public List<Products> getListProductsForRecipe() {
        return listProductsForRecipe;
    }
}

package Recipes;

import java.util.List;
import java.util.Objects;
import ProductsForRecipe.ProductsForRecipe;
import static Recipes.RecipesSet.addNewRecipe;

public class Recipes {
    private String nameOfRecipe;
    public static List<ProductsForRecipe> productsForRecipeList;

    public Recipes(String nameOfRecipe, ProductsForRecipe... productsForRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        addNewRecipe(nameOfRecipe, productsForRecipe);
    }

    @Override
    public String toString() {
        return nameOfRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(nameOfRecipe, recipes.nameOfRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public static List<ProductsForRecipe> getProductsForRecipeList() {
        return productsForRecipeList;
    }
}

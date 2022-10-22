package ProductsForRecipe;

import java.util.*;

public class ProductsForRecipeList {
    public static List<ProductsForRecipe> productsForRecipeList = new LinkedList<ProductsForRecipe>();

    public ProductsForRecipeList() {
    }

    protected static void addProductsForRecipeList(ProductsForRecipe productForRecipe) {
        productsForRecipeList.add(productForRecipe);
    }


    public static List<ProductsForRecipe> getProductsForRecipeList() {
        return productsForRecipeList;
    }

}

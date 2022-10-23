package Recipes;

import Products.Products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static Recipes.SetOfRecipes.recipes;

public class Recipes {
    private String nameOfRecipe;
    private Map<Products, Integer> products = new HashMap<>();
    private int totalCostReceipe;

    public Recipes(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostReceipe = 0;
        recipes.add(this);
    }

    public void addProductInReceipe(Products product, int requiredQuantity) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Продукт уже добавлен в рецепт!");
        }
        products.put(product, requiredQuantity);
        totalCostReceipe = totalCostReceipe + product.getPrice() * requiredQuantity;
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
        return totalCostReceipe == recipes.totalCostReceipe && Objects.equals(nameOfRecipe, recipes.nameOfRecipe) && Objects.equals(products, recipes.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, products, totalCostReceipe);
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public Map<Products, Integer> getProducts() {
        return products;
    }

    public int getTotalCostReceipe() {
        return totalCostReceipe;
    }
}

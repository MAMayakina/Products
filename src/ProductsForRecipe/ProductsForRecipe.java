package ProductsForRecipe;

import java.util.Objects;

import static Products.ProductsList.productsList;
import static ProductsForRecipe.ProductsForRecipeList.addProductsForRecipeList;

public class ProductsForRecipe {
    private String productForRecipe;
    private Integer requiredQuantity;

    public ProductsForRecipe(String productForRecipe, Integer requiredQuantity) {
        boolean check = false;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(productForRecipe)) {
                this.productForRecipe = productForRecipe;
                this.requiredQuantity = requiredQuantity;
                check = true;
                addProductsForRecipeList(this);
            }
        }
        if (!check) {
            throw new RuntimeException("Не можем использовать " + productForRecipe + " для рецепта - его не было в списке!");
        }
    }

    @Override
    public String toString() {
        return productForRecipe + " (необходимо " + requiredQuantity + " кг)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsForRecipe that = (ProductsForRecipe) o;
        return Objects.equals(productForRecipe, that.productForRecipe) && Objects.equals(requiredQuantity, that.requiredQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productForRecipe, requiredQuantity);
    }

    public void printProductForRecipe() {
        System.out.print(productForRecipe + " (необходимо " + requiredQuantity + "кг), ");
    }

    public String getProductForRecipe() {
        return productForRecipe;
    }

    public Integer getRequiredQuantity() {
        return requiredQuantity;
    }
}

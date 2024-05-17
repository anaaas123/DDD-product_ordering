package mk.finki.ukim.emt.productcatalog.domain.models;

public class Category extends AbstractEntity<ProductId> {
    private String categoryName;

    private Category() {
        super(ProductId.randomId(ProductId.class));
    }

    public static Category build(String categoryName) {
        Category c = new Category();
        c.categoryName = categoryName;
        return c;
    }
}

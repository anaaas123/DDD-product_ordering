package mk.finki.ukim.emt.productcatalog.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="product")
@Getter
public class Product extends AbstractEntity<ProductId> {

    private String productName;

    private int sales = 0;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })
    private Money price;

    private List<Category> categories;
    private Manufacturer manufacturer;

    private Product() {
        super(ProductId.randomId(ProductId.class));
    }

    public static Product build(String productName, Money price, int sales, List<Category> categories, Manufacturer manufacturer) {
        Product p = new Product();
        p.price = price;
        p.productName = productName;
        p.sales = sales;
        p.categories = new ArrayList<>();
        for (Category category : categories) {
            p.categories.add(category);
        }
        p.manufacturer = manufacturer;
        return p;
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        this.categories.remove(category);
    }

    public void addSales(int qty) {
        this.sales = this.sales - qty;
    }

    public void removeSales(int qty) {
        this.sales -= qty;
    }
}


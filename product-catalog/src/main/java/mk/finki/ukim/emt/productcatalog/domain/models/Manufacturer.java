package mk.finki.ukim.emt.productcatalog.domain.models;

public class Manufacturer extends AbstractEntity<ProductId> {
    private String manufacturerName;

    private Manufacturer() {
        super(ProductId.randomId(ProductId.class));
    }

    public static Manufacturer build(String manufacturerName) {
        Manufacturer m = new Manufacturer();
        m.manufacturerName = manufacturerName;
        return m;
    }
}

package mk.finki.ukim.emt.productcatalog.services.form;

import lombok.Data;

@Data
public class ProductForm {

    private String productName;
    private Money price;
    private int sales;
}


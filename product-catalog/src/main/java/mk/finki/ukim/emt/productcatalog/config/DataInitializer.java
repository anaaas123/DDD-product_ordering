package mk.finki.ukim.emt.productcatalog.config;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {

    private final ProductRepository productRepository;

    @PostConstruct
    public void initData() {
        Product p1 = Product.build("Pizza", Money.valueOf(Currency.MKD,500), 10);
        Product p2 = Product.build("Ice Cream", Money.valueOf(Currency.MKD,100), 5);
        if (productRepository.findAll().isEmpty()) {
            productRepository.saveAll(Arrays.asList(p1,p2));
        }
    }
}


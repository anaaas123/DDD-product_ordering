package mk.finki.ukim.emt.sharedkernel.infra.orders;

import lombok.Getter;
import mk.finki.ukim.emt.sharedkernel.config.TopicHolder;
import mk.finki.ukim.emt.sharedkernel.events.DomainEvent;

@Getter
public class OrderItemCreated extends DomainEvent {

    private String productId;
    private int quantity;

    public OrderItemCreated(String topic) {
        super(TopicHolder.TOPIC_ORDER_ITEM_CREATED);
    }

    public OrderItemCreated(String productId, int quantity) {
        super(TopicHolder.TOPIC_ORDER_ITEM_CREATED);
        this.productId = productId;
        this.quantity = quantity;
    }
}

package mk.finki.ukim.emt.sharedkernel.infra;

import mk.finki.ukim.emt.sharedkernel.events.DomainEvent;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}

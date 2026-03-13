package main.java.com.example.inventory_service.consumer;

@Service
public class InventoryConsumer {

    @KafkaListener(topics = "order-topic", groupId = "inventory-group")
    public void consume(String message) {

        System.out.println("Inventory Updated for Order: " + message);
    }
}

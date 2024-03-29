package practice.jpa.dto;

import lombok.Data;
import practice.jpa.domain.Address;
import practice.jpa.domain.Order;
import practice.jpa.domain.OrderStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderDto {
    private Long orderId;
    private String name;
    private LocalDate orderDate;
    private OrderStatus orderStatus;
    private Address address;
    private List<OrderItemDto> orderItems;

    public OrderDto(Order order) {
        orderId = order.getId();
        name = order.getCustomer().getName();
        orderDate = order.getOrderDate();
        orderStatus = order.getOrderStatus();
        address = order.getCustomer().getAddress();

        orderItems = order.getOrderItems()
                .stream()
                .map(o -> new OrderItemDto(o))
                .collect(Collectors.toList());

    }
}

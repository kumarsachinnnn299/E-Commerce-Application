package com.ecommerce.project.payload;

import com.ecommerce.project.model.Order;
import com.ecommerce.project.model.Product;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    private Long orderItemId;
    private ProductDTO product;
    private Integer quantity;
    private double discount;
    private  double orderedProductPrice;
}
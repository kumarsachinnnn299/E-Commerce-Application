package com.ecommerce.project.payload;
//This is a request object:i.e we send from postman TO SERVER

import lombok.AllArgsConstructor;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;

}

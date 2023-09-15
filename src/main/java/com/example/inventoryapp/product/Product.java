package com.example.inventoryapp.product;

import com.example.inventoryapp.category.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length=128, nullable=false,unique=true)
    private String name;

    private float price;

    @ManyToOne
    @JoinColumn(name= "category_id")
    private Category category;

}

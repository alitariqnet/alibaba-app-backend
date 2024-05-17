package com.AlHassanElectronics.Software.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import javax.xml.stream.events.Comment;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private boolean inStock;
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}

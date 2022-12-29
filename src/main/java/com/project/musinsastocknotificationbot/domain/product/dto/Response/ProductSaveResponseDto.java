package com.project.musinsastocknotificationbot.domain.product.dto.Response;

public class ProductSaveResponseDto {
    private long id;
    private String size;

    public ProductSaveResponseDto(long id, String size) {
        this.id = id;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public String getSize() {
        return size;
    }
}

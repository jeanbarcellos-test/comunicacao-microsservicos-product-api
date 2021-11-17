package br.com.cursoudemy.productapi.modules.category.dtos;

import org.springframework.beans.BeanUtils;

import br.com.cursoudemy.productapi.modules.category.models.Category;
import lombok.Data;

@Data
public class CategoryResponse {

    private Integer id;
    private String description;

    public static CategoryResponse of(Category category) {
        var response = new CategoryResponse();

        BeanUtils.copyProperties(category, response);

        return response;
    }
}

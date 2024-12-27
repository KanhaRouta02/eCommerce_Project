package org.kanha.myecommerceproject.service;


import org.kanha.myecommerceproject.model.Category;
import org.kanha.myecommerceproject.payload.CategoryDTO;
import org.kanha.myecommerceproject.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
     CategoryDTO saveCategory(CategoryDTO categoryDTO);

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);

}

package com.ay.restaurant.restImpl;

import com.ay.restaurant.constants.RestaurantConstants;
import com.ay.restaurant.pojo.Category;
import com.ay.restaurant.rest.CategoryRest;
import com.ay.restaurant.service.CategoryService;
import com.ay.restaurant.utils.RestaurantUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CategoryRestImpl implements CategoryRest {

    private final CategoryService categoryService;

    @Override
    public ResponseEntity<String> addNewCategory(Map<String,String> requestMap) {
        try {
            return categoryService.addNewCategory(requestMap);
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

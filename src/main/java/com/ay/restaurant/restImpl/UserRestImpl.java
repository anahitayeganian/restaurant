package com.ay.restaurant.restImpl;

import com.ay.restaurant.constants.RestaurantConstants;
import com.ay.restaurant.dto.UserDto;
import com.ay.restaurant.rest.UserRest;
import com.ay.restaurant.service.UserService;
import com.ay.restaurant.utils.RestaurantUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserRestImpl implements UserRest {

    private final UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String,String> requestMap) {
        try {
            return userService.signUp(requestMap);
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);  // 500
    }

    @Override
    public ResponseEntity<String> login(Map<String,String> requestMap) {
        try {
            return userService.login(requestMap);
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<List<UserDto>> getAllUsers() {
        try{
            return userService.getAllUsers();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return new ResponseEntity<List<UserDto>>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<String> updateStatus(Map<String, String> requestMap) {
        try{
            return userService.updateStatus(requestMap);
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

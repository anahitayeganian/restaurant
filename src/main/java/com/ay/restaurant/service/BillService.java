package com.ay.restaurant.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface BillService {

    public ResponseEntity<String> generateReport(Map<String,Object> requestMap);

}

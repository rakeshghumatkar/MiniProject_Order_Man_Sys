package com.onlinefoodordersystem.Food.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinefoodordersystem.Food.dto.Purchase;
import com.onlinefoodordersystem.Food.dto.PurchaseResponse;
import com.onlinefoodordersystem.Food.service.CheckoutService;



@RestController
@CrossOrigin()
@RequestMapping("/api/checkout")
public class CheckoutController {
	private CheckoutService checkoutService;


    public void checkoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse purchase(@RequestBody Purchase purchase){
        PurchaseResponse response = this.checkoutService.placeOrder(purchase);
        return response;
    }
}

package com.onlinefoodordersystem.Food.service;

import com.onlinefoodordersystem.Food.dto.Purchase;
import com.onlinefoodordersystem.Food.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}

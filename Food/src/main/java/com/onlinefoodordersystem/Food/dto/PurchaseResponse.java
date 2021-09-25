package com.onlinefoodordersystem.Food.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class PurchaseResponse {

    public PurchaseResponse(String orderTrackingNumber2) {
		// TODO Auto-generated constructor stub
	}

	@NonNull
    private String orderTrackingNumber;
}
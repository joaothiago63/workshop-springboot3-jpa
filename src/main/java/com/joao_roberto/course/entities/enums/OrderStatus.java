	package com.joao_roberto.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code=code;
		
	}
	
   public int getCode() {
	   return code;
   }
   
   public static OrderStatus valueOf(int code) {
	for(OrderStatus status : OrderStatus.values()) {
		if(code == status.getCode()) {
			return status;
		}
		
	}
	throw new IllegalArgumentException("Invalid OrderStatus code"); 
   
   }
	
}

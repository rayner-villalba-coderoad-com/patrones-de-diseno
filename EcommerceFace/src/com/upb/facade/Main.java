package com.upb.facade;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("E-commerce!!!");

        UserAuthentication userAuthentication = new UserAuthentication();
        PaymentProcessing paymentProcessing = new PaymentProcessing();
        InventoryManagement inventoryManagement = new InventoryManagement();
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        ECommerceFacade eCommerceFacade = new ECommerceFacade(userAuthentication, paymentProcessing, inventoryManagement, orderFulfillment);

        eCommerceFacade.purchaseProduct("ray", "123", "Paypal", "1", 10);
    }
}

package com.shopping;

public abstract class NormalAcc extends ShopAcc {
    private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked with amount: " + amount + ". Delivery charges: " + deliveryCharges);
    }

    @Override
    public String toString() {
        return super.toString() + ", Delivery Charges: " + deliveryCharges;
    }
}

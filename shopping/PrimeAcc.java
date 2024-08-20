package com.shopping;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked with amount: " + amount + ". No delivery charges for Prime account.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime Account: " + isPrime;
    }
}

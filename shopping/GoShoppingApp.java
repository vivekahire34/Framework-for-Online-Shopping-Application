package com.shopping;

public class GoShoppingApp {
    public static void main(String[] args) {
        ShopFactory shopFactory = new GSShopFactory();

        // Creating Prime Account
        PrimeAcc vivekPrimeAccount = shopFactory.getNewPrimeAcc(201, "Vivek Ahire", 1500.0f, true);
        vivekPrimeAccount.bookProduct(700.0f);
        System.out.println(vivekPrimeAccount);

        // Creating Normal Account
        NormalAcc rohanNormalAccount = shopFactory.getNewNormalAcc(202, "Rohan Patil", 1000.0f, 75.0f);
        rohanNormalAccount.bookProduct(300.0f);
        System.out.println(rohanNormalAccount);
    }
}

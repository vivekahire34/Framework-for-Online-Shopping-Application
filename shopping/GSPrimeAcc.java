package com.shopping;

public class GSPrimeAcc extends PrimeAcc {
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc: " + super.toString();
    }
}

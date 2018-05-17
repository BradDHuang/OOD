package com.company;

public class AccountReceipt {

    private Accounting transObj;

    public AccountReceipt(Accounting transObj) {
        this.transObj = transObj;
    }

    public void postPayment() {
        transObj.chargeCustomer();
    }
    public void sendInvoice() {
        transObj.prepareInvoice();
    }

}

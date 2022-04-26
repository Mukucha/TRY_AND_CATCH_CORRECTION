package com.company;

public class NotEnoughMoney extends Throwable {
    public NotEnoughMoney(String s) {
    }

    public class NotEnoughMoneyException extends Exception {
        NotEnoughMoneyException(String msg){
            super(msg);
        }

    }
}

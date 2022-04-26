package com.company;

public class NewException1 extends Throwable {
    public NewException1(String error) {
    }

    public class Exception1 extends Exception{
        Exception1(String msg){
            super(msg);}
   }
}

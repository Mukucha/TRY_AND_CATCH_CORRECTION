package com.company;

public class Task_1 {
    public static void main(String[] args) {

        try{
            testException exceptional = new testException();
            exceptional.getExceptionArnold();
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
            System.out.println( ex);
            ex.getMessage();

        }
    }
}

class TestException {
    public void getExceptionArnold() {
        String Arnold = null;

        System.out.println( "print exceptionable");

    }
}



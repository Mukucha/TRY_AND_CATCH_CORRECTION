package com.company;

class main {

    public static void main(String[] args) {

        try{
            testException exception = new testException();
            exception.genExceptionEmma();

        }
        catch(NullPointerException ex){
            ex.printStackTrace();
            System.out.println( ex);
            ex.getMessage();
        }


    }
}

class testException {
    public void genExceptionEmma() {
        String ArnoldGhost = null;
        System.out.println( "print exceptionable");
    }
    public double arithmeticException(int x, int y){
        return x + y;
    }
    public void indexOutArray(){
        int[] nums = new int[10];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        nums[10] = 12;
        for(int i = 0; i <= nums.length; i++){
            System.out.println( "The arrays are" + nums[i]);
        }
    }

    public void getExceptionArnold() {
    }
}


class CheckException {
    public static void main(String[] args){

        try {
            testException ts = new testException();
            System.out.println(ts.arithmeticException(34, 34));
            ts.indexOutArray();
        }
        catch(ArithmeticException e){
            System.out.println( "This is an arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is bound of array");
        }
        finally {
            System.out.println( "Successfully done");
        }
    }
}

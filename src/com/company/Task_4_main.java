package com.company;

public class Task_4_main {

        public static void main(String[] args){
            try{
                Task_4_main g = new Task_4_main();
                System.out.println( g.exceptionMethod("Man","Woman"));
                throw new NewException1("Error");

            }
            catch(NewException1 ex ){
                ex.getMessage();
            }


        }

    private boolean exceptionMethod(String man, String woman){
        return false;
    }
}


package com.company;

public class Task3_main {
    public class TaskThreeMain {
        public static void main(String[] args){
            //Exception catching
            try{
                //Creating account object with parameters
                Account ac = new Account("GHOST",320,23434);

                // Printing the user data
                System.out.println( ac.methodPrint());
                //Calling the method transfer
                ac.methodTransferArnold(350);

                throw new NotEnoughMoney("There is insufficient money in the account!!!");

            }
            catch (NotEnoughMoney ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
                System.out.println( ex);
            }
            finally{
                // System.out.println( "The Balance left is" + Account.current);
            }
        }

    }
}

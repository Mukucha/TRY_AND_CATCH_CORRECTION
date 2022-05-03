package com.company;

    public class TaskThreeMain {
        public static void main(String[] args) {
            //Exception catching

            Account ac1 = new Account("Ghost1", 345, 786570);
            Account ac2 = new Account("Ghost2", 500, 767846);
            try {

                // Printing the user data
                System.out.println(ac1.methodPrint());

                ac1.methodTransferArnold(35);

            } catch (NotEnoughMoney.NotEnoughMoneyException ex) {
                System.out.println(ex.getMessage());

            } finally {
                System.out.println("The Balance left is" + ac1.balance);
            }
        }}

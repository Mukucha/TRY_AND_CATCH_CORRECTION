package com.company;


    public class Account {

        String owner;
        int balance, accountNumber;

        public Account(String owner, int balance, int accountNumber) {
            this.owner = owner;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public String getOwnerArnold() {
            return owner;
        }

        public void setOwnerArnold(String owner) {
            this.owner = owner;
        }

        public int getBalanceArnold() {

            return balance;
        }

        public int setBalance(int balance) {
            return this.balance = balance;
        }

        public int getAccountNumberArnold() {
            return accountNumber;
        }

        public void setAccountNumberArnold(int accountNumber) {
            this.accountNumber = accountNumber;
        }
        public String methodPrint(){
            String result  = "Owner:" + getOwnerArnold();
            result += "\nBalance: " + getBalanceArnold();
            result += "\nAccountNumber: " + getAccountNumberArnold();
            return result;
        }

        public double methodTransferArnold(double amount){
            return balance -= amount;
        }

        public void methodTransferArnold(int i) {
        }
    }



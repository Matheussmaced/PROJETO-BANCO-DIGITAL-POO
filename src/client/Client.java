package client;

import bank.Bank;

public class Client {
  public static void main(String[] args) {
    Bank bank = new Bank();

    bank.openAccount();
  }
}

package bank;

import java.util.Scanner;

import accounts.current.AccountCurrent;
//import accounts.savings.AccountSavings;

public class Bank {
  // falar que vai criar conta

  Scanner scanner = new Scanner(System.in);

  String typeAccount = scanner.nextLine();

  public void openAccount() {
    System.out.println("Qual tipo de conta?");
    if (typeAccount.toLowerCase().equals("corrente")) {
      AccountCurrent accountCurrent = new AccountCurrent(0, 0, 0, 0);
      // AccountSavings accountSavings = new AccountSavings(0, 0, 0, 0);

      for (int clientOption = -1; clientOption != 0;) {
        System.out.println("1 - Fazer deposito");
        System.out.println("2 - Fazer saque");
        System.out.println("3 - Fazer transferência");
        System.out.println("0 - finalizar o precesso");

        clientOption = scanner.nextInt();

        switch (clientOption) {
          case 1:
            System.out.println("Quanto você quer depositar?");

            double deposit = scanner.nextDouble();

            accountCurrent.setAmount(deposit + accountCurrent.getAmount());

            break;
          case 2:
            System.out.println("Quanto você deseja sacar?");
            double withdrawl = scanner.nextDouble();
            accountCurrent.setWithdrawl(withdrawl);

            if (withdrawl > accountCurrent.getAmount() || accountCurrent.getAmount() <= 0) {
              System.out.println("Você não possui saldo suficiente");
            } else {
              accountCurrent.setAmount(accountCurrent.getAmount() - accountCurrent.getWithdrawl());
              System.out.println("Agora seu saldo atual é de: " + accountCurrent.getAmount());
              System.out.println("Seu saque foi de: " + accountCurrent.getWithdrawl());
            }
            break;

          case 3:
            System.out.println("Quanto você deseja transferir?");
            double transfer = scanner.nextDouble();
            accountCurrent.setTransfer(transfer);

            if (transfer > accountCurrent.getAmount()) {
              System.out.println("Sem saldo na sua conta");
            } else {
              accountCurrent.setAmount(accountCurrent.getAmount() - transfer);
              System.out.println("Agora seu saldo é de: " + accountCurrent.getAmount());
              System.out.println("Você transferiu: " + transfer);
            }
            break;
          default:
            break;
        }
      }
    }
  }
}

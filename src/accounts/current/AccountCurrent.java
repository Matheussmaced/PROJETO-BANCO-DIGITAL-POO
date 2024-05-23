package accounts.current;

import accounts.setFeaturesGeneralOfAccounts.SetFeaturesGeneralOfAccounts;

public class AccountCurrent extends SetFeaturesGeneralOfAccounts {

  public AccountCurrent(double deposit, double withdrawl, double transfer, int agency) {
    super(deposit, withdrawl, transfer, agency);

  }

  // Assume that 'amount' is managed via 'deposit'
  public double getAmount() {
    return super.getDeposit();
  }

  public void setAmount(double amount) {
    super.setDeposit(amount);
  }

}

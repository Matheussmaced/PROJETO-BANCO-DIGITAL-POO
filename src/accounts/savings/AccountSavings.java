package accounts.savings;

import accounts.setFeaturesGeneralOfAccounts.SetFeaturesGeneralOfAccounts;

public class AccountSavings extends SetFeaturesGeneralOfAccounts {

  public AccountSavings(double deposit, double withdrawl, double transfer, int agency) {
    super(deposit, withdrawl, transfer, agency);
  }
}
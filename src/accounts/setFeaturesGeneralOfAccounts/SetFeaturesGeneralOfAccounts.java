package accounts.setFeaturesGeneralOfAccounts;

public class SetFeaturesGeneralOfAccounts {
  private double deposit;
  private double withdrawl;
  private double transfer;
  private int agency;
  private double amount;

  public double getDeposit() {
    return deposit;
  }

  public double getWithdrawl() {
    return withdrawl;
  }

  public double getTransfer() {
    return transfer;
  }

  public int getAgency() {
    return agency;
  }

  public double getAmount() {
    return amount;
  }

  public SetFeaturesGeneralOfAccounts(double deposit, double withdrawl, double transfer, int agency) {
    this.deposit = deposit;
    this.withdrawl = withdrawl;
    this.transfer = transfer;
    this.agency = agency;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public void setWithdrawl(double withdrawl) {
    this.withdrawl = withdrawl;
  }

  public void setTransfer(double transfer) {
    this.transfer = transfer;
  }

  public void setAgency(int agency) {
    this.agency = agency;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}

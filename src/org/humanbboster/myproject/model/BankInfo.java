package org.humanbboster.myproject.model;

public class BankInfo {

    private String number;
    private String bankName;

    public BankInfo(String number, String bankName) {
        this.number = number;
        this.bankName = bankName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankInfo{");
        sb.append("number='").append(number).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

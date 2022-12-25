package Chapter07;

import JavaPratice.EX_BankAccount;

class BankAccountOO {

    public static void main(String[] args) {

        // 두개의 인스턴스 생성
        EX_BankAccount yoon = new EX_BankAccount();
        EX_BankAccount park = new EX_BankAccount();

        // 각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        // 각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        // 각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}

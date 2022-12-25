package Thread;

import JavaPratice.Account2;

class RunnableEx implements Runnable {

    Account2 acc = new Account2();

    @Override
    public void run() {

        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance: " + acc.getBalance());
        }
    }
}

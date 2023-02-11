package oop.bankAccount;

public class BankAccount1 {

    int balans;

    BankAccount1(int balans){
        this.balans=balans;
    }

    void popolneniyaScheta(int popolneniyaScheta){
        System.out.println("Баланс до пополнения "+balans);
        System.out.println("Сумма пополнения "+popolneniyaScheta);
        balans=balans+popolneniyaScheta;
        System.out.println("Сумма после пополнения "+balans);

    }
    int snyatieSoScheta(int snytieSoSheta){
        System.out.println("Баланс до снятие счета "+balans);
        System.out.println("Сумма снятие со счета "+snytieSoSheta);
        balans=balans-snytieSoSheta;
        return balans;
    }


}

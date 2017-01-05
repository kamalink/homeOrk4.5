package module4.homeOrk5;

import module4.homeOrk4.User;

public class BankSystemImp implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount){
        double limit = user.getBank().getLimitOfWithdrawal();
        double balance = user.getBalance();

        if(balance<amount)
            System.err.println("Not enough money");
        if(amount>limit)
            System.err.println("The limit of withdraw is " + limit);
        else user.setBalance(balance-amount);

    }

    @Override
    public void fundUser(User user, int amount){
        double balance = user.getBalance();
        double limit = user.getBank().getLimitOfFunding();

        if(limit<amount)
            System.err.println("The limit of funding is " + limit);
        else user.setBalance(balance+amount);

    }

    @Override
    public void transferMoney(User toUser, User fromUser, int amount){
        double balance1 = fromUser.getBalance();
        double balance2 = toUser.getBalance();

        if(amount>balance1)
            System.err.println("Not enough money");

        else fromUser.setBalance(balance1 - amount);
            toUser.setBalance(balance2 + amount);
    }

    @Override
    public void paySalary(User user){
        double balance = user.getBalance();
        double salary = user.getSalary();
        user.setBalance(balance+salary);

    }

}
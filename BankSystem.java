package module4.homeOrk5;

import module4.homeOrk4.User;

public interface BankSystem {

    void withdrawOfUser (User user,int amount);

    void fundUser (User user,int amount);
    void transferMoney (User fromUser, User toUser,int amount);

    void paySalary (User user);

}

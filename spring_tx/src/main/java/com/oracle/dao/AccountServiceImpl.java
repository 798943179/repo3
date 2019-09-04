package com.oracle.dao;

public class AccountServiceImpl implements  AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String from, String to, Double money) {
    accountDao.outMoney(from,money);
    /*
    * int[] arr=null;
    * arr[3]=900;
    * */
    accountDao.inMoney(to,money);
    }
}

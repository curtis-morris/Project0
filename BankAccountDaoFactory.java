package com.morriscm.Project0;

public class BankAccountDaoFactory {

    private static BankAccountDao dao;

    private BankAccountDaoFactory() {

    }

    public static BankAccountDao getBankAccountDao() {
        if (dao == null) {
            dao = new BankAccountDaoImpl();
        }
        return dao;
    }
}

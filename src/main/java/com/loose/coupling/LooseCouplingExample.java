package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDatabase = new UserDatabase();
        UserManager userManagerWithDatabase = new UserManager(userDatabase);
        System.out.println(userManagerWithDatabase.getUserInfo());

        UserDataProvider WebServiceDataProvider = new WebServiceDataProvider();
        UserManager webServiceUserManager = new UserManager(WebServiceDataProvider);
        System.out.println(webServiceUserManager.getUserInfo());

        UserDataProvider newUserDatabase = new NewDatabase();
        UserManager newUserManager = new UserManager(newUserDatabase);
        System.out.println(newUserManager.getUserInfo());
    }
}

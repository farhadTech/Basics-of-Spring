package com.loose.coupling;

public class NewDatabase implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "getting details from new database.";
    }
}

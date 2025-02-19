package com.loose.coupling;

public class WebServiceDatabase implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Fetching Data From Web Service";
    }
}


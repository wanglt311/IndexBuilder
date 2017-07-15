package com.liting;

/**
 * Created by wangltlily311 on 7/15/17.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        String adsDataFilePath = "/Users/wangltlily311/TigerTech/SearchAdsPlatform/IndexBuilder/ads_0502.txt";
        String budgetDataFilePath = "/Users/wangltlily311/TigerTech/SearchAdsPlatform/IndexBuilder/budget.txt";
        String memcachedServer = "127.0.0.1";
        String mysqlHost = "127.0.0.1:3306";
        String mysqlDb = "Searchads";
        String mysqlUser = "root";
        String mysqlPass = "root";
        int memcachedPortal = 11211;
        AdsEngine adsEngine = new AdsEngine(adsDataFilePath, budgetDataFilePath, memcachedServer, memcachedPortal,
                mysqlHost, mysqlDb, mysqlUser, mysqlPass);

        adsEngine.init();
    }
}

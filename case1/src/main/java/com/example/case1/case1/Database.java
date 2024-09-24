package com.example.case1.case1;

import javax.xml.crypto.Data;

public class Database {

    private static Database db;

    public static Database getInstance(){
        if (db==null) {
            db = new Database();
        }
        return db;
    }

    private Database(){

    }

    

}

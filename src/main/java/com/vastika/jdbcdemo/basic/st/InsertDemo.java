package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = " insert into user_table set user_name='ram', password='abc123' where id =1";
    public static void main(String [] args){

        try (
                Statement st = DbUtil.getConnection().createStatement();
        ){
            st.executeUpdate(SQL);
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}





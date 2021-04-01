package com.vastika.jdbcdemo.basic.st;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

    public static final String SQL = "create table user_table(id int not null auto_increment,user_name varchar(45), password varchar(45), primary key (id))";

    public static void main(String [] args){

        try (
                Statement st = DbUtil.getConnection().createStatement();
             )
        {
            st.executeUpdate(SQL);
            System.out.println("table created");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}




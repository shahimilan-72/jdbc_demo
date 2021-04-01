package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.vastika.jdbcdemo.basic.util.DbUtil.getConnection;

public class SelectDemo {
    public static final String SQL = "select * from user_table where username =? and password =?";

    public static void main(String[] args)  {

        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "shyam");
            ps.setString(2, "abc123!@#");
            ResultSet rs = ps.executeQuery();
            ;
            while (rs.next()) {
                System.out.println("=================");
                System.out.println("Id is:" + rs.getInt("id"));
                System.out.println("Name is: " + rs.getString("User_name"));
                System.out.println("Password is: " + rs.getString("password"));
                System.out.println("=================");
            }
        }
            catch (SQLException | ClassNotFoundException e){
                e.printStackTrace();
            }

    }
}
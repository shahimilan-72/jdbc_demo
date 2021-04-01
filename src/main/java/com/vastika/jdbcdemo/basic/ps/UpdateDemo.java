package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static final String SQL = "update user_table set user_name=? ,password=? where id= ?)";

    public static void main(String [] args){

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setString(1, "ramesh");
            ps.setString(2,"hibachi");
            ps.setInt(3,5);
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}



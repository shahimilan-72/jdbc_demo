package com.vastika.jdbcdemo.basic.ps;

import com.vastika.jdbcdemo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static final String SQL = "delete from user_table where id =?";

    public static void main(String [] args){

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ){
            ps.setInt(1, 5);
            ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsys;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Moses Aderemi
 */
public class database {

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // CONNECT YOUR DATABASE
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restaurant", "root", "");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}

package com.example.SalesUserStory.serviceImpl;

import com.example.SalesUserStory.connection.MyConnection2;
import com.example.SalesUserStory.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesStaff {

    Scanner sc = new Scanner(System.in);
    public void getProduct() throws SQLException {

        Connection connection = null;
        PreparedStatement ps1 = null;

        /*
  private int productId;
    private String productName;
    private float price;
    private String stockLevel;
    private String replenishLevel;
 */

        connection = MyConnection2.getConnection();

        String sql1 = "Select productName from Product where productId=?";
        ps1 = connection.prepareStatement(sql1);
        System.out.println("Enter Product Id :");
        int year = sc.nextInt();
        ps1.setInt(1, year);
        ResultSet r = ps1.executeQuery();
        List<Product> productList = new ArrayList<>();
        while (r.next()) {
            // productList.add(new Product(r.getInt(1),r.getString(2)));

            System.out.println(" "+ r.getString(1) );
        }
        //  System.out.println(productList);
       // System.out.println("successfully executed ");

    }
        public void deleteProduct() throws SQLException {

        Connection connection = null;
        PreparedStatement ps1 = null;

        connection = MyConnection2.getConnection();

        String sql1 = "delete from Product  where productId = ?";
        ps1 = connection.prepareStatement(sql1);

        System.out.println("Enter product id :");
        String id = sc.next();
        ps1.setString(1, id);


        ps1.executeUpdate();
            System.out.println("successfully removing :");



    }

}

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




public class ProductServiceImpl {

    Scanner sc = new Scanner(System.in);

    public void addProduct() throws SQLException {
/*
  private int productId;
    private String productName;
    private float price;
    private String stockLevel;
    private String replenishLevel;
 */


        Connection connection = null;
        PreparedStatement ps = null;

        connection = MyConnection2.getConnection();



        String sql = "insert into Product values (? ,?,?,? ,?)";

        ps = connection.prepareStatement(sql);

        System.out.println("Enter product id : ");
        int id = sc.nextInt();
        ps.setInt(1, id);

        System.out.println("Enter Product Name :");
        String fname = sc.next();
        ps.setString(2, fname);

        System.out.println("Enter price Lang :");
        float lname = sc.nextFloat();
        ps.setFloat(3, lname);

        System.out.println("Enter Stock level :");
        String  year = sc.next();
        ps.setString(4, year);

        System.out.println("Enter replenishLevel :");
        String pId = sc.next();
        ps.setString(5, pId);

        ps.execute();

        System.out.println("Product successfully .added !!!..");

    }

//    public void getMovies() throws SQLException {
//
//        Connection connection = null;
//        PreparedStatement ps1 = null;
//
//        connection = MyConnection2.getConnection();
//
//        String sql1 = "Select * from Movie where year >= ?";
//        ps1 = connection.prepareStatement(sql1);
//        System.out.println("Enter movie releasedIn :");
//        int year = sc.nextInt();
//        ps1.setInt(1, year);
//        ResultSet r = ps1.executeQuery();
//        List<Product> movieList = new ArrayList<>();
//        while (r.next()) {
//            movieList.add(new Product(r.getInt(1),r.getString(2),r.getString(3),r.getInt(4),r.getDouble(5)));
//
////			System.out.println("  " + r.getString(1) + " \t " + r.getString(2) + " \t " + r.getString(3) + " \t "
////					+ r.getInt(4) + " \t " + r.getLong(5));
//        }
//        System.out.println(movieList);
//
//    }
//
    public void updateProduct() throws SQLException {

        Connection connection = null;
        PreparedStatement ps1 = null;

        connection = MyConnection2.getConnection();

        String sql1 = "Update Product set productName= ?,price=?, stockLevel=?,replenishLevel=? where productId = ?";
        ps1 = connection.prepareStatement(sql1);

        System.out.println("Enter product id which you want to update :");
        int id12 = sc.nextInt();
        ps1.setInt(5, id12);

        System.out.println("Enter new Product Name :");
        String rev = sc.next();
        ps1.setString(1, rev);

        System.out.println("Enter new Product price :");
        float price = sc.nextFloat();
        ps1.setFloat(2, price);

        System.out.println("Enter Stock Level :");
        String id = sc.next();
        ps1.setString(3, id);


        System.out.println("Enter replenishLevel Level :");
        String id1 = sc.next();
        ps1.setString(4, id1);








        ps1.executeUpdate();
        System.out.println("successfully updated !!! ");




    }
//
//    public void delete() throws SQLException {
//
//        Connection connection = null;
//        PreparedStatement ps1 = null;
//
//        connection = MyConnection2.getConnection();
//
//        String sql1 = "delete from Movie  where movieId = ?";
//        ps1 = connection.prepareStatement(sql1);
//
//        System.out.println("Enter movie id :");
//        String id = sc.next();
//        ps1.setString(1, id);
//
//
//        ps1.executeUpdate();
//
//
//
//    }
//
}

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

public class CustomerImpl {
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

        String sql1 = "Select productId,productName from Product";
        ps1 = connection.prepareStatement(sql1);
//        System.out.println("Enter movie releasedIn :");
//        int year = sc.nextInt();
//        ps1.setInt(1, year);
        ResultSet r = ps1.executeQuery();
        List<Product> productList = new ArrayList<>();
        while (r.next()) {
           // productList.add(new Product(r.getInt(1),r.getString(2)));

		System.out.println(" "+ r.getInt(1) + " \t " + r.getString(2));
        }
      //  System.out.println(productList);

    }

    public void getProductwithId() throws SQLException {

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

        String sql1 = "Select productId,productName, price from Product where productId=?";
        ps1 = connection.prepareStatement(sql1);
        System.out.println("Enter Product id :");
        int year = sc.nextInt();
        ps1.setInt(1, year);
        ResultSet r = ps1.executeQuery();
        List<Product> productList = new ArrayList<>();
        float price=0;
        while (r.next()) {
           // productList.add(new Product(r.getInt(1),r.getString(2)));

			System.out.println("  " + r.getInt(1) + " \t " + r.getString(2)+ " \t " + r.getFloat(3));
             price= r.getFloat(3);
        }
       // System.out.println(productList);
        System.out.println(" *************OFFER ************");
        System.out.println(" Get 10% Discount For 5 items ");
        System.out.println(" Get 20% Discount For 10 items or more ");
        System.out.println(" *************OFFER ************");

        System.out.println(" enter the number of iteams you want to purchase ");
        int number= sc.nextInt();
        float totalPrice=price*number;
        if(number>=5&&number<10){
            System.out.println(" you have 10% Discount");
            float t1=totalPrice-(totalPrice*10)/100;
            System.out.println("Total Amount is"+t1);

        }else if(number>=10){
            System.out.println(" you have 20% Discount");
            float t2=totalPrice-(totalPrice*20)/100;
            System.out.println("Total Amount is"+t2);
        }else{
            System.out.println(" you have 0% Discount");
            //float t3=totalPrice-(totalPrice*0)/100;
//            float totalPrice=price*number;
//            while(r.next()){
////              float price= r.getFloat(3);
//           //   float totalPrice=price*number;
   System.out.println("Total Amount is"+totalPrice);
//
//            }
        }


    }


}

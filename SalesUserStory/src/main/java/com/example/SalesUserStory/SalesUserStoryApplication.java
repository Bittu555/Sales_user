package com.example.SalesUserStory;

import com.example.SalesUserStory.serviceImpl.CustomerImpl;
import com.example.SalesUserStory.serviceImpl.ProductServiceImpl;
import com.example.SalesUserStory.serviceImpl.SalesStaff;
import jakarta.servlet.ServletOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.util.Scanner;

@SpringBootApplication
public class SalesUserStoryApplication {

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(SalesUserStoryApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		//BikeImpl m = new BikeImpl();
		//ServiceImpl s=new ServiceImpl();
		ProductServiceImpl m=new ProductServiceImpl();
		CustomerImpl c=new CustomerImpl();
		SalesStaff s=new SalesStaff();


		System.out.println(" Enter the choice  ");
		System.out.println(" 1 . Manager ");
		System.out.println(" 2 . customer ");
		System.out.println(" 3 . Sales Staff ");


//		System.out.println("Enter 2 to get bike details");
//		System.out.println("Enter 3 to update bike");
//		System.out.println("Enter 4 to delete bike details");
//		System.out.println("###########################");
//
//		System.out.println("Enter 5 to ServiceAdviser Details");
//		System.out.println("Enter 6 to get bike details having bike");


		while (true) {
			int take = scanner.nextInt();
			switch (take) {

				case 1:
					System.out.println(" 1 add product ");
					System.out.println(" 2 update product ");
					while (true) {
						int choice = scanner.nextInt();
						switch (choice) {

							case 1:
								m.addProduct();
								break;
							case 2:
								m.updateProduct();
								break;
						}
					}
				case 2:
					System.out.println(" 1 get All product ");
					System.out.println(" 2 get price of product ");
					while (true) {
						int choice = scanner.nextInt();
						switch (choice) {

							case 1:
								c.getProduct();
								break;
							case 2:
								c.getProductwithId();

								break;
						}
					}


				case 3:
					System.out.println(" 1 get product with Specfix Product Id ");
					System.out.println(" 2 Removing the item if there is some conflict/not store in Shop ");
					while (true) {
						int choice = scanner.nextInt();
						switch (choice) {

							case 1:
								s.getProduct();
								break;
							case 2:
								s.deleteProduct();
								break;
						}
					}

//				case 4:
//
//					m.deleteBike();
//					break;
//
//				case 5:
//
//					s.adviserInsert();
//					break;
//
//				case 6:
//
//					s.adviserdetails();
//					break;

			}


		}

	}


}

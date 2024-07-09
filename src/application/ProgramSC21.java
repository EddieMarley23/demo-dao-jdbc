package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class ProgramSC21 {

	public static void main(String[] args) {
		
	
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: Seller findById");
		Seller seller = sellerDao.findById(3); 
		
		System.out.println(seller);
		

	}

}

package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller obj1 = new Seller(1, "Joseph", "joseph@gmail.com", new Date(), 2200.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj1);
    }
}

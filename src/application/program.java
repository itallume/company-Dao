package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;

public class program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);

    }
}

package application;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(5);
        System.out.println(seller);
        DepartmentDao dpDao = DaoFactory.createDepartmentDao();
        Department dp = dpDao.findById(1);
        System.out.println(dp);

    }
}

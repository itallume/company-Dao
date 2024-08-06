package models.dao.impl;

import db.DB;
import db.DbException;
import models.dao.DepartmentDao;
import models.entities.Department;

import java.sql.*;
import java.util.List;


public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;

    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("select * from department where Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()){
                Department department = new Department(rs.getString("Name") ,rs.getInt("Id"));
                return department;
            }
            return null;
        } catch (SQLException e) {
        throw new DbException(e.getMessage());
    } finally {
        DB.closeStatement(st);
        DB.closeResultSet(rs);
    }}

    @Override
    public List<Department> findAll() {
        return null;
    }
}

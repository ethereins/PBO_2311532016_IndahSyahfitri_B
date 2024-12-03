package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import confg.Database;
import model.Customer;

public class CustomerRepo implements CustomerDAO {
    private Connection connection;
    final String insert = "INSERT INTO customer (id, nama, alamat, noHp) VALUES (?, ?, ?, ?);"; 
    final String select = "SELECT * FROM customer;";
    final String delete = "DELETE FROM customer WHERE id = ?;";
    final String update = "UPDATE customer SET nama = ?, alamat = ?, noHp = ? WHERE id = ?;"; 

    public CustomerRepo() {
        connection = Database.getConnection();
    }
    
    @Override
    public void save(Customer customer) {
        try (PreparedStatement ps = connection.prepareStatement(insert)) {
            ps.setString(1, customer.getId());
            ps.setString(2, customer.getNama());
            ps.setString(3, customer.getAlamat());
            ps.setString(4, customer.getNoHp());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(CustomerRepo.class.getName()).log(Level.SEVERE, "Error saving customer: ", e);
        }
    }

    @Override
    public List<Customer> show() {
        List<Customer> customers = new ArrayList<>(); 
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(select)) { 
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("id"));
                customer.setNama(rs.getString("nama"));
                customer.setAlamat(rs.getString("alamat"));
                customer.setNoHp(rs.getString("noHp")); 
                customers.add(customer);
            }
        } catch (SQLException e) {
            Logger.getLogger(CustomerRepo.class.getName()).log(Level.SEVERE, "Error retrieving customers: ", e);
        }
        return customers;
    }

    @Override
    public void delete(String id) {
        try (PreparedStatement ps = connection.prepareStatement(delete)) {
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(CustomerRepo.class.getName()).log(Level.SEVERE, "Error deleting customer: ", e);
        }
    }

    @Override
    public void update(Customer customer) {
        try (PreparedStatement ps = connection.prepareStatement(update)) {
            ps.setString(1, customer.getNama());
            ps.setString(2, customer.getAlamat());
            ps.setString(3, customer.getNoHp()); 
            ps.setString(4, customer.getId()); 
            ps.executeUpdate(); 
        } catch (SQLException e) {
            Logger.getLogger(CustomerRepo.class.getName()).log(Level.SEVERE, "Error updating customer: ", e);
        }
    }
}

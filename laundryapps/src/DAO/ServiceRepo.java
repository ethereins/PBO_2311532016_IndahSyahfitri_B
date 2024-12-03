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
import model.Service;

public class ServiceRepo implements ServiceDAO {
    private Connection connection;
    final String insert = "INSERT INTO service (id, jenis, status, harga) VALUES (?, ?, ?, ?);"; 
    final String select = "SELECT * FROM service;";
    final String delete = "DELETE FROM service WHERE id = ?;";
    final String update = "UPDATE service SET jenis = ?, status = ?, harga = ? WHERE id = ?;"; 

    public ServiceRepo() {
        connection = Database.getConnection();
    }
    
    public void save(Service service) {
        try (PreparedStatement ps = connection.prepareStatement(insert)) {
            ps.setString(1, service.getId());
            ps.setString(2, service.getJenis());
            ps.setString(3, service.getStatus());
            ps.setLong(4, service.getHarga());
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ServiceRepo.class.getName()).log(Level.SEVERE, "Error saving service: ", e);
        }
    }

    @Override
    public List<Service> show() {
        List<Service> services = new ArrayList<>(); 
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(select)) { 
            while (rs.next()) {
                Service service = new Service();
                service.setId(rs.getString("id"));
                service.setJenis(rs.getString("jenis"));
                service.setStatus(rs.getString("status"));
                service.setHarga(rs.getLong("harga")); 
                services.add(service);
            }
        } catch (SQLException e) {
            Logger.getLogger(ServiceRepo.class.getName()).log(Level.SEVERE, "Error retrieving services: ", e);
        }
        return services;
    }

    @Override
    public void delete(String id) {
        try (PreparedStatement ps = connection.prepareStatement(delete)) {
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ServiceRepo.class.getName()).log(Level.SEVERE, "Error deleting service: ", e);
        }
    }

    @Override
    public void update(Service service) {
        try (PreparedStatement ps = connection.prepareStatement(update)) {
            ps.setString(1, service.getJenis());
            ps.setString(2, service.getStatus());
            ps.setLong(3, service.getHarga()); 
            ps.setString(4, service.getId()); 
            ps.executeUpdate(); 
        } catch (SQLException e) {
            Logger.getLogger(ServiceRepo.class.getName()).log(Level.SEVERE, "Error updating service: ", e);
        }
    }
}

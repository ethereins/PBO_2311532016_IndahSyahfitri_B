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

import config.Database;
import model.User;

public class UserRepo implements UserDao {
    private Connection connection;
    final String insert = "INSERT INTO user (name, username, password) VALUES (?, ?, ?);";
    final String select = "SELECT * FROM user;";
    final String delete = "DELETE FROM user WHERE id = ?;";
    final String update = "UPDATE user SET name = ?, username = ?, password = ? WHERE id = ?;";

    public UserRepo() {
        connection = Database.getConnection();
    }
    
    @Override
    public void save(User user) {
        try (PreparedStatement st = connection.prepareStatement(insert)) {
            st.setString(1, user.getNama());
            st.setString(2, user.getUsername());
            st.setString(3, user.getPassword());
            st.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(UserRepo.class.getName()).log(Level.SEVERE, "Error saving user", e);
        }
    }

    @Override
    public List<User> show() {
        List<User> ls = new ArrayList<>();
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(select)) {
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setNama(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                ls.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(UserRepo.class.getName()).log(Level.SEVERE, "Error fetching users", e);
        }
        return ls;
    }

    @Override
    public void delete(String id) {
        try (PreparedStatement st = connection.prepareStatement(delete)) {
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(UserRepo.class.getName()).log(Level.SEVERE, "Error deleting user", e);
        }
    }

    @Override
    public void update(User user) {
        try (PreparedStatement st = connection.prepareStatement(update)) {
            st.setString(1, user.getNama());
            st.setString(2, user.getUsername());
            st.setString(3, user.getPassword());
            st.setString(4, user.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(UserRepo.class.getName()).log(Level.SEVERE, "Error updating user", e);
        }
    }
}

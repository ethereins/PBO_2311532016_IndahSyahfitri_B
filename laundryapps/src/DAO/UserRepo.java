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
import table.TableUser;
import ui.UserFrame;

public class UserRepo implements UserDao{
	private Connection connection;
	final String insert = "INSERT INTO user (name, username, password) VALUES (?,?,?);";
	final String select = "SELECT * FROM user;";
	final String delete = "DELETE FROM user WHERE id = ?;";
	final String update = "UPDATE user SET name = ?, username = ?, password = ? WHERE id =?;";
	
public UserRepo() {
	connection = Database.koneksi();
}

@Override
public void save(User user) {
	PreparedStatement st = null;
	try {
		st = connection.prepareStatement(insert);
		st.setString(1, user.getNama());
		st.setString(2, user.getUsername());
		st.setString(3, user.getPassword());
		st.executeUpdate();
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			st.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

@Override
public List<User> show() {
	// TODO Auto-generated method stub
	List<User> ls = null;
	try {
		ls = new ArrayList<User>();
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(select);
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setNama(rs.getString("name"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			ls.add(user);
		}
	} catch(SQLException e) {
		Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, e);
	} return ls;
}

@Override
public void delete(String id) {
	// TODO Auto-generated method stub
	PreparedStatement st = null;
	try {
		st = connection.prepareStatement(delete);
		st.setString(1, id);
		st.executeUpdate();
	} catch(SQLException e) {
		e.printStackTrace();
		
	} finally {
		try {
			st.close();
		} catch(SQLException e) {
			e.printStackTrace();
	}
}
}

@Override
public void update(User user) {
	// TODO Auto-generated method stub
	PreparedStatement st = null;
	try {
		st = connection.prepareStatement(update);
		st.setString(1, user.getNama());
		st.setString(2, user.getUsername());
		st.setString(3, user.getPassword());
		st.setString(4, user.getId());
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			st.close();
		} catch(SQLException e) {
			e.printStackTrace();
	}
}
	
}
}
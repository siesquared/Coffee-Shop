package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<User> findAll() {
		
		String sql ="SELECT * FROM user";
		
		return jdbc.query(sql, new BeanPropertyRowMapper<>(User.class));
	}
	
	public User findById(Long id) {
		
		String sql ="SELECT * FROM user WHERE id= ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),id);
	}
	
	public void update(User users) {
	
		
		String sql = "UPDATE user SET username=?, firstname=?, lastname=? , password=? WHERE id=?";
		jdbc.update(sql, users.getUsername(), users.getFirstname(), users.getLastname(), users.getPassword(), users.getId());
	}
	
	public void create(User users) {
		String sql ="INSERT INTO user(username,firstname,lastname, password) VALUES (?,?,?,?)";
		jdbc.update(sql, users.getUsername(), users.getFirstname(), users.getLastname() ,users.getPassword());
		
	}
	public void delete(Long id) {
		String sql ="SELECT * FROM users WHERE id= ?";
		
		jdbc.update(sql , id );
	}
	
	
}

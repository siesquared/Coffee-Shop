package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;





@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	

	public List<Product> findAll() {
		
		String sql ="SELECT * FROM products";
		
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Product.class));
	}
	
	public Product findById(Long id) {
		
		String sql ="SELECT * FROM products WHERE id= ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Product.class),id);
	}
	
	public void update(Product products) {
	
		
		String sql = "UPDATE products SET name=?, price=?, description=? WHERE id=?";
		jdbc.update(sql, products.getName(), products.getPrice(), products.getDescription(), products.getId());
	}
	
	public void create(Product products) {
		String sql ="INSERT INTO products(name,price,description) VALUES (?,?,?)";
		jdbc.update(sql, products.getName(),products.getPrice(), products.getDescription());
		
	}
	public void delete(Long id) {
		String sql ="SELECT * FROM products WHERE id= ?";
		
		jdbc.update(sql , id );
	}
	
}

package com.linker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.linker.model.ProductDTO;

public class LinkerDAO {
	
	 public ProductDTO getProductDetails(int productId) {
	        ProductDTO product = null;
	        String query = "SELECT * FROM products WHERE product_id = ?";
	        
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	             
	            pstmt.setInt(1, productId);
	            ResultSet rs = pstmt.executeQuery();
	            
	            if (rs.next()) {
	                product = new ProductDTO(
	                    rs.getInt("product_id"),
	                    rs.getString("name"),
	                    rs.getString("description"),
	                    rs.getDouble("price"),
	                    rs.getInt("stock")
	                );
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return product;
	    }

}

package com.bankapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankapi.devaraj.utility.ConnectionUtility;

public class AdminDAOImpl implements AdminDAO {

	public static Logger log = LogManager.getLogger(AdminDAO.class);

	@Override
	public boolean approveAcccount(int customer_id) {
		log.info("approve account method invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			String query = "begin transaction; "
					+ "insert into bankapi.customers select * from bankapi.pending_approvals where customer_id = ?; "
					+ "delete from bankapi.pending_approvals where customer_id =?;"
					+ "insert into bankapi.account_details values(default, ?, ?, 0.00);" 
					+ "commit;";
			ps = conn.prepareStatement(query);
			ps.setInt(1, customer_id);
			ps.setInt(2, customer_id);
			ps.setInt(3, customer_id);
			//ps.setInt(4, account_type);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("approve account failed");
			e.printStackTrace();
			return false;
		}
		log.info("approve account success");
		return true;
	}

}

package Spring_Jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class First_Dao implements FirstDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Emp emp) {

		String query = "Insert into table Ganesh(name,salary,experince) values (?,?,?)";
		return 1;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}

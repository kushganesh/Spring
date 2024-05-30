package SpringJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import SpringJdbc.Student;

public class DataBaseConnection implements dataConnection {

	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student s) {

		String query = "insert into  springjdbc_1(id,name,rollnumber) values(?,?,?)";
		int i = jdbcTemplate.update(query, s.getId(), s.getName(), s.getRoll());
		return i;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

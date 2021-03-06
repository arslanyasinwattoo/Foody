package edu.bnu.projects.foody.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	/* To insert/update a single record */
	public int insertOrUpdate(String sql, Object object) throws Exception {
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(
				object);
		return namedParameterJdbcTemplate.update(sql, paramSource);
	}

	public int insert(String sql, Object object) throws Exception {
		BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(
				object);
		return namedParameterJdbcTemplate.update(sql, paramSource);
	}

	public int deletebyId(String sql, Class objectType, Long id)
			throws Exception {
		return jdbcTemplate.update(sql, id);
	}

	/* To insert or update list of records */
	public void insertOrUpdateAll(String sql, List<?> objects) throws Exception {
		SqlParameterSource[] batch = SqlParameterSourceUtils
				.createBatch(objects.toArray());
		namedParameterJdbcTemplate.batchUpdate(sql, batch);
	}

	/* To find a single record against id */
	public Object findById(String sql, Class objectType, Long id)
			throws Exception {
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(
				objectType), id);
	}

	public Object findByid(String sql, Class objectType, long user_id)
			throws Exception {
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(
				objectType), user_id);
	}

	public Long findId(String sql) throws Exception {
		return jdbcTemplate.queryForLong(sql);
	}

	/*
	 * To find more than 1 records against given params (params can be empty to
	 * fetch all records)
	 */
	public List<?> findAll(String sql, Class objectType, Object... params)
			throws Exception {

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(objectType),
				params);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		/*
		 * once datasource is set, instantiate jdbcTemplate and
		 * namedParameterJdbcTemple
		 */
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
}

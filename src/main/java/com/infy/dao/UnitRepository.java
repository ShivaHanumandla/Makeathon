package com.infy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee ,Long>{
    List<Employee> findByid(Long searchKey);


//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public List<ProductEntity> searchProduct(String  productName) {
//        return jdbcTemplate.query("select * from productEntity where productName=?", new Object[] { productName },
//                new BeanPropertyRowMapper<ProductEntity>(ProductEntity.class));
//    }

}

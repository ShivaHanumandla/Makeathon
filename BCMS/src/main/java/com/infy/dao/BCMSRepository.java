package com.infy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.entity.BCMS;

@Repository
public interface BCMSRepository extends CrudRepository<BCMS,Long>{
    List<BCMS> findByid(Long searchKey);

    @Query("select p.id from BCMS p")
    List<Long> getAllIds();

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public List<ProductEntity> searchProduct(String  productName) {
//        return jdbcTemplate.query("select * from productEntity where productName=?", new Object[] { productName },
//                new BeanPropertyRowMapper<ProductEntity>(ProductEntity.class));
//    }

}

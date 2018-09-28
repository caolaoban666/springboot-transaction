package com.test;

import com.config.JpaDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author cyf
 * @description
 * @create 2018-09-28 17:28
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDataSource {

    @Autowired
    @Qualifier("jpaDataSource")
    private JpaDataSource jpaDataSource;

    @Test
    public void test() throws SQLException {
        DataSource dataSource = jpaDataSource.jpaDataSource();
        Connection connection = dataSource.getConnection();
        if(connection!=null){
            connection.close();
        }
    }

}

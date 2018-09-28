package com.test;

import com.config.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author cyf
 * @description
 * @create 2018-09-28 14:49
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {

    private static final Logger log = LoggerFactory.getLogger(DataSourceTest.class);

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Test
    public void test() throws SQLException {
        DataSource dataSource = dataSourceConfig.aesbDataSource();
        Connection connection = dataSource.getConnection();
        log.info("connection is {}",connection);
        connection.close();
    }

}

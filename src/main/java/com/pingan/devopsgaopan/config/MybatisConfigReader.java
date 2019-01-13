package com.pingan.devopsgaopan.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.pingan.devopsgaopan.util.ExceptionDetailUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Slf4j
@Configuration
@MapperScan("com.pingan.devopsgaopan.mapper")
@PropertySource(value = {"classpath:config/mysql.properties"})
public class MybatisConfigReader {

    @Value("${jdbc.DriverClassName}")
    private String DriverClassName;
    @Value("${jdbc.Url}")
    private String Url;
    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.passWord}")
    private String passWord;

    @Primary
    @Bean
    public DataSource dateSource(){


        DruidDataSource druidDataSource = new DruidDataSource();

        try {

            druidDataSource.setDriverClassName(DriverClassName);
            druidDataSource.setUrl(Url);
            druidDataSource.setUsername(userName);
            druidDataSource.setPassword(passWord);
            druidDataSource.setInitialSize(1);
            druidDataSource.setMinIdle(2);
            druidDataSource.setMaxActive(2);
            druidDataSource.setTimeBetweenConnectErrorMillis(3000);
            druidDataSource.setMinEvictableIdleTimeMillis(300000);
            druidDataSource.setValidationQuery("SELECT 1 FROM DUAL");
            druidDataSource.setTestWhileIdle(true);
            druidDataSource.setTestOnBorrow(false);
            druidDataSource.setTestOnReturn(false);

        } catch (Exception e) {
            log.error(ExceptionDetailUtil.getExcetionDetail(e));
        }
        return druidDataSource;

    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        //factoryBean.setTypeAliasesPackage("pingan.pingshen.entity");
        //factoryBean
        //        .setMapperLocations(new
        //        PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));

        return factoryBean.getObject();
    }
}

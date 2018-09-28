package com.config;

/**
 * @author cyf
 * @description     AESB 对应的数据源配置
 * @create 2018-08-02 16:51
 **/
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactoryPrimary",
//        transactionManagerRef = "transactionManagerPrimary",
//        basePackages = {"com.repository"}) // 配置repository 位置
//public class PrimaryConfig {
//
//    @Resource
//    @Qualifier("primaryDataSource")
//    private DataSource primaryDataSource;
//
//    @Primary
//    @Bean(name = "entityManagerPrimary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
//    }
//
//    @Resource
//    private JpaProperties jpaProperties;
//
//    private Map<String, Object> getVendorProperties() {
//        return jpaProperties.getHibernateProperties(new HibernateSettings());
//    }
//
//    /**
//     * 设置实体类所在位置
//     */
//    @Primary
//    @Bean(name = "entityManagerFactoryPrimary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(primaryDataSource)
//                .packages("com.entity.aesb") // 配置实体类位置
//                .persistenceUnit("primaryPersistenceUnit")
//                .properties(getVendorProperties())
//                .build();
//    }
//
//    @Primary
//    @Bean(name = "transactionManagerPrimary")
//    public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
//    }
//
//}

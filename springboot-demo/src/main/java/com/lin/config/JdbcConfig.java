package com.lin.config;

//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

/*    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/

/*    @Autowired
    private JdbcProperties jdbcProperties;

    public JdbcConfig() {
        this.jdbcProperties = jdbcProperties;
    }*/

//    @Bean
//    public DataSource dataSource(JdbcProperties prop){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        return new DruidDataSource();
    }*/
}

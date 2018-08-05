//package com.velkoz;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.quartz.utils.ConnectionProvider;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
///**
// * @author : want
// * @Team Home
// * @date : 2018-8-5 15:55 星期日
// */
//public class MyPoolingConnectionProvider implements ConnectionProvider {
//    /** Default maximum number of database connections in the pool. */
//    public static final int DEFAULT_DB_MAX_CONNECTIONS = 10;
//
//    /** Default maximum number of database connections in the pool. */
//    public static final int DEFAULT_DB_MAX_CACHED_STATEMENTS_PER_CONNECTION = 120;
//
//    private String driver;
//    private String url;
//    private String user;
//    private String password;
//    private int maxConnections;
//    private int maxCachedStatementsPerConnection;
//    private int maxIdleSeconds;
//    private String validationQuery;
//    private int idleConnectionValidationSeconds;
//    private boolean validateOnCheckout;
//    private String discardIdleConnectionsSeconds;
//
//    private ComboPooledDataSource datasource;
//
//
//    @Override
//    public Connection getConnection() throws SQLException {
//        return null;
//    }
//
//    @Override
//    public void shutdown() throws SQLException {
//
//    }
//
//    @Override
//    public void initialize() throws SQLException {
//
//    }
//}

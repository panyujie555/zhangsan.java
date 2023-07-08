package com.hainiuxy.jdbc;

import java.sql.*;

public class ConnectionUtil {
    // 数据库连接四大属性
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://11.87.38.23:3306/hainiu512?useSSL=false&characterEncoding=UTF-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hainiu";
    // 私有构造 不让其他人创建对象
    private ConnectionUtil() {
    }
        static {
            try {
                Class.forName(DRIVER);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     */

     public static  Connection getConnection() throws SQLException {

         Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         return connection;
     }
    /**
     * 关闭结果集、SQL处理对象和连接
     * @param resultSet
     * @param statement
     * @param connection
     * @throws SQLException
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
    /**
     * 关闭SQL处理对象和连接
     * @param statement
     * @param connection
     * @throws SQLException
     */

    public static void close(Statement statement, Connection connection) throws SQLException {
        close(null, statement, connection);
    }
}

package com.hainiuxy.jdbc;

import java.sql.*;

/**
 * 需求：查询category表中 cname是 家用电器/电脑 的记录
 * 由于 SQL注入，导致查询到了所有类别记录
 */
public class JDBCSearchDemo2 {
    public static void main(String[] args) throws Exception {
        try (
                // 获取数据库连接
                Connection conn = ConnectionUtil.getConnection();

        ) {
            query(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询
     */
    private static void query(Connection conn) {
        String cname = "男装/女装/童装/内衣";
        // sql注入不好使
//      String cname = "'家用电器/电脑' or 1=1";

        // 编写SQL语句，用?做占位符
        String sql = "select * from category where cname=?";
        try (
                // 创建SQL语句的预处理对象
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            // 给占位符赋值，占位符?的编号是从1开始
            pstmt.setString(1, cname);
            // 执行SQL语句并获取结果
            ResultSet rs = pstmt.executeQuery();
            // 遍历数据
            while (rs.next()) {
                // 按照编号获取字段数据
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.springlearn.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class JDBCTesting 
{
    public static void main( String[] args )
    {
        String jdbcURL = "jdbc:mysql://localhost:3306/springlearn?useSSL=false";
        String user = "root", pass = "jinx";
        try {
        	Connection conn = DriverManager.getConnection(jdbcURL, user, pass);
        	Statement stmt = conn.createStatement();
        	Boolean rs = stmt.execute("create table student (id int not null, name varchar(25) not null)");
        	System.out.println(rs);
        }catch(Exception e) {
        	;
        }
    }
}

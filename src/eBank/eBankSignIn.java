/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ramzan Dieze
 */
@WebService(serviceName = "eBankSignIn")
public class eBankSignIn {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signIn")
    public String signIn(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass, @WebParam(name = "isAdmin") boolean isAdmin) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ebank", "root", "");
            if (isAdmin) {
                try {
                    PreparedStatement statement = con.prepareStatement("select password from employee "
                            + "where userName =  ?  AND empType = \"A\" ");
                    System.out.println(" !!! "+pass);
                    statement.setString(1, user);
                    System.out.println(" !!! "+pass);
                    ResultSet rs = statement.executeQuery();
                    System.out.println(" !!! "+pass);
                    rs.next();
                    System.out.println(" !!! "+pass);
                    System.out.println("!!! "+rs.getString(1)+"  !!! "+pass);
                    if (rs.getString(1).equals(pass)) {
                        return "Password matched";
                    }
                    con.close();
                } catch (SQLException e) {
//                    System.out.println(e);
                    return "user not found, please check the username";
                }
            } else {
                try {
                    System.out.println(" !!! "+pass);
                    PreparedStatement statement = con.prepareStatement("select password from employee "
                            + "where userName =  ? AND empType = \"M\" ");
                    System.out.println(" !!! "+pass);
                    statement.setString(1, user);
                    System.out.println(" !!! "+pass);
                    ResultSet rs = statement.executeQuery();
                    System.out.println(" !!! "+pass);
                    rs.next();
                    System.out.println(" !!! "+pass);
                    if (rs.getString(1).equals(pass)) {
                        return "Password matched";
                    }
                    con.close();
                } catch (SQLException e) {
//                    System.out.println(e);
                    return "user not found, please check the username";
                }
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(" Error ");
        }
        return "Incorrect password";
    }
}

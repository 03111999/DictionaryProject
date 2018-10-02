package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dictionary;

public class AcessDatabase {

    public static Connection collectionDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance(); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary?useSSL=false", "root", "iamhereqt01071999");
        return con;
    }
    
    public static List<Dictionary> readDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        List<Dictionary> listDict = new ArrayList<>();
        Statement state = collectionDatabase().createStatement();
        String sql = "select * from data;";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Dictionary dict = new Dictionary(rs.getInt(1), rs.getString(2), rs.getString(3));
            listDict.add(dict);
        }
        return listDict;
    }
}

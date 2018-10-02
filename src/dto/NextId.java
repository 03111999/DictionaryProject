/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Dictionary;
import view.ViewDictionary;
import static view.ViewDictionary.listDict;

/**
 *
 * @author PC
 */
public class NextId {

    AcessDatabase acessDatabase = new AcessDatabase();

    public static String maxId() {
        ViewDictionary viewDictionary = new ViewDictionary();
        String id = "'" + String.valueOf(viewDictionary.listDict.get(listDict.size()-1).getId()+1) + "'";
        return id;
    }
}

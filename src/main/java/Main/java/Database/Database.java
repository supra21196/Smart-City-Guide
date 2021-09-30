/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java.Database;

import Main.java.Roles.User;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
/**
 *
 * @author sukhadapradhan
 */
public class Database {
    public static ObjectContainer db;
    public static String city;
    public static User loggedIn;
    
    public static void OpenDataBase()
    {
        db  = Db4o.openFile("/Users/sukhadapradhan/Smart City Full Project/database.txt");
    }
}

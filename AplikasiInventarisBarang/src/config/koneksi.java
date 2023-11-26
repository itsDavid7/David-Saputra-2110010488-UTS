/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.lang.System.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import tampilan.FormInventarisBarang;


/**
 *
 * @author acer
 */
public class koneksi {

    public static Connection getconConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection konekConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Gagal konek "+ex);
        }
        String url = "jdbc:mysql://localhost/inventaris";
        try{
            konekConnection = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil konek database");
        }
        catch(SQLException ex){
            System.out.println("Gagal koneksi database"+ex);
        }
        return konekConnection;
    }
        }

/**
 *
 * @author acer
 */

      
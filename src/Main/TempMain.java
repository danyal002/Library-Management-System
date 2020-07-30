/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

/**
 *
 * @author danyal
 */
public class TempMain {

    /**
     * @param barcodeText
     * @param args the command line arguments
     * @return
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws JsonProcessingException, SQLException, Exception {
//        List<String> genreList = new ArrayList<String>();
//        genreList.add("fiction");
//        genreList.add("comics");
//        ArrayList<String> checkout = new ArrayList<>();
//        ArrayList<String> borrowHistory = new ArrayList<>();
//
//        Book example = new Book(9234567890123L, "The Sins Of The Father", "Jeffrey Archer", 4,
//                "Gaba books", "jan 4th 2018", "july 4th 2020", 5, (ArrayList) genreList, 5, (ArrayList) checkout);
//
//        System.out.println(example.getGenre());
//
//        genreList.add("entertainment");
//        genreList.add("thrilling");
//        genreList.remove("comics");
//        example.setGenre((ArrayList) genreList);
//        //example.setAuthor("Greg Heffley");
//        System.out.println(example.getGenre());
//
//        ObjectMapper obj = new ObjectMapper();
//        String json = obj.writeValueAsString(example);
//        System.out.println(json);
//
//        User user = new User(1000000000, "Danyal", "Apr 2nd, 2002", "danyal.ak002@gmail.com", 23423234, 2342342, "4009 Harbour Landing Dr", 0);
//        PreparedStatement pst = General.getCon().prepareStatement("insert into users values (?,?)");
//        pst.setLong(1, 1000000000L);
//        pst.setString(2, General.userToString(user));
//
//        int r = pst.executeUpdate();
//        System.out.println(r);

        //set parameters for autoincrement in mysql
        //create a new user in the database
        //select the most recent id
        //change the json
//        System.out.println(user.getEmail());
//        user.setEmail("dan05@protonmail.com");
//        System.out.println(user.getEmail());
//        PreparedStatement pst = conn.prepareStatement("insert into transactions values(?,?,?,?,?)");
//        pst.setLong(1, 9234567890123L);
//        pst.setString(2, json);
//        int i = pst.executeUpdate();
//        pst.clearParameters();
//        pst.setLong(1, 1234567890);
//        List<String> checkedOut = new ArrayList<String>();
//        List<String> borrowHistory = new ArrayList<String>();
//
//        checkedOut.add("the diary of a wimpy kid");
//        borrowHistory.add("the hardy boys");
//
//        User user = new User("Danyal", "Apr 2nd, 2002", "danyal.ak002@gmail.com", 23423234, 2342342, "4009 Harbour Landing Dr", checkedOut, borrowHistory, 0);
//        System.out.println(user.getEmail());
//        user.setEmail("dan05@protonmail.com");
//        System.out.println(user.getEmail());
//        PreparedStatement pst = conn.prepareStatement("insert into transactions values(?,?,?,?,?)");
//        pst.setLong(1, 9234567890123L);
//        pst.setString(2, json);
//        int i = pst.executeUpdate();
//        pst.clearParameters();
//        pst.setLong(1, 1234567890);
//        pst.setLong(2, 9234567890123L);
//        pst.setString(3, formattedDate);
//        pst.setNull(4, Types.NULL);
//        pst.setNull(5, Types.NULL);
//        int i = pst.executeUpdate();
//        PreparedStatement pst = conn.prepareStatement("update transactions set checked_in=? where user_id=? && checked_out=?");
//        pst.setInt(2, 1234567890);
//        pst.setString(1, General.getFormattedDate());
//        pst.setString(3, "12-07-2020 23:40:50");
//        int i = pst.executeUpdate();
//        System.out.println(i);
//        System.out.println(General.dateToString(General.stringToDate("12-07-2020 23:40:50")));
//        LocalDateTime checkoutTime = General.stringToDate("12-07-2020 23:40:50");
//        LocalDateTime timeNow = General.stringToDate(General.getFormattedTimestamp());
//        Duration duration = Duration.between(timeNow, checkoutTime);
//        System.out.println(duration.toDays());
//        long phoneNum = 123456789L;
//        System.out.println(String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
//        System.out.println(generateBarcode("234333333444"));
    }

}

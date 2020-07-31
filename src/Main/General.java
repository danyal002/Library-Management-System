/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.json.JSONObject;
import org.krysalis.barcode4j.impl.code128.Code128;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author danyal
 */
public class General {

    public static final int FINES_PER_DAY = 2;
    public static final String POSTALCODE_REGEX = "^((?!.*[DFIOQU])[A-VXY][0-9][A-Z]) ?([0-9][A-Z][0-9])$";
    public static final String PHONENUMBER_REGEX = "^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$";
    public static final String SIN_REGEX = "(\\d{9})";
    public static final String TEXT_REGEX = "^([a-zA-Z])*$";
    public static final String EMAIL_REGEX = "^(.+)@(.+)$";

    public static String getFormattedTimestamp() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

    public static Connection getCon() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "");
        return conn;
    }

    public static LocalDateTime stringToDate(String x) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(x, dtf);
        return ldt;
    }

    public static String dateToString(LocalDateTime x) {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return x.format(myFormatObj);
    }

    public static User stringToUser(String x) {
        ObjectMapper obj = new ObjectMapper();
        User user = null;
        try {
            user = obj.readValue(x, User.class);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(General.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static String userToString(User x) {
        ObjectMapper obj = new ObjectMapper();
        String json = null;
        try {
            json = obj.writeValueAsString(x);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(General.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }

    //gets values from JSON object as per the key supplied in the parameters
    public static String getValueFJ(String x, String json) {
        JSONObject obj = new JSONObject(json);
        String result = obj.getString(x);
        return result;

    }

    public static String getDatePlusDays(int x) {
        LocalDateTime myDateObj = LocalDateTime.now().plusDays((long) x);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

    public static int getDuration(String start, String end) {
        LocalDateTime checkoutTime = General.stringToDate(start);
        LocalDateTime timeNow = General.stringToDate(end);
        Duration duration = Duration.between(checkoutTime, timeNow);
        return (int) duration.toDays();

    }

    public static void fieldErrorDisplayOn(JTextField text, JLabel label) {
        //turn the border red
        text.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0200")));
        //set up padding inside the JTextField
        text.setBorder(BorderFactory.createCompoundBorder(text.getBorder(), BorderFactory.createEmptyBorder(0, 6, 0, 6)));
        //display JLabel with Error
        label.setVisible(true);
    }

    public static void fieldErrorDisplayOff(JTextField text, JLabel label) {
        //turn the border to default yellow
        text.setBorder(BorderFactory.createLineBorder(Color.decode("#FFCC00")));
        //set up padding inside the JTextField
        text.setBorder(BorderFactory.createCompoundBorder(text.getBorder(), BorderFactory.createEmptyBorder(0, 6, 0, 6)));
        //hide the label
        label.setVisible(false);
    }

    public static boolean validateField(JTextField text, String regex) {
        //this method validates a field based on the provided regex pattern
        boolean result = true;

        if (!(text.getText().equals(""))) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(text.getText());
            result = m.matches();
        } else if (text.getText().equals("")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static BufferedImage generateBarcode(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createCode128(barcodeText);
        barcode.setResolution(500);
        return BarcodeImageHandler.getImage(barcode);
    }

    public static BufferedImage generateCode128(String barcodeText) {
        Code128Bean bg = new Code128Bean();
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(200, BufferedImage.TYPE_BYTE_GRAY, false, 0);
        bg.generateBarcode(canvas, barcodeText);
        return canvas.getBufferedImage();
    }

}

package login_app.utils;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] kata = fullName.split(" ");

        if (kata.length == 1) {
            return kata[0];
        } else {
            return kata[kata.length - 1];
        }
    } 
   


}



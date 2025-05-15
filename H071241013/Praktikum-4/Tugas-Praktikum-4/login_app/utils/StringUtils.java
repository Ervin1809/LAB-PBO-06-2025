package login_app.utils;

public class StringUtils {
    public static String generateNickName(String fullName) {
        // Contoh: Ambil kata pertama dari nama lengkap sebagai nickname
        if (fullName == null || fullName.isEmpty()) {
            return "Unknown";
        }
        return fullName.split(" ")[-1];
    }
}
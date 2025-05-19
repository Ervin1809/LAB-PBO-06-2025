import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogger {
    private List<String> logs;
    private DateTimeFormatter formatter;

    // Constructor
    public LibraryLogger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    // Menambahkan aktivitas ke log dengan timestamp
    public String logActivity(String activity) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = timestamp + " " + activity;
        logs.add(logEntry);
        return logEntry;
    }

    // Mengambil semua log sebagai String
    public String getLogs() {
        if (logs.isEmpty()) {
            return "Tidak ada aktivitas yang dicatat.";
        }

        StringBuilder sb = new StringBuilder();
        for (String log : logs) {
            sb.append(log).append("\n");
        }
        return sb.toString();
    }

    // Menghapus semua log
    public void clearLogs() {
        logs.clear();
    }
}

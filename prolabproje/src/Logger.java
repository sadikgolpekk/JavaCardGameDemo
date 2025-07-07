//Logger Classi
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static BufferedWriter writer;

    static {
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\sadik\\Desktop\\KOU CENG 2\\Prolab\\Prolab2\\prolabproje\\sonuclar.txt", true));
        } catch (IOException e) {
            System.err.println("Dosya oluşturulamadı: " + e.getMessage());
        }
    }

    public static void log(String message) {
        System.out.println(message); // Terminale yaz
        try {
            writer.write(message);
            writer.newLine(); // Satır atla
            writer.flush();   // Buffer'ı temizle
        } catch (IOException e) {
            System.err.println("Dosyaya yazılamadı: " + e.getMessage());
        }
    }

    public static void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.err.println("Dosya kapatılamadı: " + e.getMessage());
 }
}
}
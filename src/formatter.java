import java.nio.file.*;
import java.io.IOException;

public class SimpleCodeFormatter {
    private String filePath;

    public SimpleCodeFormatter(String filePath) {
        this.filePath = filePath;
    }

    public void format() throws IOException {
        String code = new String(Files.readAllBytes(Paths.get(filePath)));
        String formattedCode = applyFormatting(code);
        Files.write(Paths.get(filePath), formattedCode.getBytes());
    }

    private String applyFormatting(String code) {
        // Implement simple formatting logic here
        return code.trim(); // Example: just trims whitespace
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleCodeFormatter <file_path>");
            System.exit(1);
        }
        String filePath = args[0];
        SimpleCodeFormatter formatter = new SimpleCodeFormatter(filePath);
        formatter.format();
    }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;
    private Path path;


    public FilePartReader() {
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) throws IllegalArgumentException {
        if (fromLine < 1 && toLine < fromLine) throw new IllegalArgumentException("Incorrect From Line given");
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public List<String> read() throws IOException {
        try {
            List<String> content = Files.readAllLines(path.resolve(filePath));
            return content;
        } catch (IOException e) {
            throw new IOException("Cannot read file");
        }
    }

    public String readLines() throws IOException {
        List<String> fullFile = read();
        return fullFile.toString().substring(fromLine-1, toLine+1);
    }

}


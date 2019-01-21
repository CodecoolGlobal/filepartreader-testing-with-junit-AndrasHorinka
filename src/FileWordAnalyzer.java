import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader = new FilePartReader();


    public List<String> getWordsOrderedAlphabetically() throws IOException {
        String filePart = filePartReader.readLines();
        List<String> convertedContent = Arrays.asList(filePart.split(" "));
        convertedContent.sort(String::compareToIgnoreCase);

        return convertedContent;
    }

    public List<String> getWordsContainingSubstring(String subString) throws IOException {
        List<String> filteredContent = new ArrayList<>();
        String filePart = filePartReader.readLines();
        List<String> convertedContent = Arrays.asList(filePart.split(" "));

        for (String word : convertedContent) {
            if (word.equals(subString)) {
                filteredContent.add(word);
            }
        }

        return filteredContent;
    }

    public List<String> getStringsWhichPalindromes() throws IOException {
        List<String> filteredContent = new ArrayList<>();
        String filePart = filePartReader.readLines();
        List<String> convertedContent = Arrays.asList(filePart.split(" "));

        for (String word : convertedContent) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            if (word.equals(reverseWord)) {
                filteredContent.add(word);
            }
        }
        return filteredContent;
    }

}

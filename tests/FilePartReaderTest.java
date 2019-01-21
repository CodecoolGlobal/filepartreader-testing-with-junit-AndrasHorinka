import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    FilePartReader filePartReader = new FilePartReader();

    @Test
    public void testIsSetupThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            filePartReader.setup("/temp.csv", 0, 2);
        });
    }
}
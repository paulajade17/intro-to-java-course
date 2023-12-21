import java.util.List;
import java.util.Map;

public class FilenameExtension extends Exception{
    
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty");
        }
}

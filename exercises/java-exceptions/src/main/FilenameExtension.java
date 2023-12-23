import java.util.List;
import java.util.Map;

public class FilenameExtension extends Exception{
    
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty");
        } 

        else if(filename.endsWith(".java")){
            return true;
        }
        else return false;
}
    public Map<String, Interger> map(List<String> filenames){

        Map<String, Integer> myMap = new HashMap<>();
        for (String file : filenames) {
            try {
                if(check(file) == true) {
                    myMap.put(file, 1);
                }
                else {
                    myMap.put(file, 0);
                }

            }
            catch(FilenameException e){
                myMap.put(file, -1);
                e.printStackTrace();
            }
        }
        return myMap;
    
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrintDictionary {
    public static void main(String[] args) throws Exception {
        //Create new File object
        File file = new File("anyfile.txt");
        //Create new Buffer reader
        BufferedReader br = new BufferedReader(new FileReader(file));
        //Print out values
        String st;
        while ((st= br.readLine()) != null) {
            String[] arr = st.split(" ");
            for (String str1:arr) {
                System.out.println(str1);
            }
        }

    }
}

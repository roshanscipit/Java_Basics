package IOOperation.O;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class bufferReader {

    public static void main(String[] args) throws IOException {

        File f = new File("buffer.txt");

        try(BufferedWriter br = new BufferedWriter(new java.io.FileWriter(f,true))){
            br.write("Appending a new line to the file.\n");
            br.flush();
        }catch(Exception e){
            e.printStackTrace();
        }


        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Finished reading the file.");
        }

        

       

    }
}
    


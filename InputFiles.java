import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFiles {
    private BufferedReader in;
    public InputFiles(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e){
            throw  e;
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException e1){
                System.out.println("in.close unsuccessful");
            }
            throw  e;
        }finally {

        }
    }

    public String getLine(){
        String s;
        try {
            s = in.readLine();
        }catch (IOException e){
            throw new RuntimeException("ReadLine() failed");
        }
        return s;
    }

    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() successful");
        }catch (IOException e){
            throw  new RuntimeException("in.close() failed");
        }
    }
}

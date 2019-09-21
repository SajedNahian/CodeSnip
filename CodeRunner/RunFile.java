import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RunFile {
    public static void main(String[] args){
        TurnIntoFile tf = new TurnIntoFile();

        String strRun = "";
        int i = 1;
        while(i < args.length){
            strRun += args[i] + " ";
            i++;
        }
        tf.writeFile(strRun);

        String run = "java inputFile.java";
        try
        {
            Runtime.getRuntime().exec(run);
        }
        catch (Exception e)
        {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}

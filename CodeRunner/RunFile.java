public class RunFile {
    public static void main(String[] args){


        String run = "javac inputFile.java";
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

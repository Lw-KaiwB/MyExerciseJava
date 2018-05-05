import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggerException2 {
    private static Logger logger = Logger.getLogger("LoggerException2");
    static void logException(Exception e){
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String[] args) throws Exception{
        try {
            throw new NullPointerException();
        }catch (Exception e){
            logException(e);
            e.printStackTrace();
            StackTraceElement[] es =e.getStackTrace();
            throw (Exception) e.fillInStackTrace();
        }
    }
}

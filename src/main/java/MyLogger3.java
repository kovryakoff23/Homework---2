import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Singleton
public class MyLogger3 implements MyLogger {
    @Inject
    private Logger logger;
    public String tag;
    @OutputF MyLogger logger1;
    public void Logging(@NotNull String StringLog, int number){
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("ConfC.iml"));
        } catch (IOException e)
        {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        StringLog = (number-1) + " " + StringLog;
        logger.log(Level.INFO, StringLog);

        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("ConfF.iml"));
        } catch (IOException e)
        {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        StringLog = "<" + tag + "> " + number + " " + StringLog + " </" + tag + ">";
        logger.log(Level.INFO, StringLog);
    }
    @Override
    public void settag(@NotNull String tag) {
        this.tag = tag;
    }
}

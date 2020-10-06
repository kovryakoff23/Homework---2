import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Singleton
public class MyLogger1 implements MyLogger {
    @Inject
    private Logger logger;

    @Override
    public void Logging(@NotNull String StringLog, int number) throws IOException {
        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("ConfC.iml"));
        } catch (IOException e)
        {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
            StringLog = number + " " + StringLog;
            logger.log(Level.INFO, StringLog);
    }
    @Override
    public void settag(@NotNull String tag) {
    }
}

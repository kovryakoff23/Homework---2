import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyLogger2 implements MyLogger {
    @Inject
    private @NotNull Logger logger;
    public @NotNull String tag;
    void gettag (String tag) {
        this.tag = tag;
    }
    @Override
    public void Logging(@NotNull String StringLog, int number) throws IOException {
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
    @NotNull Logger getLogger (){
        return logger;
    }
}

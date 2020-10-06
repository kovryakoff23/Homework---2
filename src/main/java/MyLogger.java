import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

public interface MyLogger {
    void Logging(@NotNull String StringLog, int number) throws IOException;
    void settag (@NotNull String tag);
}

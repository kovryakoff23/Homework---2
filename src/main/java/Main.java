import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.util.logging.LogManager;


public class Main {
    public static void main(@NotNull String[] args) throws IOException {
        final Injector injector = Guice.createInjector(new TestModule());
        injector.getInstance(WaitInput.class).waitForInput();
    }
}

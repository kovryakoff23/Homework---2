import com.google.inject.AbstractModule;

public class TestModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MyLogger.class).annotatedWith(OutputC.class).to(MyLogger1.class);
        bind(MyLogger.class).annotatedWith(OutputF.class).to(MyLogger2.class);
        bind(MyLogger.class).annotatedWith(Output.class).to(MyLogger3.class);
    }
}

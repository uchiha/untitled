package factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.ScenarioScope;
import modules.InitialModule;

public class CustomObjectFactory implements ObjectFactory {
    private Injector injector;
    public CustomObjectFactory() {
        this.injector = Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), new InitialModule());
    }

    public void start() {
        this.injector.getInstance(ScenarioScope.class).enterScope();
    }

    public void stop() {
        this.injector.getInstance(ScenarioScope.class).exitScope();
    }

    public boolean addClass(Class<?> aClass) {
        return true;
    }

    public <T> T getInstance(Class<T> aClass) {
        return this.injector.getInstance( aClass );
    }
}

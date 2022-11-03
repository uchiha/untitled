package factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.guice.CucumberModules;
import io.cucumber.guice.ScenarioScope;
import modules.SecondaryModule;

public class CustomObjectFactoryTwo implements ObjectFactory {
    private Injector injector;
    public CustomObjectFactoryTwo() {
        this.injector = Guice.createInjector(Stage.PRODUCTION, CucumberModules.createScenarioModule(), new SecondaryModule());
    }

    @Override
    public void start() {
        this.injector.getInstance(ScenarioScope.class).enterScope();
    }

    @Override
    public void stop() {
        this.injector.getInstance(ScenarioScope.class).exitScope();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return true;
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return this.injector.getInstance(aClass);
    }
}

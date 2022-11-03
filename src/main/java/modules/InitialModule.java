package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import pageobjects.IPageObject;
import pageobjects.TestPageObject;

public class InitialModule extends AbstractModule {
    protected void configure(){
        // do configs here....
        bind(IPageObject.class).to(TestPageObject.class).in(Scopes.SINGLETON);
    }
}

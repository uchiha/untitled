package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import pageobjects.IPageObject;
import pageobjects.TestPageObjectTwo;

public class SecondaryModule extends AbstractModule {
    protected void configure(){
        // do configs here....
        bind(IPageObject.class).to(TestPageObjectTwo.class).in(Scopes.SINGLETON);
    }
}

package hooks;

import base.WebDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static base.WebDriverSingleton.initializeGoogleChrome;

public class TaggedHooks {
    @Before
    public void initialize() {
        initializeGoogleChrome();
    }
    }


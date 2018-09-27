package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HOOK {
    @Before
    public void Initializetest()
    {
        System.out.println("opening the browser : MOCK");
    }

    @After
    public void Teardowntest()
    {
        System.out.println("Closing the browser : MOCK");
    }
}

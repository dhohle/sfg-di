package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.format.annotation.NumberFormat;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeAll
    public void setUp() throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
}

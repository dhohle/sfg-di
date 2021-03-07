package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * most preferred
 */
class ConstructorInjectorControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(this.controller.sayHello());
    }
}
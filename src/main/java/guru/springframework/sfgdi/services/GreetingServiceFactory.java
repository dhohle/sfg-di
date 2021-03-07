package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(this.greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(this.greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(this.greetingRepository);
            default:
                return new PrimaryGreetingService(this.greetingRepository);

        }
    }
}

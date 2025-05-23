package dukes.ai;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class JakartaGPT {

    @Inject
    private AwesomeJakartaGPTModel awesomeModel;

    public String chat(String message) {

        return awesomeModel.prompt(message);
    }
}

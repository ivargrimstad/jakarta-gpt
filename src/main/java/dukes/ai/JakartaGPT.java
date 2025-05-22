package dukes.ai;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JakartaGPT {

    private final AwesomeJakartaGPTModel awesomeModel = new AwesomeJakartaGPTModel();

    public String chat(String message) {

        return awesomeModel.prompt(message);
    }
}

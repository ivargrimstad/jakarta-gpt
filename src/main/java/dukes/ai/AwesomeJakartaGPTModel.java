package dukes.ai;

import java.util.HashMap;
import java.util.Map;

public class AwesomeJakartaGPTModel {

    private static final Map<String, String> model = new HashMap<>();

    AwesomeJakartaGPTModel() {
        model.put("Give me a number!", "42");
        model.put("How old is Java?", "Java is 30 Years old this year!");
        model.put("Spring rocks!", "You meant Jakarta EE, right?");
    }

    String prompt(String message) {

        if (model.containsKey(message)) {
            return model.get(message);

        } else {
            // for demo purposes, if I can't remember the exact message, I will try to find a similar one
            return model.keySet().stream()
                    .filter(key -> key.toLowerCase().contains(message.substring(0, 3).toLowerCase()))
                    .findFirst().map(model::get).orElse("I don't know what you mean!");
        }
    }
}

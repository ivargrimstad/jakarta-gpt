package dukes.ai;


import org.junit.Test;

public class AwesomeJakartaGPTModelTest {

    @Test
    public void testPrompt1_1() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "Give me a number!";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("42");
    }

    @Test
    public void testPrompt2_1() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "How old is Java";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("Java is 30 Years old this year!");
    }

    @Test
    public void testPrompt3_1() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "Spring rocks!";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("You meant Jakarta EE, right?");
    }


    @Test
    public void testPrompt1_2() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "Giv";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("42");
    }

    @Test
    public void testPrompt2_2() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "How";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("Java is 30 Years old this year!");
    }

    @Test
    public void testPrompt3_2() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "Spring";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("You meant Jakarta EE, right?");
    }

    @Test
    public void testPrompt4() {

        // Arrange
        AwesomeJakartaGPTModel model = new AwesomeJakartaGPTModel();
        String message = "Jalla";

        // Act
        String response = model.prompt(message);

        // Assert
        assert response != null;
        assert response.equals("I don't know what you mean!");
    }

}

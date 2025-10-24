
public class ResponseGenerator {
    public String generateResponse(String query) {
        if (query.toLowerCase().contains("java")) {
            return "Java is a high-level, object-oriented programming language.";
        } else if (query.toLowerCase().contains("oop")) {
            return "OOP stands for Object-Oriented Programming.";
        } else {
            return "Sorry, I don't have an answer for that right now.";
        }
    }
}

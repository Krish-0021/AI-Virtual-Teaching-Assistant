
public class VirtualAssistant {
    private ResponseGenerator generator;

    public VirtualAssistant() {
        generator = new ResponseGenerator();
    }

    public String processQuery(String query) {
        return generator.generateResponse(query);
    }
}

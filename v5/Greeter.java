package v5;

import java.io.IOException;
import java.util.Map;

public class Greeter {

    private Template template;

    public Greeter(String s) {
        template = new Template(s);
    }

    public String getGreeting(Map<String, String> vars) throws IOException {
        return template.instantiate(vars);
    }

}

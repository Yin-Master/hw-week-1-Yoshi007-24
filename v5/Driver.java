package v5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) throws IOException {
        String template = "Good $daypart $name - that's a nice $color shirt. " +
                "$newline $zippy";
        Map<String, String> templateVars = new HashMap<String, String>();

        templateVars.put("$name", "Isaac");
        templateVars.put("$color", "green");
        Greeter g = new Greeter(template);
        templateVars.put("$zippy", "Zippy quote: ");
        String greeting = g.getGreeting(templateVars);
        System.out.println(greeting);
    }

}

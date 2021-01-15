package v5;


import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Greeter {

    public Template template;

    public Greeter(String s) throws IOException {
        template = new Template(s);
        quote();
    }

    public void quote() throws IOException {
        System.out.println("Would you like want a Random Zippy quote or a " +
                "number of your choosing?");
        System.out.print("Enter \"R\" for a random quote or \"N\" to select " +
                "all sequential quotes: ");

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next().toUpperCase();
        System.out.println();
        template.getZippy(input);
    }
    public String getGreeting(Map<String, String> vars) throws IOException {
        return template.instantiate(vars);
    }




}

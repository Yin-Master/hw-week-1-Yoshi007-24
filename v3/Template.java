package v3;

import java.util.Map;

public class Template {
        
    public Template(String s) {
        words = s.split("\\s");
    }
    
    public String instantiate(Map<String, String> args) {
        String[] translatedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (isVariable(words[i])) {
                if (args.containsKey(words[i]))
                    translatedWords[i] = args.get(words[i]);
            } else {
                translatedWords[i] = words[i];
            }
        }
        return String.join(" ", translatedWords);
    }

    private boolean isVariable(String s) { 
        return s.charAt(0) == '$'; 
    }

    private String [] words;
    
}

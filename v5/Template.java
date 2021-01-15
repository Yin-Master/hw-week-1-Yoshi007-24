package v5;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Template {
    private String str = "";

    public Template(String s) {
        words = s.split("\\s");
    }

    public void getZippy(String rN) throws IOException {
        if (rN.equals("R")) {
            zippyR();
        }else
            zippyN();
    }

    public String get() {
        return "Zippy quote: " + str;
    }

    public String instantiate(Map<String, String> args) throws IOException {
        String [] translatedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (isVariable(words[i])) {
                if (words[i].equals("$daypart"))
                    translatedWords[i] = (new DayPart()).toString();
                else if (words[i].equals("$newline"))
                    translatedWords[i] = "\n";
                else if (words[i].equals("$zippy"))
                    translatedWords[i] = get();
                else if (args.containsKey(words[i]))
                    translatedWords[i] = args.get(words[i]);
            }
            else {
                translatedWords[i] = words[i];
            }
        }
        return String.join(" ", translatedWords);
    }

    private boolean isVariable(String s) {
        return s.charAt(0) == '$';
    }

    private String [] words;

    private String zippyR() throws IOException {
        File file = new File("data/yow.lines");
        Scanner zippyFile = new Scanner(file);
        //String str = "";
        Random rand = new Random();
        int count = 0, max = 231;
        int random = rand.nextInt(max + 1);
        while (zippyFile.hasNextLine() && count != random) {
            count++;
            str = zippyFile.nextLine();
        }
        zippyFile.close();
        return str;
    }

    private String zippyN() throws IOException {
        File file = new File("data/yow.lines");
        Scanner zippyFile = new Scanner(file);
        String[] arr;
        int counter = 1;
        while (zippyFile.hasNextLine()) {
            str += counter++ + ". " + zippyFile.nextLine() + "\n";
        }
        zippyFile.close();
        return str;
    }

}

package by.me.service;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlToStringReader {

    public String read(File xmlFile) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(xmlFile))) {
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = reader.readLine();
            }

        }

        String result = stringBuilder.toString();
        result = result.trim();
        result = replaceQuotAndApos(result);
        result = result.replace('\n', ' ');

        return result;
    }

    private String replaceQuotAndApos(String string) {
        Pattern quotPattern = Pattern.compile("&quot;");
        Pattern aposPattern = Pattern.compile("&apos;");

        Matcher qMatcher = quotPattern.matcher(string);
        string = qMatcher.replaceAll("\"");

        Matcher aMatcher = aposPattern.matcher(string);
        string = aMatcher.replaceAll("'");

        return string;
    }


}


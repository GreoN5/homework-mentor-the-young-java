package design_patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class WordTranslator implements ITranslator {
    private Map<String, String> vocabulary = new HashMap<>();

    public WordTranslator() {
        vocabulary.put("здравей", "hello");
        vocabulary.put("свят", "world");
    }

    @Override
    public String translate(String context) {
        return vocabulary.get(context);
    }
}

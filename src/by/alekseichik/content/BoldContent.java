package by.alekseichik.content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoldContent implements IContent {

    public static final String SET_PLAIN_TEXT = "\033[0;0m";
    public static final String SET_BOLD_TEXT = "\033[0;1m";

    private List<String> words;

    public BoldContent(String... s) {
        words = new ArrayList<>();
        words.addAll(Arrays.asList(s));
    }

    @Override
    public String getContent() {
        return words.stream().reduce("", (pre, next) -> {
            return pre + " " + next + SET_PLAIN_TEXT + " " + next + " " + SET_BOLD_TEXT + '\n';
        });
    }

    public static void main(String[] args) {
        BoldContent content = new BoldContent();
        System.out.println(content.getContent());
    }
}

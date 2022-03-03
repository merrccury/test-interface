package by.alekseichik.content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HTMLContent implements IContent {

    private final List<String> words;

    public HTMLContent(String... str) {
        words = new ArrayList<>();
        words.addAll(Arrays.asList(str));
    }

    @Override
    public String getContent() {

        String text = words.stream().reduce("", (pre, next) -> {
            return pre + "  <p> " + next + " </p>\n";
        });

        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Пример веб-страницы</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <h1>Заголовок</h1>\n" +
                text +
                " </body>\n" +
                "</html>";
    }
}

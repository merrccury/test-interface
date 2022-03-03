package by.alekseichik;

import by.alekseichik.content.BoldContent;
import by.alekseichik.content.HTMLContent;
import by.alekseichik.content.IContent;

public class Main {

    public static void main(String[] args) {
        IOutput consoleOutput = new ConsoleOutput();
        IOutput fileOutput = new FileOutput("file.html");

        IContent bold = new BoldContent("one", "two", "three");
        IContent html = new HTMLContent("one", "two", "three");

        // consoleOutput.print(html);
        fileOutput.print(html);

    }
}

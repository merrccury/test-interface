package by.alekseichik;

import by.alekseichik.content.IContent;

public class ConsoleOutput implements IOutput {

    private final String deviceName = "ConsoleOutput";

    @Override
    public boolean print(IContent content) {
        System.out.println(content.getContent());
        return true;
    }

    @Override
    public String getInfo() {
        return deviceName;
    }
}

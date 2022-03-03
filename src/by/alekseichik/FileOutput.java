package by.alekseichik;

import by.alekseichik.content.IContent;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileOutput implements IOutput {

    public FileOutput(String fileName) {
        this.fileName = fileName;
    }

    private final String fileName;
    private final String deviceName = "FileOutput";

    @Override
    public boolean print(IContent content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(content.getContent());

            writer.close();
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    @Override
    public String getInfo() {
        return deviceName;
    }
}

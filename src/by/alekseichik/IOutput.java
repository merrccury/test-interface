package by.alekseichik;

import by.alekseichik.content.IContent;

public interface IOutput {
    boolean print(IContent content);

    String getInfo();
}

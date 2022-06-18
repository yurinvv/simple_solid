package io;

import java.util.Scanner;

public class ReadConsole implements IReader {

    private Scanner scanner;

    public ReadConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int read() {
        return scanner.nextInt();
    }
}

package io;

import java.util.Scanner;

/**
 * Single responsibility principle.
 * This class deals only with I/O operations.
 */

public class Data implements IData {

    //Interface segregation
    private IPrinter printer;
    private IReader reader;

    public Data(IPrinter printer, IReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(int number) {
        printer.print(number);
    }

    @Override
    public int read() {
        return reader.read();
    }

}

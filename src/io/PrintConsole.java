package io;

public class PrintConsole implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void print(int number) {
        System.out.println(number);
    }
}

import io.*;
import model.Model;
import service.IService;
import service.ServiceSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        //Open-Closed principle
        File file = new File("numbers.txt");
        Scanner scanner = new Scanner(file);
        //Scanner scanner = new Scanner(System.in);
        IReader reader = new ReadConsole(scanner);
        IPrinter printer = new PrintConsole();
        IData data = new Data(printer, reader);
        IService service = new ServiceSum();

        Model model = new Model();
        model.init(data);
        model.calc(service);
        model.done(data);

        // 1 hour 22 minute
    }
}

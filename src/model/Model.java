package model;

import io.IData;
import io.IPrinter;
import service.IService;


/**
 * The model is the main part of the program
 */

/**
 * Single responsibility principle.
 * This class deals with the main algorithm.
 */
public class Model {

    private int a, b, result;

    public void init(IData data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    public void calc(IService service) {
        result = service.calculate(a, b);
    }

    //Interface segregation
    public void done(IPrinter printer) {
        printer.print("Result: ");
        printer.print(result);
    }
}

package io;

/**
 * Dependency inversion principle.
 * Instances should not depend on other instances, only abstractions.
 */

/**
 * If it is too much for a class to use this interface, then it can use one of the extensible interfaces.
 */
public interface IData extends IReader, IPrinter {
    /**
     * The contracts:
     * Everyone who implements this interface must override these methods.
     */

    default int input(String text) {
        print(text);
        return read();
    }

}

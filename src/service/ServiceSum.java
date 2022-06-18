package service;

/**
 * Single responsibility principle.
 * This class deals only with the calculate operation.
 */

public class ServiceSum implements IService {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

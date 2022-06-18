package service;

/**
 * Dependency inversion principle.
 * Instances should not depend on other instances, only abstractions.
 */

public interface IService {

    /**
     * The contract:
     * Everyone who implements this interface must override this method.
     */
    int calculate(int a, int b);
}

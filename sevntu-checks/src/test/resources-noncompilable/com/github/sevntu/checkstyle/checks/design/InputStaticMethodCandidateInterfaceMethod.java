package com.github.sevntu.checkstyle.checks.design;

/**
 * Compilable with Java 8. 
 */
public class InputStaticMethodCandidateInterfaceMethod {

    interface InnerIterface {
        default void foo() {
            return;
        }
    }

    public static void foo() { }

    private void bar() {  // violation
        foo();
    }
}

package code.impl2interf;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IntegerDV;

import java.util.function.Predicate;

public abstract class A implements J, K {
    @Override
    public void show() {
        System.out.println(" A ");
    }

}

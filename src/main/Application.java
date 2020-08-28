package main;

import pattern.SomeClassFactory;
import someclass.SomeClass;

public class Application {

    public static void main(String[] args) throws Exception {


        SomeClass a = SomeClassFactory.getObject();
        System.out.println(a.getXyz());
    }
}

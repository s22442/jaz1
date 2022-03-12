package pl.pjatk.kajwel;

import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    public SomeClass() {
        System.out.println("SomeClass.SomeClass");
    }

    public void printClassName() {
        System.out.println("SomeClass.printClassName");
    }
}

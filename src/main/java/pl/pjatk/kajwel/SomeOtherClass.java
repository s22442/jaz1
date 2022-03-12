package pl.pjatk.kajwel;

import org.springframework.stereotype.Component;

@Component
public class SomeOtherClass {
    public SomeOtherClass(SomeClass someClass) {
        System.out.println("SomeOtherClass.SomeOtherClass");
        someClass.printClassName();
    }

    public void printClassName() {
        System.out.println("SomeOtherClass.printClassName");
    }
}

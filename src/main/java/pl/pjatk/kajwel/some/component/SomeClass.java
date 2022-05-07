package pl.pjatk.kajwel.some.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    public SomeClass(@Value("${my.custom.property:My custom property is not here :(}") String myCustomProperty) {
        System.out.println("SomeClass.SomeClass");
        System.out.println(myCustomProperty);
    }

    public void printClassName() {
        System.out.println("SomeClass.printClassName");
    }
}

import Annotation.annotation;
import Generisc.Exercise2;
import Generisc.exercise;
import Source.Employee;
import Source.PersionModule;
import Source.Students;

import java.util.ArrayList;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// define annotation for class
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface MyClassAnnotation {
    String classType();
}

// Apply annotation
@MyClassAnnotation(classType = "ENTITY")
class Hello {
    public void sayHello() {
        System.out.println("hello!");
    }
}

// Apply annotation for subclass
class Alo extends Hello {

}

// Access annotation
class Test {
    public static void main(String args[]) throws Exception {
        // get annotation from class "Alo"
        MyClassAnnotation canno = Alo.class
                .getAnnotation(MyClassAnnotation.class);
        // show value of annotation
        System.out.println("classType is: " + canno.classType());
    }
}
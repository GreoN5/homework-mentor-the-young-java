package innerNestedClasses;

public class Demo {
    // instantiate inner class from outer class
    OuterClass outerObject = new OuterClass();
    OuterClass.InnerClass innerObject = outerObject.new InnerClass("Test");

    // shorter way
    OuterClass.InnerClass shortInnerObjInstantiation = new OuterClass().new InnerClass("Test1");


    String name = OuterClass.StaticNestedClass.getName();
}

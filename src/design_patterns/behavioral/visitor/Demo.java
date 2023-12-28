package design_patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<IComponent> components = new ArrayList<>();
        components.add(new HardDrive());
        components.add(new CPU());
        components.add(new RAM());

        DiagnosticTool tool = new DiagnosticTool();

        for (IComponent component : components) {
            component.accept(tool);
        }
    }
}

package design_patterns.behavioral.visitor;

public class CPU implements IComponent {
    @Override
    public void accept(IComponentDiagnosticTool tool) {
        tool.visit(this);
    }
}

package design_patterns.behavioral.visitor;

public interface IComponent {
    void accept(IComponentDiagnosticTool tool);
}

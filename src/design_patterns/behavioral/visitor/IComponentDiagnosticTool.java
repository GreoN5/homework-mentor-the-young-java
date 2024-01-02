package design_patterns.behavioral.visitor;

public interface IComponentDiagnosticTool {
    void visit(HardDrive hardDrive);
    void visit(CPU cpu);
    void visit(RAM ram);
}

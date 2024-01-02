package design_patterns.behavioral.visitor;

public class DiagnosticTool implements IComponentDiagnosticTool {
    @Override
    public void visit(HardDrive hardDrive) {
        System.out.println("Diagnosing Hard Drive.");
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("Diagnosing CPU.");
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("Diagnosing RAM.");
    }
}

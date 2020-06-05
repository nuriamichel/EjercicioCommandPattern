package ejercicio;

public class ApagarCommand implements ICommand {
    private Receiver receiver;

    public ApagarCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.operationApagar();
    }
}

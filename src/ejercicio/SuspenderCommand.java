package ejercicio;

public class SuspenderCommand implements ICommand {
    private Receiver receiver;

    public SuspenderCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.operationSuspender();
    }
}

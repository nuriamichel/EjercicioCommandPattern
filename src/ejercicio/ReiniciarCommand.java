package ejercicio;

public class ReiniciarCommand implements ICommand {
    private Receiver receiver;

    public ReiniciarCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.operationReiniciar();
    }
}

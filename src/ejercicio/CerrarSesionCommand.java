package ejercicio;

public class CerrarSesionCommand implements ICommand {
    private Receiver receiver;

    public CerrarSesionCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.operationCerrarSesion();
    }
}

package ejercicio;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        ApagarCommand apagarCommand = new ApagarCommand(receiver);
        ReiniciarCommand reiniciarCommand = new ReiniciarCommand(receiver);
        CerrarSesionCommand cerrarSesionCommand = new CerrarSesionCommand(receiver);
        SuspenderCommand suspenderCommand = new SuspenderCommand(receiver);

        Invoker invoker = new Invoker();
        receiver.setUsuario("nuriamichel123");

        invoker.setCommand(apagarCommand);
        invoker.setCommand(reiniciarCommand);
        invoker.setCommand(cerrarSesionCommand);
        invoker.setCommand(suspenderCommand);


        invoker.runCommand();

    }
}

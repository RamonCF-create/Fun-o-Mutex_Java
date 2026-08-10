public class Mutex {

    private volatile boolean ocupado = false;

    public void entrar() {

        while (ocupado) {
        }

        ocupado = true;
    }

    public void sair() {
        ocupado = false;
    }
}
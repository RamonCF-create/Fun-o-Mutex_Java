public class Main {

    static Mutex mutex = new Mutex();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {

                System.out.println("Thread 1 quer entrar");

                mutex.entrar();

                System.out.println("Thread 1 entrou");
                System.out.println("Thread 1 trabalhando...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 1 saiu");

                mutex.sair();
            }
        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {

                System.out.println("Thread 2 quer entrar");

                mutex.entrar();

                System.out.println("Thread 2 entrou");
                System.out.println("Thread 2 trabalhando...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2 saiu");

                mutex.sair();
            }
        });

        t1.start();
        t2.start();
    }
}
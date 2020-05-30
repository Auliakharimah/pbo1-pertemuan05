package tugas;

public class Main {
    void turun() {
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok() {
        energi--;
        System.out.println("Drone belok");
    }

    void maju() {
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur() {
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}

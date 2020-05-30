package tugas;

public class Drone {
    String merk;
    String warna;
    Int kecepatan;
    Int ketinggian;
    int energi;

    void terbang() {
        energi--;
        if (energi > 10) {
            ketinggian++;
            System.out.println("Drone terbang");
        } else {
            System.out.println("Energi lemah : Drone tidak bisa terbang");
        }
    }

    void matikanMesin() {
        if (ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan");
        }
    }
}






// Entitas Mahasiswa
class Mahasiswa {
    private String nama;
    private String npm;

    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    // Method untuk mengerjakan tugas
    public void kerjakanTugas() {
        // Implementasi tugas
    }

    // Method untuk mengikuti UTS
    public void ikutiUTS() {
        // Implementasi UTS
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NPM
    public String getNpm() {
        return npm;
    }
}

// Entitas Mahasiswa yang mengambil mata kuliah PBO
class MahasiswaPBO extends Mahasiswa {
    public MahasiswaPBO(String nama, String npm) {
        super(nama, npm);
    }

    // Method untuk mencetak data mahasiswa dan status UTS PBO
    public void cetakData() {
        System.out.println("Nama: " + getNama());
        System.out.println("NPM: " + getNpm());
        System.out.println("Status UTS PBO: Telah Mengikuti");
    }

    // Method untuk mencetak nilai UTS dan Tugas
    public void cetakNilai() {
        // Implementasi mencetak nilai UTS dan Tugas
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa yang mengambil mata kuliah PBO
        MahasiswaPBO mahasiswaPBO = new MahasiswaPBO("Muhmmad Rifki", "51422141");

        // Memanggil method untuk mencetak data mahasiswa
        mahasiswaPBO.cetakData();

        // Memanggil method untuk mencetak nilai UTS dan Tugas
        mahasiswaPBO.cetakNilai();
    }
}

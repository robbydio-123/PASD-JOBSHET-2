public class Mahasiswamain22 {
    public static void main(String[] args) {
        Mahasiswa22 mhs1 = new Mahasiswa22();

        mhs1.nim = "254107060161";
        mhs1.nama = "Robby Dio R";
        mhs1.kelas = "1E";
        mhs1.ipk = 4.0;

        mhs1.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja(mhs1.ipk));

        mhs1.ubahKelas("2B");
        mhs1.updateIpk(3.8);

        mhs1.tampilkanInformasi();
        Mahasiswa22 mhs2 = new Mahasiswa22("254107060161", "Robby Dio R", "1E", 3.7);
        mhs2.tampilkanInformasi();
    }
}
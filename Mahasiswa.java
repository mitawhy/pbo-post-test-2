package krsentities;

public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String merek) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String tipe) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
    return "Nim: " + nim + ", Nama: " + nama;
    }
    
}

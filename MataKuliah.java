package krsentities;

public class MataKuliah {
    private String kode;
    private String nama;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama;
    } 

    
}


package krsentities;

public class KartuRencanaStudi {
    private String mahasiswa;
    private String matakuliah;
    private String dosenpembimbing;

    public KartuRencanaStudi(String mahasiswa, String matakuliah, String dosenpembimbing) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.dosenpembimbing = dosenpembimbing;
    }
    
    public String getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(String merek) {
        this.mahasiswa = mahasiswa;
    }

    public String getMataKuliah() {
        return matakuliah;
    }

    public void setMataKuliah(String tipe) {
        this.matakuliah = matakuliah;
    }
    
    public String getDosenpembimbing() {
        return dosenpembimbing;
    }

    public void setDosenpembimbing(String tipe) {
        this.dosenpembimbing = dosenpembimbing;
    }
    
    @Override
    public String toString() {
    return "Mahasiswa: " + mahasiswa + ", Mata Kuliah: " + matakuliah + "Dosen Pembimbing" + dosenpembimbing;
    }
    
}

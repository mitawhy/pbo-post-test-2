package krsentities;

public class Dosen {
    private String namadosen;
    private String nip;

    public Dosen(String namadosen, String nip) {
        this.namadosen = namadosen;
        this.nip = nip;
    }

    public String getNamaDosen() {
        return namadosen;
    }

    public void setNamaDosen(String namadosen) {
        this.namadosen = namadosen;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String tipe) {
        this.nip = nip;
    }
    
    @Override
    public String toString() {
    return "NIP: " + nip + ", Nama Dosen: " + namadosen;
    }
    
}
package krs; //nama package

import java.util.ArrayList; //untuk arraylist
import java.util.Scanner; //untuk memudahkan pengambilan input
import krsentities.MataKuliah; //import kelas MataKuliah yang akan digunakan

public class KrsApp {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); //untuk melakukan inputan
        final ArrayList<MataKuliah> matakuliahsList = new ArrayList(); //arraylist untuk penyimpanan data inputan

        int pil;
        do {
            System.out.println("Menu Admin:");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Edit Mata Kuliah");
            System.out.println("3. Hapus Mata Kuliah");
            System.out.println("4. Menampilkan Data Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1/2/3/4/5): ");
            pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Kode Mata Kuliah: "); //input kode mata kuliah
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: "); //input nama mata kuliah
                    String nama = scanner.nextLine();
                    scanner.nextLine();
                    MataKuliah newMataKuliah = new MataKuliah (kode,nama);
                    matakuliahsList.add(newMataKuliah);
                    System.out.println("Mata Kuliah berhasil ditambahkan.");
                    break; //untuk berhenti

                case 2:
                    System.out.print("Masukkan Kode Mata Kuliah yang akan diubah: ");
                    String kodeToEdit = scanner.nextLine();
                    boolean foundEdit = false;
                    for (MataKuliah matakuliah : matakuliahsList) {
                        if (matakuliah.getKode().equals(kodeToEdit)) { //jika kode yang dimasukkan ada maka lanjut masukkan nama mata kuliah baru
                            System.out.print("Masukkan Mata Kuliah baru: ");
                            String newNama = scanner.nextLine();
                            scanner.nextLine(); 
                            matakuliah.setNama(newNama); //nama mata kuliah diganti dengan yang baru
                            System.out.println("Mata Kuliah berhasil diubah!");
                            foundEdit = true;
                            break; //untuk berhenti
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("Mata Kuliah tidak ditemukan!"); //jika kode yang dimasukkan tidak ada, maka tampil ini
                    }
                    break;

                case 3:
                    System.out.print("Masukkan Kode Mata Kuliah yang akan dihapus: ");
                    String merekToDelete = scanner.nextLine();
                    boolean foundDelete = false;
                    for (MataKuliah matakuliah : matakuliahsList) {
                        if (matakuliah.getKode().equals(merekToDelete)) { //jika kode mata kuliah yang ingin dihapus ada, maka akan dihapus
                            matakuliahsList.remove(matakuliah);
                            System.out.println("Mata Kuliah berhasil dihapus!");
                            foundDelete = true;
                            break; //untuk berhenti
                        }
                    }
                    if (!foundDelete) { //jika kode tidak ditemukan
                        System.out.println("Mata Kuliah tidak ditemukan!"); //maka tampil ini
                    }
                    break;

                case 4:
                    if (matakuliahsList.isEmpty()) { //jika arraylist kosong
                        System.out.println("Mata Kuliah Kosong"); //maka tampil ini
                    } else {
                        for (MataKuliah matakuliah : matakuliahsList) { //jika ada
                            System.out.println(matakuliah); //maka arraylist akan ditampilkan
                        }
                    }
                    break; //untuk berhenti


                case 5:
                    System.out.println("Terima kasih!");
                    break; //berhenti

                default: //jika inputan tidak tersedia
                    System.out.println("Pilihan tidak tersedia. Silakan pilih lagi!"); //maka tampil ini
            }
        } while (pil != 5);
    }      
}
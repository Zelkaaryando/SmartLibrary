package com.mycompany.smartlibrary;

public class Ebook extends Koleksi {
    private int ukuranFileMB;
    
    public Ebook (String judul, String pengarang, int tahunTerbit, int ukuranFileMB) {
        super(judul, pengarang, tahunTerbit);
        this.ukuranFileMB = ukuranFileMB;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.printf("[Ebook]      Judul: %-20s | Pengarang: %-15s | Tahun: %d | Ukuran: %d MB%n",
                this.judul, this.pengarang, this.tahunTerbit, this.ukuranFileMB);
    }
    
    @Override
    public void caraPinjam() {
        System.out.println("-> Info Pinjam: Ebook dipinjam dengan cara di-download melalui aplikasi/situs web.");
    }
}


public class PengunjungCafe05 {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}


// Jawaban Pertanyaan Percobaan 4

1. 'String' digunakan karena varargs bisa menerima argumen banyak atau sedikit tanpa batas.
2. Tidak bisa, dua varargs dalam satu fungsi; hanya satu dan harus di bagian akhir parameter.
3. Program tetap berjalan, varargs menjadi array kosong, output hanya header tanpa daftar nama.

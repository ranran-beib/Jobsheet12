public class Kafe05 {

    public static void main(String[] args) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
}


// Jawaban Pertanyaan

// 1. Tidak. Fungsi tanpa parameter tidak harus bertipe `void`; bisa mengembalikan nilai (misal `int`, `String`, dll).
// 2. Bisa. Semua `System.out.println()` ditulis langsung di dalam `main` tanpa membuat fungsi `Menu()`.
// 3. Kode lebih rapi, mudah dibaca, bisa dipakai ulang, dan mudah diperbarui.
// 4. Program mulai di `main` → memanggil `Menu()` → isi fungsi dijalankan → menu tampil → kembali ke `main`.

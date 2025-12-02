public class Kafe05 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        // Cek kode promo
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("\n===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte – Rp 22,000");
        System.out.println("4. Teh Tarik – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
    
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }

}



// Jawaban Pertanyaan Percobaan 1

// 1. Tidak. Fungsi tanpa parameter tidak harus bertipe `void`; bisa mengembalikan nilai (misal `int`, `String`, dll).
// 2. Bisa. Semua `System.out.println()` ditulis langsung di dalam `main` tanpa membuat fungsi `Menu()`.
// 3. Kode lebih rapi, mudah dibaca, bisa dipakai ulang, dan mudah diperbarui.
// 4. Program mulai di `main` → memanggil `Menu()` → isi fungsi dijalankan → menu tampil → kembali ke `main`.


// Jawaban Pertanyaan Percobaan 2

// 1. Fungsi parameter → mengirim data/nilai dari luar fungsi agar fungsi bisa bekerja sesuai kebutuhan.
// 2. namaPelanggan & isMember → namaPelanggan untuk menampilkan sapaan, isMember untuk menentukan apakah dapat diskon atau tidak.
// 3. Parameter ≠ variabel → parameter menerima input dari luar fungsi, variabel menyimpan data selama program berjalan.
// 4. isMember → jika true tampil pesan diskon, jika false tidak tampil.
// 5. Jika fungsi dipanggil tanpa parameter → error, karena fungsi membutuhkan input.
// 6. Parameter kodePromo digunakan untuk mengecek kode promosi dan menentukan besar diskon.

import java.util.Scanner;

public class HitungBalok05 {

    static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    static int hitungVolume(int tinggi, int panjang, int lebar) {
        int volume = hitungLuas(panjang, lebar) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah: " + vol);

        input.close();
    }
}

// Jawaban Pertanyaan Percobaan 5

// 1. Input p, l, t → hitungLuas(p,l) → tampilkan luas → hitungVolume(t,p,l) → tampilkan volume.
// 2. Output input 4,3,5
//    Luas = 12, Volume = 60.
// 3. Output: 1234567.
//    Alur: Jumlah → TampilJumlah → TampilHinggaKei cetak 1–7.
// 4. Parameter: saat fungsi perlu data dari luar.
//    Return: saat hasil diperlukan kembali.
//    Tanpa parameter/return: hanya menampilkan/aksi.
// 5. Parameter
//    hitungLuas & hitungVolume perlu parameter karena nilai tiap input berbeda.
//    main tidak perlu parameter.
// 6. Return
//    hitungLuas & hitungVolume pakai return (dipakai lagi).
//    main tidak perlu return.

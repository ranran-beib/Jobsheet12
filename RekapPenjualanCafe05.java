import java.util.Scanner;

public class RekapPenjualanCafe05 {

    String[] menu;
    int[][] data;
    int jmlMenu, jmlHari;

    public void inputPenjualan() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        jmlMenu = sc.nextInt();
        menu = new String[jmlMenu];

        System.out.print("Masukkan jumlah hari penjualan: ");
        jmlHari = sc.nextInt();
        data = new int[jmlMenu][jmlHari];

        sc.nextLine(); 

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("\nNama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();

            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
    }

    public void tampilData() {
        System.out.println("\n===== Tabel Penjualan =====");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= jmlHari; h++) System.out.print("H" + h + "\t");
        System.out.println();

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jmlHari; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void tertinggi() {
        int max = 0;
        String menuMax = "";
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) total += data[i][j];

            if (total > max) {
                max = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nMenu penjualan tertinggi: " + menuMax + " = " + max);
    }

    public void rataMenu() {
        System.out.println("\n===== Rata-rata Penjualan =====");
        for (int i = 0; i < jmlMenu; i++) {
            int total = 0;
            for (int j = 0; j < jmlHari; j++) total += data[i][j];
            System.out.println(menu[i] + " : " + (total / (double) jmlHari));
        }
    }

    public static void main(String[] args) {
        RekapPenjualanCafe05 r = new RekapPenjualanCafe05();

        r.inputPenjualan();
        r.tampilData();
        r.tertinggi();
        r.rataMenu();
    }
}

import java.util.Scanner;

public class RekapPenjualanCafe05 {

    String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    int[][] data = new int[5][7];

    public void inputPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInput penjualan menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void tampilData() {
        System.out.println("\n===== Tabel Penjualan =====");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) System.out.print("H" + h + "\t");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void tertinggi() {
        int max = 0;
        String menuMax = "";
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += data[i][j];

            if (total > max) {
                max = total;
                menuMax = menu[i];
            }
        }
        System.out.println("\nMenu penjualan tertinggi: " + menuMax + " = " + max);
    }

    public void rataMenu() {
        System.out.println("\n===== Rata-rata Penjualan =====");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += data[i][j];
            System.out.println(menu[i] + " : " + (total / 7.0));
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

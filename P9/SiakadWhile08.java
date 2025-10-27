import java.util.Scanner;

public class SiakadWhile08 {
    public static void main(String[] args) {
        Scanner galuh08 = new Scanner(System.in);
        int nilai08, jml08, i08 = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jml08 = galuh08.nextInt();
        while (i08 < jml08) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i08 + 1) + ": ");
            nilai08 = galuh08.nextInt();

            if (nilai08 < 0 || nilai08 > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai08 > 80 && nilai08 <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah A");
            } else if (nilai08 > 73 && nilai08 <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah B+");
            } else if (nilai08 > 65 && nilai08 <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah B");
            } else if (nilai08 > 60 && nilai08 <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah C+");
            } else if (nilai08 > 50 && nilai08 <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah C");
            } else if (nilai08 > 39 && nilai08 <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i08 + 1) + " adalah E");
            }

            i08++;
        }

    }

}
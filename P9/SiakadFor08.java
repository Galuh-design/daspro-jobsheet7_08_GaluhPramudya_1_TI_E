import java.util.Scanner;
public class SiakadFor08 {
public static void main(String[] args) {
Scanner galuh08 = new Scanner(System.in);
double nilai08, tertinggi08 = 0, terendah08 = 100;

for (int i = 1; i <= 10; i++) {
System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
nilai08 = galuh08.nextDouble();
    if (nilai08 > tertinggi08) {
        tertinggi08 = nilai08;
    }
    if (nilai08 < terendah08) {
        terendah08 = nilai08;
    }
}
System.out.println("Nilai tertinggi: "+tertinggi08);
System.out.println("Nilai terendah: "+terendah08);

}
    
}
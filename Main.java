import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Nim = ");
        String nim = scanner.nextLine();

        System.out.print("Nama = ");
        String nama = scanner.nextLine();

        System.out.print("UTS = ");
        double uts = scanner.nextDouble();

        System.out.print("UAS = ");
        double uas = scanner.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, uts, uas);

        mahasiswa.displayInfo();

        scanner.close();
    }
}

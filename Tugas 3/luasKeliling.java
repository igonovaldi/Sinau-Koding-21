import java.util.Scanner;
public class luasKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while(menu){
            int panjang, lebar, jari2, sisi1, sisi2, sisi3;
            System.out.println("\nMenu : ");
            System.out.println("1. Luas & Keliling persegi panjang");
            System.out.println("2. Luas & Keliling lingkaran");
            System.out.println("3. Luas & Keliling segitiga");
            System.out.print("Pilihan anda : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Panjang (P) : ");
                    panjang = input.nextInt();
                    System.out.print("Lebar (L) : ");
                    lebar = input.nextInt();
                    System.out.print("\nKeliling persegi panjang\t: " + (2 * (panjang + lebar)));
                    System.out.println("\nLuas persegi panjang\t\t: " + panjang * lebar);
                    break;
                case 2:
                    System.out.print("Jari-jari (r) : ");
                    jari2 = input.nextInt();
                    System.out.print("\nKeliling lingkaran\t: " + (2 * 3.14 * jari2));
                    System.out.println("\nLuas lingkaran\t\t: " + (3.14 * jari2 * jari2));
                    break;
                case 3:
                    System.out.print("Panjang sisi 1 : ");
                    sisi1 = input.nextInt();
                    System.out.print("Panjang sisi 2 : ");
                    sisi2 = input.nextInt();
                    System.out.print("Panjang sisi 3 : ");
                    sisi3 = input.nextInt();
                    System.out.print("\nKeliling segitiga\t: " + (sisi1 + sisi2 + sisi3));
                    System.out.println("\nLuas segitiga\t\t: " + (sisi1 * sisi2) / 2);
                    break;
                default:
                    System.out.println("Menu tidak tersedia, apakah ingin keluar aplikasi? [Y/N] :");
                    char pilMenu = input.next().charAt(0);;
                    if ((pilMenu == 'y')||(pilMenu == 'Y')){
                        menu = false;
                    } else if ((pilMenu == 'n')||(pilMenu == 'N')) {
                        break;
                    } else{
                        System.out.println("Pilihan tidak tersedia. Keluar aplikasi.");
                    }
            }
        }
    }
}

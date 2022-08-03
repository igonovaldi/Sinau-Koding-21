import java.util.Scanner;
public class inputMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int cMhs = input.nextInt();
        String nama[] = new String[cMhs];
        int nilai[] = new int[cMhs];
        String status[] = new String[cMhs];
        for(int i=0; i<cMhs; i++){
            System.out.println("\nMahasiswa ke-"+(i+1));
            System.out.print("Nama : ");
            nama[i] = input.next();
            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();
            if(nilai[i]<=65){
                status[i] = "Tidak Lulus";
            } else{
                status[i] = "Lulus";
            }
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("======================");
        System.out.println("No\tNama\tNilai\tStatus");
        for(int i=0; i<cMhs; i++){
            System.out.println((i+1)+"\t"+nama[i]+"\t"+nilai[i]+"\t\t"+status[i]);
        }
    }
}

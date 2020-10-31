/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan29.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * program menampilkan plihan warna paforit
*/
public class IF110119040Latihan29WarnaKepribadian {  
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String BLACK = "\u001b[30m";
    public static final String WHITE = "\u001b[37m";
    private static String redBackground;
    private static String greenBackground;
    private static String yellowBackground;
    private static String blueBackground;
    private static String purpleBackground;
    
   public static void kepribadian(String warna, String nama){
        System.out.println("");
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        if(null != warna)switch (warna) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah " + RED + warna);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah " + GREEN + warna);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan.,");
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah " + YELLOW + warna);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah " + BLUE + warna);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah " + PURPLE + warna);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            case "ORANGE":
                System.out.println("Oops.. Belum teridentifikasi");
                break;
            default:
                break;
        } 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String warna,nama;
        
        System.out.println(RED+"YUK"+GREEN+" CEK"+YELLOW+" KEPRIBADIANMU"+CYAN+" DARI"+PURPLE+" WARNA"+BLUE+" FAVORITMU");
        System.out.println(redBackground ="\u001B[41m"+WHITE+"         MERAH        ");
        System.out.println(greenBackground ="\u001B[42m"+WHITE+"         HIJAU        ");
        System.out.println(yellowBackground ="\u001B[43m"+WHITE+"        KUNING        ");
        System.out.println(blueBackground ="\u001B[44m"+WHITE+"         BIRU         ");
        System.out.println(purpleBackground ="\u001B[45m"+WHITE+"         UNGU         ");
        System.out.println(BLACK+""); 
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
        kepribadian(warna.toUpperCase(), nama);
    }
    
}
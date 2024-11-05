/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YUSUP PALKORI
 */
public class HitungHari {

    // Metode untuk menghitung jumlah hari berdasarkan tahun dan bulan
    public static int hitung(int tahun, int bulan) {
        int jumlahHari;
        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jumlahHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                // Cek apakah tahun tersebut adalah tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun kabisat
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                jumlahHari = 0; // Jika bulan tidak valid
                break;
        }
        return jumlahHari;
    }

    // Metode untuk mendapatkan nama bulan berdasarkan nomor bulan
    public static String getNamaBulan(int bulan) {
        switch (bulan) {
            case 1: return "Januari";
            case 2: return "Februari";
            case 3: return "Maret";
            case 4: return "April";
            case 5: return "Mei";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "Agustus";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return "Bulan tidak valid";
        }
    }
}
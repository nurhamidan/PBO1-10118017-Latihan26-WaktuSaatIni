package pbo1.nim10118017;

import java.util.Calendar;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan waktu saat ini.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deskripsi variabel.
        Calendar calendar = Calendar.getInstance();
        StringBuilder stringBuilder = new StringBuilder();
        
        String[] hari, bulan;
        //Menampung hari.
        hari = new String[7];
        hari[0] = "Minggu";
        hari[1] = "Senin";
        hari[2] = "Selasa";
        hari[3] = "Rabu";
        hari[4] = "Kamis";
        hari[5] = "Jumat";
        hari[6] = "Sabtu";
        
        //Menampung bulan.
        bulan = new String[12];
        bulan[0] = "Januari";
        bulan[1] = "Februari";
        bulan[2] = "Maret";
        bulan[3] = "April";
        bulan[4] = "Mei";
        bulan[5] = "Juni";
        bulan[6] = "Juli";
        bulan[7] = "Agustus";
        bulan[8] = "September";
        bulan[9] = "Oktober";
        bulan[10] = "November";
        bulan[11] = "Desember";
        
        //Menampilkan waktu saat ini
        String waktuSaatIni = stringBuilder.append(hari[calendar.get(Calendar.DAY_OF_WEEK) - 1]
            ).append(", "
            ).append(calendar.get(Calendar.DAY_OF_MONTH)
            ).append(" "
            ).append(bulan[calendar.get(Calendar.MONTH)].charAt(0)
            ).append(bulan[calendar.get(Calendar.MONTH)].charAt(1)
            ).append(bulan[calendar.get(Calendar.MONTH)].charAt(2)
            ).append(" "
            ).append(calendar.get(Calendar.YEAR)
            ).append(" "
            ).append(calendar.get(Calendar.HOUR_OF_DAY)
            ).append(":"
            ).append(calendar.get(Calendar.MINUTE)
            ).append(":"
            ).append(calendar.get(Calendar.SECOND)
            ).toString();
        System.out.println("Hari ini adalah hari : " + waktuSaatIni);
        
        System.out.println(FOOTER);
    }
    
}

package day09;

public class Main {
    
    public static void main(String[] args) {
        /*fungsi dari final adalah untuk membuat nilai/value
        pada variabel yang tidak dapat diubah apabila di ubah akan eror*/
    
    //Contoh dari variable constanta (final variabel)
       final String nama = "Dzaky Surya Darma";
        System.out.println("Nama = " + nama);
        
        /*Ini contoh dari variabel konstanta yang sudah difinalkan
        namun masih ingin di update lagi dan hasilnya akan error
        
        nama = "Dzaky";
        System.out.println("Nama = " + nama);*/
       
       //Contoh beberapa penggunaan variabel final di berbagai tipe data
       final int Umur = 19;
        System.out.println("Umur = " + Umur + " tahun");
        
        final char kelas = 'A';
        System.out.println("Kelas = " + kelas);
        
        final String prodi= "Informatika";
        System.out.println("Prodi = " + prodi);
        
        final String alamat= "Pamboang";
        System.out.println("Alamat = " + alamat );
        
        final float berat_badan = (float) 67.3;
        System.out.println("Berat badan = " + berat_badan + "kg");
        
        final double tinggi = 167.25;
        System.out.println("Tinggi badan = " + tinggi + "cm");
    }
    
}

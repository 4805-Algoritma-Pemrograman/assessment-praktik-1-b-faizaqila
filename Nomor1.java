

public class Nomor1{
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        
        //Input total penjualan
        System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = scanner.nextInt();
        double komisi;

        //Menghitung komisi
        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; // 10% untuk penjualan <= Rp 500.000
        }else{
            double komisiPertama= 500000 * 0.10; // 10% untuk Rp 500.000 pertama
            double sisaPenjualan = totalPenjualan - 500000;
            double komisiSisa = sisaPenjualan * 0.15; // 15% untuk sisa penjualan
            komisi = komisiPertama + komisiSisa;
        }

        // Menampilkan hasil
        System.out.printf("Total penjualan salesman: %.0f%n", totalPenjualan);
        System.out.printf("Komisi yang didapatkan = %.1f%n", komisi);

    }
}


Algoritma
Mulai.
Input total penjualan salesman.
Jika total penjualan kurang dari atau sama dengan Rp 500.000:
Hitung komisi = total penjualan * 10%.
Jika total penjualan lebih dari Rp 500.000:
Hitung komisi untuk Rp 500.000 pertama = Rp 500.000 * 10%.
Hitung sisa penjualan = total penjualan - Rp 500.000.
Hitung komisi untuk sisa penjualan = sisa penjualan * 15%.
Total komisi = komisi untuk Rp 500.000 + komisi untuk sisa penjualan.
Tampilkan total penjualan dan komisi yang didapat.
Selesai.

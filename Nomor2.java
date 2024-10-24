

public class Nomor2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        int jumlahTransaksi = 0;
        double totalPendapatan = 0;
        String ulang = "Y"; 

        do {
            try {
                System.out.print("Masukkan kode bungalow [1/2/3]: ");
                int kode = input.nextInt();

                System.out.print("Lama menginap (malam): ");
                int lamaMenginap = input.nextInt();

                if (lamaMenginap <= 0) {
                    System.out.println("Lama menginap harus lebih dari 0 malam!");
                    continue;
                }

                double tarifPerMalam = 0;
                double persenPelayanan = 0;

                switch (kode) {
                    case 1:
                        tarifPerMalam = 50000;
                        persenPelayanan = 0.30;
                        break;
                    case 2:
                        tarifPerMalam = 40000;
                        persenPelayanan = 0.20;
                        break;
                    case 3:
                        tarifPerMalam = 30000;
                        persenPelayanan = 0.10;
                        break;
                    default:
                        System.out.println("Kode bungalow tidak valid!");
                        continue;
                }

                double biayaMenginap = lamaMenginap * tarifPerMalam;
                double biayaPelayanan = biayaMenginap * persenPelayanan;
                double totalBiaya = biayaMenginap + biayaPelayanan;

                totalPendapatan += totalBiaya;
                jumlahTransaksi++;

                System.out.print("Input lagi (Y/N)? ");
                ulang = input.next();

            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.next(); // Clear invalid input
                continue;
            }
        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + currencyFormatter.format(totalPendapatan));

        input.close();

    }
}

Algoritma
Inisialisasi variabel untuk menyimpan total transaksi dan total pendapatan.
Buat loop untuk menerima input dari pengguna.
Tanyakan kode bungalow dan lama menginap.
Hitung biaya menginap, biaya pelayanan, dan total biaya.
Tambahkan total biaya ke total pendapatan dan hitung jumlah transaksi.
Tanyakan apakah ingin menginput lagi (Y/N).
Jika input adalah 'N', keluar dari loop.
Tampilkan jumlah transaksi dan total pendapatan





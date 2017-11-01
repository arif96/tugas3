import java.util.Scanner;

class Main {
	public static void main(String [] args){
		System.out.println("Data Laporan");
		Laporan lap = new Laporan();
		lap.buat_lap();
		System.out.println("");
		lap.cetak();
		System.out.println("");
		System.out.println("Data Barang");
		Barang brg = new Barang();
		brg.tambah();
		System.out.println("");
		System.out.println("Data Transaksi");
		Transaksi trans = new Transaksi();
		trans.membuat_trans();


	}
}
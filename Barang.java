import java.util.Scanner;

class Barang {
	public String nama_brg;
	public String harga_brg;
	public int jumlah;
	public String supplier;

	public void tambah() {
		Scanner input = new Scanner(System.in);

	System.out.print("Masukan Nama Barang : ");
	nama_brg = input.nextLine();

	System.out.print("Masukan Harga Barang : ");
	harga_brg = input.nextLine();

	System.out.print("Masukan Jumlah Barang : ");
	jumlah = input.nextInt();


	}

	public void ubah() {

	}

	public void hapus() {

	}

	public void retur() {

	}
}
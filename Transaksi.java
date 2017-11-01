import java.util.Scanner;

class Transaksi {
	public String no_trans;
	public String tgl_trans;

	public void membuat_trans() {
	Scanner input = new Scanner(System.in);

	System.out.print("Masukan No Transaksi : ");
	no_trans = input.nextLine();

	System.out.print("Masukan Tanggal Transaksi : ");
	tgl_trans = input.nextLine();

	}
}
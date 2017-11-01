import java.util.Scanner;

class Laporan {
	public String no_lap;
	public String tgl_lap;
	public String jenis_lap;

	public void cetak (){
		System.out.print("No Laporan : ");
		System.out.println(no_lap);
		System.out.print("Tanggal Laporan : ");
		System.out.println(tgl_lap);
		System.out.print("Jenis Laporan : ");
		System.out.println(jenis_lap);


	}
	public void ubah_lap() {
	

	}

	public void hapus_lap() {

	}
	
	public void buat_lap() {
	Scanner input = new Scanner(System.in);

	System.out.print("Masukan No laporan : ");
	no_lap = input.nextLine();

	System.out.print("Masukan Tanggal laporan : ");
	tgl_lap = input.nextLine();

	System.out.print("Masukan Jenis Laporan : ");
	jenis_lap = input.nextLine();

	}
	public boolean apakahhabis() {
return true;
			
	}
	
	
	
}
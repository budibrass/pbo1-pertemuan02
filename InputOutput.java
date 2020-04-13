import java.util.Scanner;

public class InputOutput
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String nama, jur, almt, fak;
		int npm, nmr, sks;
		double ipk;
		System.out.print("Masukkan nama anda : ");
		nama = sc.nextLine();
		System.out.print("Masukkan NPM anda : ");
		npm = sc.nextInt();
		
		System.out.println("Hai "+nama+" "+"("+npm+")");
		
		System.out.println();
		System.out.println("Silahkan pilih program yang ingin anda jalankan : ");
		System.out.println("1. Menghitung Total Nilai");
		System.out.println("2. Menampilkan biodata");
		System.out.print("Masukkan nomor program yang ingin dijalankan : ");
		nmr=sc.nextInt();
		System.out.println();
		
		if(nmr==1)
		{
			System.out.print("Masukkan jumlah sks yang ditempuh : ");
			sks=sc.nextInt();
			System.out.print("Masukkan jumlah ipk sementara : ");
			ipk=sc.nextDouble();
			System.out.println();
			double jumlah = ipk * sks;
			System.out.println(nama+" Total nilai anda : "+jumlah);
		}
		else if(nmr==2)
		{
			System.out.println();
			System.out.print("Masukkan alamat anda : ");
			almt=sc.next();
			System.out.print("Masukkan jurusan anda : ");
			jur=sc.next();
			System.out.print("Masukkan fakultas anda : ");
			fak=sc.next();
			
			System.out.println();
			System.out.println("===BIODATA ANDA===");
			System.out.println("Nama	: "+nama);
			System.out.println("NPM	: "+npm);
			System.out.println("Alamat	: "+almt);
			System.out.println("Jurusan	: "+jur);
			System.out.println("Fakultas: "+fak);
		}
		else
		{
			System.out.print("Inputan yang anda masukkan tidak tersedia");
		}	
	}
}
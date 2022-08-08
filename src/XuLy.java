import java.util.Iterator;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Nhập vào số phần tử n = ");
       int n = Integer.parseInt(scan.nextLine());
       int b[] = nhapMang(n,scan);
       xuatMang(b);
       xuatMangForEach(b);
	}
	
	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int [n];
		System.out.println("Nhập mảng một chiều");
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		
		return a;
	}
	
	public static void xuatMang(int a[]) {
	  	System.out.println("Xuất mảng cách 1");
	   for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + "\t");		
	}
	}
	
	   
   public static void xuatMangForEach(int a[]) {
	   System.out.println("\n Xuất mảng cách 2");
	   for (int pt: a) {
	    System.out.print(pt + "\t");	
	}
	}
}

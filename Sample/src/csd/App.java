package csd;
/*----------------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Parametresi ile aldığı iki noktanın koordinat bilgilerine göre iki nokta arasındaki uzaklığı
döndüren distance isimli metodu PointUtil isimli sınıf içerisinde yazınız ve klavyeden alınan değerlerle
metodu çağırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/
public class App {
	public static void main(String[] args)
	{
        java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Birinci koordinat bilgisini giriniz:");
		double val1 = Double.parseDouble(kb.nextLine());
		
		System.out.print("İkinci koordinat bilgisini giriniz:");
		double val2 = Double.parseDouble(kb.nextLine());
		
		System.out.print("Üçüncü koordinat bilgisini giriniz:");
		double val3 = Double.parseDouble(kb.nextLine());
		
		System.out.print("Dördüncü koordinat bilgisini giriniz:");
		double val4 = Double.parseDouble(kb.nextLine());
		
		double distance=PointUtil.distance(val1, val2, val3, val4);
		System.out.println(distance);	
		
		kb.close();
	}

}

class PointUtil {
	public static double distance(double x1,double y1,double x2,double y2) {

		double xpow  = Math.pow((x1-x2),2);
		double ypow  = Math.pow((y1-y2), 2);
		double sonuc = Math.sqrt(xpow+ypow);
		
		return sonuc;
	}
}
package odev4;

public class main {

	public static void main(String[] args) {
		yeniuye a=new yeniuye(1,"umut", "gültekin", "123456789","03,01,323200");
		kayýt kay=new kayýt();
		kay.add(a);
		dogrulama d=new lastnamedogrulama();
		d.a(a);
		Oyuncu o=new Oyuncu(a);
		Satýs l=new  Satýs();
		l.arabaal(a);
		kampanyalar kam=new kampanyalar(1,"%20 indirim", "03,06,2021' e kadar");
		kampanyaduzenleme dzl=new kampanyaduzenleme();
		dzl.addkampanya(kam);
		
		
		
		
	}

}

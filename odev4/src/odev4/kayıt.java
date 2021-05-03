package odev4;

public class kayýt {
	public void add(yeniuye y) {
		System.out.println("isim: "+y.getName()+"soyisim: "+y.getLastname()+"tc: "+y.getTc()+"dogumyýlý : "+y.getDoðumyýlý());
		System.out.println("kiþi eklendi");
		
	}
	public void delete(yeniuye y) {
		System.out.println("silinecek kiþinin tc numarsaýný giriniz: "+y.getTc());
	}
	public void update(yeniuye y) {
		System.out.println("güncellenecek veriyi girinz:");
	}

}

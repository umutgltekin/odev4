package odev4;

public class kampanyalar implements kampanya {
	private int kampanyaid;
	private String kampanyaname;
	private String kampanyasuresi;
	
	public int getKampanyaid() {
		return kampanyaid;
	}
	public kampanyalar(int kampanyaid, String kampanyaname, String kampanyasuresi) {
		super();
		this.kampanyaid = kampanyaid;
		this.kampanyaname = kampanyaname;
		this.kampanyasuresi = kampanyasuresi;
	}
	public void setKampanyaid(int kampanyaid) {
		this.kampanyaid = kampanyaid;
	}
	public String getKampanyaname() {
		return kampanyaname;
	}
	public void setKampanyaname(String kampanyaname) {
		this.kampanyaname = kampanyaname;
	}
	public String getKampanyasuresi() {
		return kampanyasuresi;
	}
	public void setKampanyasuresi(String kampanyasuresi) {
		this.kampanyasuresi = kampanyasuresi;
	}

}

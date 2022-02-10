
public class OkuldakiInsanlar {
	public String isim;
	public String soyisim;
	public int yas;
	
	public OkuldakiInsanlar() {
		
	}
	/**
	 * 
	 * @param isim
	 * @param soyisim
	 * @param yas
	 * Deðiþ
	 */
	
	public OkuldakiInsanlar(String isim, String soyisim, int yas) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	


}


public class Ogrenci extends OkuldakiInsanlar{
	
	public Ogrenci[] ogrenciList = new Ogrenci[400];
	public int ogrenciSayisi = 0;
	public float notortalamasi;
	public String notortalamasiharf;
	public int numara;
	public float ort;
	public int ogrencikrediSayisi;
	public String transkript;
	public int krediHakki;

	
	public Ogrenci() {
		
	}
	/**
	 * 
	 * @param isim
	 * @param soyisim
	 * @param yas
	 * @param numara
	 * @param OgrencikrediSayisi
	 * @param KrediHakki
	 * @param ort
	 */
	public Ogrenci(String isim, String soyisim, int yas, int numara, 
			int OgrencikrediSayisi, int KrediHakki,float ort) {
		
		super(isim, soyisim, yas);
		this.numara = numara;
		this.ogrencikrediSayisi = OgrencikrediSayisi;
		this.ort = ort;
		if(5 < ort || ort < 0) {
			System.err.println(isim + " için lütfen 0-5 arasýnda bir ortalama giriniz.");
		}else 
			
		if(3 < ort && ort < 3.49) {
			this.krediHakki = KrediHakki + 3;

			
		}else if(3.5 <= ort) {
			this.krediHakki = KrediHakki + 6;

		}
		else
			this.krediHakki = KrediHakki;
		transkript = isim + " " + soyisim + " " + "\n";
		
	}
	/**
	 * 
	 * @param ogrenci
	 */
	public void addOgrenci(Ogrenci ogrenci) {
		
		if(ogrenciSayisi > 40) {
			System.err.println("Danýþman Öðretmenin 40 öðrenciden fazla öðrencisisi olamayacaðýndan dolayý öðrenci eklenememiþtir.");
		}
		else {
			ogrenciList[ogrenciSayisi] = ogrenci;
			
			ogrenciSayisi++;
		} 
	}
	/**
	 * 
	 */
	public void printAllOgrenci() {
		for(int i = 0; i<ogrenciSayisi ; i++) {
			System.out.println(ogrenciList[i].toString(ogrenciList[i]));
		}
	}
	/**
	 * 
	 * @param dersIsmi
	 * @param zorunluSecmeli
	 * @param teorikDersSaati
	 * @param uygulamaliDersSaati
	 * @param krediSayisi
	 * @param notortalamasi
	 */
	
	public void addDers(String dersIsmi, String zorunluSecmeli, 
			int teorikDersSaati, int uygulamaliDersSaati, 
			int krediSayisi , float notortalamasi) {
		
		Dersler ders = new Dersler(dersIsmi, zorunluSecmeli, teorikDersSaati, uygulamaliDersSaati, krediSayisi, notortalamasi);
		ders.dersIsmi=dersIsmi;
		ders.zorunluSecmeli=zorunluSecmeli;
		ders.teorikDersSaati=teorikDersSaati;
		ders.uygulamaliDersSaati=uygulamaliDersSaati;
		ders.krediSayisi=krediSayisi;
		
		if(ders.krediSayisi <=  this.krediHakki) {
			krediHakki -= ders.krediSayisi;
			
			transkript += dersIsmi + " " + zorunluSecmeli + " T: " + teorikDersSaati + " U: " + uygulamaliDersSaati + " K: " 
					+ krediSayisi + " N: " + getNotortalamasiharf(notortalamasi) + "\n"; 
		}
		else
			System.out.println("Kredi hakkiniz yetersizdir.");
	
	}
	
	/**
	 * 
	 * @param ort
	 */
	public void setOrt(float ort) {
		this.ort = ort;
	}
	/**
	 * 
	 * @return
	 */
	public float getNotortalamasi() {
		return notortalamasi;
	}
    /**
     * 
     * @param notortalamasi
     */
	public void setNotortalamasi(float notortalamasi) {
		this.notortalamasi = notortalamasi;
	}
	/**
	 * 
	 * @param notortalamasi
	 * @return
	 */
	public String getNotortalamasiharf(float notortalamasi) {
		
		if(90<notortalamasi && notortalamasi<=100) {
			return  "AA";
		}
		else if(85<notortalamasi && notortalamasi<89) {
			return  "BA";
		}
		else if(75<notortalamasi && notortalamasi<84) {
			return  "BB";
		}
		else if(65<notortalamasi && notortalamasi<74) {
			return  "CB";
		}
		else if(55<notortalamasi && notortalamasi<64) {
			return  "CC";
		}
		else if(45<notortalamasi && notortalamasi<54) {
			return  "DC";
		}
		else if(40<notortalamasi && notortalamasi<44) {
			return  "DD";
		}
		else if(0<notortalamasi && notortalamasi<39) {
			return  "FF";
		}
		else {
			return "Lütfen geçerli bir ortalama giriniz.";
		}
	}
	/**
	 * 
	 * @param notortalamasiharf
	 */
	public void setNotortalamasiharf(String notortalamasiharf) {
		this.notortalamasiharf = notortalamasiharf;
		
		
		
	}
	/**
	 * 
	 * @return
	 */
	public int getOgrenciSayisi() {
		return ogrenciSayisi;
	}

	/**
	 * 
	 * @param ogrenciSayisi
	 */
	public void setOgrenciSayisi(int ogrenciSayisi) {
		this.ogrenciSayisi = ogrenciSayisi;
	}
	





	/**
	 * 
	 * @param notortalamasi
	 */
	public void setNotortalamasi(char notortalamasi) {
		this.notortalamasi = notortalamasi;
	}


	/**
	 * 
	 */
	public String getIsim() {
		return isim;
	}


	/**
	 * 
	 */
	public void setIsim(String isim) {
		this.isim = isim;
	}


	/**
	 * 
	 */
	public String getSoyisim() {
		return soyisim;
	}


	/**
	 * 
	 */
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}


	/**
	 * 
	 */
	public int getYas() {
		return yas;
	}


	/**
	 * 
	 */
	public void setYas(int yas) {
		this.yas = yas;
	}


	/**
	 * 
	 * @return
	 */
	public int getNumara() {
		return numara;
	}


	/**
	 * 
	 * @param numara
	 */
	public void setNumara(int numara) {
		this.numara = numara;
	}


	/**
	 * 
	 * @return
	 */
	public float getOrt() {
		return ort;
	}



	


	/**
	 * 
	 * @return ogrencikrediSayisi
	 */
	public int getOgrencikrediSayisi() {
		return ogrencikrediSayisi;
	}


	/**
	 * 
	 * @param ogrencikrediSayisi
	 * parametre deðiþkene atandý.
	 */
	public void setOgrencikrediSayisi(int ogrencikrediSayisi) {
		this.ogrencikrediSayisi = ogrencikrediSayisi;
	}

	/**
	 * 
	 * @return transkript
	 */

	public String getTranskript() {
		return transkript;
	}


	/**
	 * parametre deðiþkene atandý.
	 * @param transkript
	 */
	public void setTranskript(String transkript) {
		this.transkript = transkript;
	}


	/**
	 * 
	 * @return krediHakki
	 */
	public int getKrediHakki() {
		return krediHakki;
	}


	/**
	 * parametre deðiþkene atandý.
	 * @param krediHakki
	 */
	public void setKrediHakki(int krediHakki) {
		this.krediHakki = krediHakki;
	}
	/**
	 * 
	 * @param ogrenci
	 * @return "Ýsim: " + danisman.getIsim() + " " + danisman.getSoyisim() +"\nYaþ: " + danisman.getYas()  + "\n\n"
	 */
	public String toString(Ogrenci ogrenci) {
		return "Ýsim: " + ogrenci.getIsim() + " " + ogrenci.getSoyisim() +"\nYaþ: " + ogrenci.getYas()  + "\n\n";
		
	}
	
}
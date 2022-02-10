import javax.swing.JOptionPane;

public class Danisman extends OkuldakiInsanlar{
	public Danisman[] danismanList = new Danisman[10]; 
	public Ogrenci[] danisman = new Ogrenci[40];

	public int DanismanSayisi= 0;
	public int danismaninOgrenciSayisi = 0;
	
	
	public Danisman() {
		
	}
	/**
	 * 
	 * @param isim
	 * @param soyisim
	 * @param yas
	 */
	
	public Danisman(String isim, String soyisim, int yas){
		super(isim,soyisim,yas);
		
	}
	/**
	 * 
	 * @param ogrenci
	 */
	public void Ogr_bilgi(Ogrenci ogrenci) {
		
		
		JOptionPane.showMessageDialog(null,"\nÝsim=" +ogrenci.getIsim() + "\nSoyisim= " + ogrenci.soyisim +"\nYaþ= "   +  
		ogrenci.getYas() + "\nNumara= " + ogrenci.numara + "\nKredi Sayýsý= " + ogrenci.getOgrencikrediSayisi() +
			"\nKredi Hakký= " + ogrenci.getKrediHakki()+"\n");
	}
	
	/**
	 * 
	 * @param danisman
	 */
	
	public void addDanisman(Danisman danisman) {
			
			if(DanismanSayisi > 10) {
				System.err.println("En fazla 10 adet Danýþman eklenebilir.");
			}
			else {
				danismanList[DanismanSayisi] = danisman;
				DanismanSayisi++;
			}
	}
	/**
	 * 
	 * @param ogrenci
	 */
	public void addOgrenci(Ogrenci ogrenci) {
		if(danismaninOgrenciSayisi > 40) {
			System.err.println("En fazla 40 adet öðrenci eklenebilir.");
		}
		else {
			danisman[danismaninOgrenciSayisi] = ogrenci;
			danismaninOgrenciSayisi++;
		}

		
		
	}
	
	
	public void printAllOgrenci() {

		for(int i = 0; i<danismaninOgrenciSayisi ; i++) {
			
			System.out.println(danisman[i].toString(danisman[i]));
		}
		
	}

	public void printAllDanisman() {
			for(int i = 0; i<DanismanSayisi ; i++) {
				System.out.println(danismanList[i].toString(danismanList[i]));
			}
		}
	

	public int getDanismanSayisi() {
		return DanismanSayisi;
	}
	/**
	 * 
	 * @param danismanSayisi
	 */
	public void setDanismanSayisi(int danismanSayisi) {
		DanismanSayisi = danismanSayisi;
	}
	
	/**
	 * 
	 * @param ogrenci
	 * @param isim
	 */
	public void Ogr_isimdegis(Ogrenci ogrenci,String isim) {
		
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setIsim(isim);

			}
		}		
	}
	/**
	 * 
	 * @param ogrenci
	 * @param soyisim
	 */
	public void Ogr_soyisimdegis(Ogrenci ogrenci,String soyisim) {
		
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setSoyisim(soyisim);

			}
		}	
		
	}
	/**
	 * 
	 * @param ogrenci
	 * @param yas
	 */
	public void Ogr_yasdegis(Ogrenci ogrenci,int yas) {
	
		
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setYas(yas);
			}
		}		
	}
	/**
	 * 
	 * @param ogrenci
	 * @param numara
	 */
	public void Ogr_numaradegis(Ogrenci ogrenci,int numara) {
	
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setNumara(numara);
			}
		}		
	}
	/**
	 * 
	 * @param ogrenci
	 * @param ogrencikrediSayisi
	 * 
 	*/
	public void Ogr_kredisayisidegis(Ogrenci ogrenci,int ogrencikrediSayisi) {
	
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setOgrencikrediSayisi(ogrencikrediSayisi);
			}
		}		
	}
	/**
	 * 
	 * @param ogrenci
	 * @param krediHakki
	 */
	 public void Ogr_Kredihakkinidegis(Ogrenci ogrenci,int krediHakki) {
	
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				ogrenci.setKrediHakki(krediHakki);

			}
		}		
	}
	/**
	 * 
	 * @param ogrenci
	 */
	public void Ogr_transkript(Ogrenci ogrenci) {
		for(int i = 0 ; i<danismaninOgrenciSayisi;i++) {
			if(danisman[i] == ogrenci) {
				JOptionPane.showMessageDialog(null, ogrenci.getTranskript());

			}
		}		
	}
	/**
	 * 
	 * @param danisman
	 * @return "Ýsim: " + danisman.getIsim() + " " + danisman.getSoyisim() +"\nYaþ: " + danisman.getYas()  + "\n\n"
	 */
	public String toString(Danisman danisman) {
		return "Ýsim: " + danisman.getIsim() + " " + danisman.getSoyisim() +"\nYaþ: " + danisman.getYas()  + "\n\n";
		
	}


}

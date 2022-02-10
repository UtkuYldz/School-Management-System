

public class Demo {

	public static void main(String[] args) {
	 
		Danisman danisman = new Danisman();
		Ogrenci ogrenci = new Ogrenci();
		
		
		Danisman nihal = new Danisman("Nihal","Altunta�",20);
		Danisman serkan = new Danisman("Serkan","G�nen",36);
		Ogrenci utku = new Ogrenci("Utku","Y�ld�z",20,200403713,3,3,5);
		Ogrenci ugur = new Ogrenci("U�ur","Kaya",60,200403709,3,5,1);
		Ogrenci emirhan = new Ogrenci("Emirhan","Topal",18,200403629,5,10,3.4f);
		
		danisman.addDanisman(nihal);
		danisman.addDanisman(serkan);
		
		ogrenci.addOgrenci(utku);
		utku.addDers("Nesne Y�nelimli Programlama", "Zorunlu", 3, 2, 4, 100);
		utku.addDers("Kariyer Planlama", "Se�meli", 3, 2, 3, 100);
		utku.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 3, 100);

		ogrenci.addOgrenci(ugur);
		ugur.addDers("Nesne Y�nelimli Programlama", "Zorunlu", 3, 2, 4,20);
		ugur.addDers("Kariyer Planlama", "Se�meli", 3, 2, 4, 30);
		ugur.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 4, 40);
		
		ogrenci.addOgrenci(emirhan);
		emirhan.addDers("Nesne Y�nelimli Programlama", "Zorunlu", 3, 2, 4, 60);
		emirhan.addDers("Kariyer Planlama", "Se�meli", 3, 2, 4, 70);
		emirhan.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 4, 80);

		
		serkan.addOgrenci(utku);
		serkan.addOgrenci(ugur);
		nihal.addOgrenci(emirhan);
		
		
	//	serkan.Ogr_bilgi(emirhan);
	//	nihal.Ogr_bilgi(emirhan);
		
		serkan.Ogr_isimdegis(emirhan, "Emirhan2");
		serkan.Ogr_bilgi(emirhan);  	// Dan��man ��rencinin bilgilerine eri�ebilir ancak de�i�tiremez.
		nihal.Ogr_isimdegis(emirhan, "Emirhan3");
		nihal.Ogr_bilgi(emirhan);
		
		serkan.Ogr_transkript(emirhan); // ��rencinin Dan��man� olmayan bir ��retmen ��rencinin transkriptine eri�emez.
		nihal.Ogr_transkript(emirhan);
		
		serkan.Ogr_transkript(utku);
		serkan.Ogr_transkript(ugur);
		
		System.out.println("\nMevcut Dan��manlar :");
		danisman.printAllDanisman();
		
		System.out.println("\nSerkan hocan�n ��rencileri: \n");
		serkan.printAllOgrenci();
		System.out.println("Nihal hocam�z�n ��rencileri: \n");
		nihal.printAllOgrenci();
		
		System.out.println("-----------------\nMevcut ��renciler: ");
		ogrenci.printAllOgrenci();
		
		
		
		

		
	}

}



public class Demo {

	public static void main(String[] args) {
	 
		Danisman danisman = new Danisman();
		Ogrenci ogrenci = new Ogrenci();
		
		
		Danisman nihal = new Danisman("Nihal","Altuntaş",20);
		Danisman serkan = new Danisman("Serkan","Gönen",36);
		Ogrenci utku = new Ogrenci("Utku","Yıldız",20,123,3,3,5);
		Ogrenci ugur = new Ogrenci("Uğur","Kaya",60,1234,3,5,1);
		Ogrenci emirhan = new Ogrenci("Emirhan","Topal",18,12345,5,10,3.4f);
		
		danisman.addDanisman(nihal);
		danisman.addDanisman(serkan);
		
		ogrenci.addOgrenci(utku);
		utku.addDers("Nesne Yönelimli Programlama", "Zorunlu", 3, 2, 4, 100);
		utku.addDers("Kariyer Planlama", "Seçmeli", 3, 2, 3, 100);
		utku.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 3, 100);

		ogrenci.addOgrenci(ugur);
		ugur.addDers("Nesne Yönelimli Programlama", "Zorunlu", 3, 2, 4,20);
		ugur.addDers("Kariyer Planlama", "Seçmeli", 3, 2, 4, 30);
		ugur.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 4, 40);
		
		ogrenci.addOgrenci(emirhan);
		emirhan.addDers("Nesne Yönelimli Programlama", "Zorunlu", 3, 2, 4, 60);
		emirhan.addDers("Kariyer Planlama", "Seçmeli", 3, 2, 4, 70);
		emirhan.addDers("Diferansiyel Denklemler", "Zorunlu", 3, 2, 4, 80);

		
		serkan.addOgrenci(utku);
		serkan.addOgrenci(ugur);
		nihal.addOgrenci(emirhan);
		
		
	//	serkan.Ogr_bilgi(emirhan);
	//	nihal.Ogr_bilgi(emirhan);
		
		serkan.Ogr_isimdegis(emirhan, "Emirhan2");
		serkan.Ogr_bilgi(emirhan);  	// Danışman öğrencinin bilgilerine erişebilir ancak değiştiremez.
		nihal.Ogr_isimdegis(emirhan, "Emirhan3");
		nihal.Ogr_bilgi(emirhan);
		
		serkan.Ogr_transkript(emirhan); // Öğrencinin Danışmanı olmayan bir öğretmen öğrencinin transkriptine erişemez.
		nihal.Ogr_transkript(emirhan);
		
		serkan.Ogr_transkript(utku);
		serkan.Ogr_transkript(ugur);
		
		System.out.println("\nMevcut Danışmanlar :");
		danisman.printAllDanisman();
		
		System.out.println("\nSerkan hocanın öğrencileri: \n");
		serkan.printAllOgrenci();
		System.out.println("Nihal hocanın öğrencileri: \n");
		nihal.printAllOgrenci();
		
		System.out.println("-----------------\nMevcut Öğrenciler: ");
		ogrenci.printAllOgrenci();
		
		
		
		

		
	}

}



public class Demo {

	public static void main(String[] args) {
	 
		Danisman danisman = new Danisman();
		Ogrenci ogrenci = new Ogrenci();
		
		
		Danisman nihal = new Danisman("Nihal","Altuntaþ",20);
		Danisman serkan = new Danisman("Serkan","Gönen",36);
		Ogrenci utku = new Ogrenci("Utku","Yýldýz",20,200403713,3,3,5);
		Ogrenci ugur = new Ogrenci("Uður","Kaya",60,200403709,3,5,1);
		Ogrenci emirhan = new Ogrenci("Emirhan","Topal",18,200403629,5,10,3.4f);
		
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
		serkan.Ogr_bilgi(emirhan);  	// Danýþman öðrencinin bilgilerine eriþebilir ancak deðiþtiremez.
		nihal.Ogr_isimdegis(emirhan, "Emirhan3");
		nihal.Ogr_bilgi(emirhan);
		
		serkan.Ogr_transkript(emirhan); // Öðrencinin Danýþmaný olmayan bir öðretmen öðrencinin transkriptine eriþemez.
		nihal.Ogr_transkript(emirhan);
		
		serkan.Ogr_transkript(utku);
		serkan.Ogr_transkript(ugur);
		
		System.out.println("\nMevcut Danýþmanlar :");
		danisman.printAllDanisman();
		
		System.out.println("\nSerkan hocanýn öðrencileri: \n");
		serkan.printAllOgrenci();
		System.out.println("Nihal hocamýzýn öðrencileri: \n");
		nihal.printAllOgrenci();
		
		System.out.println("-----------------\nMevcut Öðrenciler: ");
		ogrenci.printAllOgrenci();
		
		
		
		

		
	}

}

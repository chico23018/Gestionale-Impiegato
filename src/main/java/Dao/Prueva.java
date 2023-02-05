package Dao;

import model.Impiegato;

public class Prueva {

	public static void main(String[] args) {
		
		ImpegatoDao impdao = new ImpegatoDao();
		
//		Impiegato imp = new Impiegato();
//		imp.setNome("Francisco");
//		imp.setCognome("acosta");
//		imp.setCodiceFiscale("cstfnc91b18z506d");
//		impdao.InserireImpiegato(imp);

//		Impiegato imp1 = new Impiegato();
//		imp1.setNome("Karen");
//		imp1.setCognome("Martinez");
//		imp1.setCodiceFiscale("cstknv88");
//		
//		impdao.InserireImpiegato(imp1);
//		
//		Impiegato imp2 = new Impiegato();
//		imp2.setNome("Carlo");
//		imp2.setCognome("acosta");
//		imp2.setCodiceFiscale("cstcls89");
//		
//		impdao.InserireImpiegato(imp2);
//		
		//Impiegato imp3 = new Impiegato();
		//imp3.setMatricola(8);
		//imp3.setNome("Emilia");
		//imp3.setCognome("Acosta");
		//imp3.setCodiceFiscale("cstml85");
		impdao.FindImpiegato("mzrml85");
//		impdao.FindImpiegato("mzrml85");
//		impdao.deleteImpiegato("mzrml85");
		
	}

}

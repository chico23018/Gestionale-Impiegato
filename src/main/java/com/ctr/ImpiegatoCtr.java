package com.ctr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Impiegato;

@Controller
@RequestMapping("impiegato")
public class ImpiegatoCtr {
	
	@GetMapping
	public String findAll(Model m){
		System.out.println("dentro findAll");
		List<Impiegato> res = new ArrayList<Impiegato>();
		Impiegato e = new Impiegato();
		e.setCognome("Pagano");
		e.setNome("Antonio");
		e.setMatricola(1);
		res.add(e);
	
		Impiegato e1 = new Impiegato();
		e1.setCognome("Rossi");
		e1.setNome("Antonio");
		e1.setMatricola(2);
		res.add(e1);
		
		m.addAttribute("elencoImpiegati", res);
		//views/risultatoRicercaImpiegato.jsp
		return "risultatoRicercaImpiegato";
		
	}

}

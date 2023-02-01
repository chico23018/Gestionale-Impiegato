package model;

import java.util.List;



public interface MetodiImpiegato {

	void FindImpiegato(String codicefiscale);

	void InserireImpiegato(Impiegato s);

	void deleteImpiegato(String codicifiscale);

	void udpateImpiegato(Impiegato s);
	
}

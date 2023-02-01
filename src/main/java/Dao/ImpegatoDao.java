package Dao;

import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Conezione;
import model.Impiegato;
import model.MetodiImpiegato;

public class ImpegatoDao implements MetodiImpiegato {

	@Override
	public void FindImpiegato(String codicefiscale) {
		// qui devi cercare l'impiegato tramite codice fiscale
		try {
			Connection cn = Conezione.conetar();
			PreparedStatement ps = cn
					.prepareStatement("select * from impiegato where codicefiscale='" + codicefiscale + "'");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println(" il matricola del impiegato è: " + rs.getString(1));
				System.out.println(" il nome del impiegato è: " + rs.getString(2));
				System.out.println(" il cognome del impiegato è: " + rs.getString(3));
			} else {
				System.out.println("Impiegato non esistente o codice fiscale errato");
			}

		} catch (SQLException e) {
			System.err.println("Erro in recuperare informazione nella DB " + e);
		}

	}

	@Override
	public void InserireImpiegato(Impiegato s) {
		// inserie nuovo impiegato

		try {
			Connection cn = Conezione.conetar();
			PreparedStatement ps = cn.prepareStatement("insert into impiegato(nome,cognome,codicefiscale) values(?,?,?)");
			ps.setString(1, s.getNome());
			ps.setString(2, s.getCognome());
			ps.setString(3, s.getCodiceFiscale());
			ps.executeUpdate();
			System.out.println("Nuovo impiegato inserito esitosamente");

		} catch (SQLException e) {
			System.err.println("Erro in ingresar dati alla DB " + e);
		}

	}

	@Override
	public void deleteImpiegato(String codicifiscale) {
		// eliminare un impiegato tramite codice fiscale
		try {
			Connection cn = Conezione.conetar();
			PreparedStatement ps = cn.prepareStatement("delete from impiegato where codicefiscale ='" + codicifiscale + "'");
			ps.executeUpdate();

			System.out.println("Impiegato eliminato ");

		} catch (SQLException e) {
			System.err.println(" Erro en eliminar impiegato "+ e);
		}

	}

	@Override
	public void udpateImpiegato(Impiegato s) {
		// aggiornare un impiegato
		int matricola = s.getMatricola();
		try {
			Connection cn = Conezione.conetar();
			PreparedStatement ps = cn.prepareStatement("update impiegato set nome=?, cognome=?, codicefiscale=? where matricola='"+matricola+"'");
			ps.setString(1, s.getNome());
			ps.setString(2, s.getCognome());
			ps.setString(3, s.getCodiceFiscale());
			ps.executeUpdate();
			System.out.println("Impiegato aggiornato");

		} catch (SQLException e) {
			System.err.println("Erro in ingresar dati alla DB " + e);
		}

	}

}

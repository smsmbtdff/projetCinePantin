package fr.cinepantin.DAO;



import java.util.List;

import fr.cinepantin.metier.Client;

public interface ClientDAO {
	
	List<Client> findByEmail (String Email);
	List<Client> findByName(String nom);
	void create (Client c) throws DAOExceptions;
	void update (Client c) throws DAOExceptions;
	void delete (Client c) throws DAOExceptions;
	
}

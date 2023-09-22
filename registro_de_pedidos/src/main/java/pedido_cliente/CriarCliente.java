package pedido_cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarCliente {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("regitro_de_pedidos");
		EntityManager em = emf.createEntityManager();

		DAO dao = new DAO(em);
		
		Cliente cliente = dao.createCliente("" , "");

		dao.closeEntityManager();

	}
}

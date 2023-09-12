package pedido_cliente;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("regitro_de_pedidos");
		EntityManager em = emf.createEntityManager();

		DAO dao = new DAO(em);
		
		Cliente cliente = dao.createCliente("" , "");

	}
}

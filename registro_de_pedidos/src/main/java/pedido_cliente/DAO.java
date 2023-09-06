package pedido_cliente;

public class DAO {

private EntityManager em;
	
	public DAO (EntityManager em) {
		this.em = em;
		
	}
	
	public void createCliente(String nome, String email) {
		Cliente cliente = new Cliente();
	}
	
	public void createProduto(Cliente cliente, Date data, String descricao, double valor ) {
		Produto produto = new Produto();
				
	}


}

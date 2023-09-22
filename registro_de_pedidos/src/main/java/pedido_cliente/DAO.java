package pedido_cliente;

public class DAO {

private EntityManager em;
	
	public DAO (EntityManager em) {
		this.em = em;
		
	}
	
	public Cliente createCliente(String nome, String email) {
		Cliente cliente = new Cliente();

		cliente.setNome(entrada.next());
		cliente.setEmail(email);
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		return cliente;

	}
	
	// verificar se é criação de produto ou adição de produto em cliente. (addProduto)
	public Produto createProduto(Cliente cliente, String descricao, double valor) {
		Produto produto = new Produto();

		produto.setDescricao(entrada.next());
		produto.setValor(entrada.nextDouble());
		produto.getDate();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();

		return produto;

	}

    public Cliente findCliente(int id) {
		return em.find(Cliente.class, id);

	}
	
	public void closeEntityManager () {
		this.em.close();
	}

}

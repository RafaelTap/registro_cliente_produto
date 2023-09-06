package pedido_cliente;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente", schema = "cliente_produto")
public class Cliente implements Serializable {

	private static final long SerialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "IDcliente")
	int IDcliente;
	
	@Column (name = "nome", length = 45)
	String nome;
	
	@Column (name = "email", length = 45)
	String email;

	@OneToMany
	// *** verificar, cascade, fetch, mappedby ... ***
	Set<Produto> produtos = new HashSet<>();

	public int getIDcliente() {
		return IDcliente;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setIDcliente(int iDcliente) {
		IDcliente = iDcliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

}

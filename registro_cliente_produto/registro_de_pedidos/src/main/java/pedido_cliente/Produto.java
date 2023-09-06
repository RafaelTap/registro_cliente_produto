package pedido_cliente;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="produto", schema= "cliente_produto")
public class Produto implements Serializable {

	private static final long SerialVersionUID= 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "IDproduto")
	int IDproduto;
	
	@ManyToOne
	@Column (name = "cliente", length = 45)
	Cliente cliente;
	
	@Column
	// *** verificar anotação de data ***
	Date date;
	
	@Column (name = "descricao", length = 45)
	String descricao;
	
	@Column (name = "valor")
	double valor;
	
	public int getIDproduto() {
		return IDproduto;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setIDproduto(int iDproduto) {
		IDproduto = iDproduto;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}

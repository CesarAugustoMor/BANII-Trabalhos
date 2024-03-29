/**
 * 
 */
package entidades;

/**
 * @author Lucas
 *
 */
public class Cidade {

	private Integer cod;
	private String nome;
	private String estado;
	private Long populacao;

	/**
	 * @return the cod
	 */
	public Integer getCodcid() {
		return cod;
	}

	/**
	 * @param cod the cod to set
	 */
	public void setCodcid(Integer cod) {
		this.cod = cod;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the populacao
	 */
	public Long getPopulacao() {
		return populacao;
	}

	/**
	 * @param populacao the populacao to set
	 */
	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}
	/**
	 * @return {@link StringBuilder} com a string j� formatada para cadastrar uma cidade.
	 */
	public StringBuilder cidadeParaCadastro() {
		StringBuilder result = new StringBuilder();
		result.append("SELECT inserir_cidade(");
		if (!isNull(nome)) {
			result.append('\'')
				.append(nome)
				.append('\'')
				.append(',');
			if (!isNull(estado)) {
				result.append('\'')
					.append(estado)
					.append('\'')
					.append(',');
				if (!isNull(populacao)) {
					result.append(populacao)
						.append(");");
					return result;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}
		return null;
	}
	/**
	 * @return true se o objeto em quest�o � null
	 */
	private boolean isNull(Object valor) {
		return valor==null;
	}
}
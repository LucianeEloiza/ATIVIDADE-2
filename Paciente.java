package QUESTÃO1;

public class Paciente {
   //Atributos://

	private int codigo;
	private String nome;
	private String datanascimento;
	private String sexo;
	private String planoSaude;
	private String alergia;
	private String tiposanguineo;
	
	

 public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDatanascimento() {
		return datanascimento;
	}



	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getPlanoSaude() {
		return planoSaude;
	}



	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}



	public String getAlergia() {
		return alergia;
	}



	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}



	public String getTiposanguineo() {
		return tiposanguineo;
	}



	public void setTiposanguineo(String tiposanguineo) {
		this.tiposanguineo = tiposanguineo;
	}



public Paciente (int codigo, String nome, String datanascimento, String sexo, String planoSaude, String alergia,String tiposanguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.datanascimento = datanascimento;
		this.sexo = sexo;
		this.planoSaude = planoSaude;
		this.alergia = alergia;
		this.tiposanguineo = tiposanguineo;
	}
}

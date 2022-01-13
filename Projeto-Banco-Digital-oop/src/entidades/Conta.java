package entidades;

public abstract class Conta {

	private static final Integer AGENCIA_PADRAO = 1001;//Gera sempre a mesma ag�ncia.
	private static Integer SEQUENCIAL = 1;//Sempre que uma nova conta for criada, a sequ�ncia recebe +1.
	
	//Atributos da classe Conta.
	private Integer agencia;
	private Integer numero;
	protected Integer cpf;//Atributo cpf em Integer apenas para suposi��o.
	protected String nome;
	protected Double saldo;
	
	//Construtor padr�o, caso precise usar algum get ou set.
	public Conta() {
	}
	
	//Construtor com argumentos, for�ar o usu�rio.
	public Conta(Integer cpf, String nome, Double saldo) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getcpf() {
		return cpf;
	}

	public void setcpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	//M�todo vazio de saque.
	public void saque(double montante) {
		saldo -= montante;
	}

	//M�todo vazio de dep�sito.
	public void deposito(double montante) {
		saldo += montante;
	}
	
	@Override
	public String toString() {
		return "Ag�ncia: " 
				+ agencia 
				+ "\nN�mero da conta: " 
				+ numero 
				+ "\nCPF: " 
				+ cpf 
				+ "\nNome: " 
				+ nome 
				+ "\nSaldo: "
				+ saldo;
	}
	
}

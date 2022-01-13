package entidades;

public abstract class Conta {

	private static final Integer AGENCIA_PADRAO = 1001;//Gera sempre a mesma agência.
	private static Integer SEQUENCIAL = 1;//Sempre que uma nova conta for criada, a sequência recebe +1.
	
	//Atributos da classe Conta.
	private Integer agencia;
	private Integer numero;
	protected Integer cpf;//Atributo cpf em Integer apenas para suposição.
	protected String nome;
	protected Double saldo;
	
	//Construtor padrão, caso precise usar algum get ou set.
	public Conta() {
	}
	
	//Construtor com argumentos, forçar o usuário.
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
	
	//Método vazio de saque.
	public void saque(double montante) {
		saldo -= montante;
	}

	//Método vazio de depósito.
	public void deposito(double montante) {
		saldo += montante;
	}
	
	@Override
	public String toString() {
		return "Agência: " 
				+ agencia 
				+ "\nNúmero da conta: " 
				+ numero 
				+ "\nCPF: " 
				+ cpf 
				+ "\nNome: " 
				+ nome 
				+ "\nSaldo: "
				+ saldo;
	}
	
}

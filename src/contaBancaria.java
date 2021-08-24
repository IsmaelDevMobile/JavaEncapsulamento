
public class contaBancaria {
	
	/* numeDaConta */
	/* ------------------------------------------------------ */
	public String getNumeDaConta() {
		return numeDaConta = "93253647-1";
	}

	public void setNumeDaConta(String numeDaConta) {
		this.numeDaConta = numeDaConta;
	}

	/* agencia */
	/* ------------------------------------------------------ */
	public int getAgencia() {
		return agencia = 3426;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/* saldoAtual */
	/* ------------------------------------------------------ */
	public double getSaldoAtual() {
		return saldoAtual = 5.572;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	/* banco */
	/* ------------------------------------------------------ */
	public String getBanco() {
		return banco = "Brasil";
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	/* tipoDaConta */
	/* ------------------------------------------------------ */
	public int getTipoDaConta() {
		return tipoDaConta = 433;
	}

	public void setTipoDaConta(int tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}

	/* limiteDisponivel */
	/* ------------------------------------------------------ */
	public int getLimiteDisponivel() {
		return limiteDisponivel = 500;
	}

	public void setLimiteDisponivel(int limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}

	public String numeDaConta;
	public int agencia;
	public double saldoAtual;
	public String banco;
	public int tipoDaConta;
	public int limiteDisponivel;
	
	public void mostraBanco() {
		    System.out.println("----------------- Meu Banco do Brasil ---------------------");
	        System.out.println("O Número da Conta é: " + getNumeDaConta());
	        System.out.println("A Agencia é: " + getAgencia());
	        System.out.println("O Saldo Atual é: " + getSaldoAtual());
	        System.out.println("O Nome do Banco é: " + getBanco());
	        System.out.println("O Tipo do Banco é: " + getTipoDaConta());
	        System.out.println("O Limite Disponivel é: " + getLimiteDisponivel());
		}

	public static void main(String[] args) throws Exception {
		contaBancaria BancoDoBrasil = new contaBancaria();
		BancoDoBrasil.mostraBanco();
		
		contaBancaria inter = new contaBancaria();
		
		    inter.numeDaConta = "12345678-9";
	        inter.agencia = 1234;
	        inter.saldoAtual = 1.232;
	        inter.banco = "Inter";
	        inter.tipoDaConta = 113;
	        inter.limiteDisponivel = 200;
	        
	        System.out.println("----------------- Meu Banco Inter ---------------------");
	        System.out.println("O Número da Conta é: " + inter.numeDaConta);
	        System.out.println("A Agencia é: " + inter.agencia);
	        System.out.println("O Saldo Atual é: " + inter.saldoAtual);
	        System.out.println("O Nome do Banco é: " + inter.banco);
	        System.out.println("O Tipo do Banco é: " + inter.tipoDaConta);
	        System.out.println("O Limite Disponivel é: " + inter.limiteDisponivel);
	}
}

public class veiculos {
	
	/* placa */
	/* ------------------------------------------------------ */
	public String getPlaca() {
		return placa = "BRB4EP9";	
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	/* cor */
	/* ------------------------------------------------------ */
	public String getCor() {
		return cor = "Azul";
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	/* nPasageiros */ 
	/* ------------------------------------------------------ */
	public int getnPasageiros() {
		return nPasageiros = 4;
	}
	public void setnPasageiros(int nPasageiros) {
		this.nPasageiros = nPasageiros;
	}

	/* capacidadeTamque */ 
	/* ------------------------------------------------------ */
	public String getCapacidadeTamque() {
		return capacidadeTamque = "5 Litros";
	}
	public void setCapacidadeTamque(String capacidadeTamque) {
		this.capacidadeTamque = capacidadeTamque;
	}

	/* velocidadeMaxima */ 
	/* ------------------------------------------------------ */
	public String getVelocidadeMaxima() {
		return velocidadeMaxima = "130 Km/h";
	}
	public void setVelocidadeMaxima(String velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	/* valocidadeAtual */ 
	/* ------------------------------------------------------ */
	public String getValocidadeAtual() {
		return valocidadeAtual = "60 Km/h";
	}
	public void setValocidadeAtual(String valocidadeAtual) {
		this.valocidadeAtual = valocidadeAtual;
	}

	/* cosumoMedio */
	/* ------------------------------------------------------ */
	public String getCosumoMedio() {
		return cosumoMedio = "1 Litro";
	}
	public void setCosumoMedio(String cosumoMedio) {
		this.cosumoMedio = cosumoMedio;
	}
	
	public String placa;
	public String cor;
	public int nPasageiros;
	public String capacidadeTamque;
	public String velocidadeMaxima;
	public String valocidadeAtual;
	public String cosumoMedio;

	public void mostraFusca() {
	 System.out.println("----------------- Meu fusca: --------------------");	
	 System.out.println("A placa do fusca �: " + getPlaca());
     System.out.println("A cor do fusca �: " + getCor());
	 System.out.println("O n�mero de passageiros �: " + getnPasageiros());
	 System.out.println("A capacidade do tamque do fusca �: " + getCapacidadeTamque());
	 System.out.println("A valocidade m�xima do fusca �: " + getVelocidadeMaxima());
	 System.out.println("A valocidade atual do fusca �: " + getValocidadeAtual());
	 System.out.println("O consumo m�dio do fusca �: " + getCosumoMedio());
	 System.out.println("----------------- Minha Kombi: --------------------");	
	}
	
	/* ------------------------------------------------------ */
	
	public static void main(String[] args) throws Exception {
		veiculos fusca = new veiculos();
		fusca.mostraFusca();
		
		veiculos kombi = new veiculos();
		
		    kombi.placa = "BRA2E19";
	        kombi.cor = "Branco";
	        kombi.nPasageiros = 9;
	        kombi.capacidadeTamque = "10 Litros";
	        kombi.velocidadeMaxima = "130 Km/h";
	        kombi.valocidadeAtual = "80 Km/h";
	        kombi.cosumoMedio = "1 Litro";
	    
	        System.out.println("A placa da kombi �: " + kombi.placa);
	        System.out.println("A cor da kombi �: " + kombi.cor);
	        System.out.println("O n�mero de passageiros �: " + kombi.nPasageiros);
	        System.out.println("A capacidade do tamque da kombi �: " + kombi.capacidadeTamque);
	        System.out.println("A valocidade m�xima da kombi �: " + kombi.velocidadeMaxima);
	        System.out.println("A valocidade atual da kombi �: " + kombi.valocidadeAtual);
	        System.out.println("O consumo m�dio da kombi �: " + kombi.cosumoMedio);
		
    }
	
}

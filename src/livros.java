
public class livros {
	
	/* titulo */
	/* ------------------------------------------------------ */
	public String getTitulo() {
		return titulo = "A Sociedade do Anel";
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/* autor */
	/* ------------------------------------------------------ */
	public String getAutor() {
		return autor = "J.R.R. Tolkien";
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	/* ISBN */
	/* ------------------------------------------------------ */
	public String getISBN() {
		return ISBN = "8595084750";
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/* noDePaginas */
	/* ------------------------------------------------------ */
	public int getNoDePaginas() {
		return noDePaginas = 576;
	}

	public void setNoDePaginas(int noDePaginas) {
		this.noDePaginas = noDePaginas;
	}

	/* valorDeCompra */
	/* ------------------------------------------------------ */
	public String getValorDeCompra() {
		return valorDeCompra = "R$ 39,89";
	}

	public void setValorDeCompra(String valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}

	public String titulo;
	public String autor;
	public String ISBN;
	public int noDePaginas;
	public String valorDeCompra;
	
	public void mostraLivro() {
		 System.out.println("----------------- Meu Livro Senhor Dos An�is: --------------------");	
		 System.out.println("----------------- Livro de Fic��o e Fantazia ---------------------");
		 System.out.println("O Titulo do Livro �: " + getTitulo());
	     System.out.println("O Autor do Livro �: " + getAutor());
		 System.out.println("O ISBN do Livro �: " + getISBN());
		 System.out.println("O N�mero de P�ginas do Livro �: " + getNoDePaginas());
		 System.out.println("O Pre�o do Livro �: " + getValorDeCompra());
		 System.out.println("---------------- Meu Livro Cr�nicas de N�rnia: -------------------");	
		}
	
	public static void main(String[] args) throws Exception {
	livros SenhorDosAneis = new livros();
	SenhorDosAneis.mostraLivro();
				
	livros CronicasDeNarnia = new livros();
	
	CronicasDeNarnia.titulo = "O Le�o, a Feiticeira e o Guarda-Roupa";
	CronicasDeNarnia.autor = "C. S. Lewis";
	CronicasDeNarnia.ISBN = "9780064404990";
	CronicasDeNarnia.noDePaginas = 208;
	CronicasDeNarnia.valorDeCompra = "R$ 74,10";
	
	 System.out.println("----------------- Livro de Fic��o e Fantazia ---------------------");
	 System.out.println("O Titulo do Livro �: " + CronicasDeNarnia.titulo);
     System.out.println("O Autor do Livro �: " + CronicasDeNarnia.autor);
     System.out.println("O ISBN do Livro �: " + CronicasDeNarnia.ISBN);
     System.out.println("O N�mero de P�ginas do Livro �: " + CronicasDeNarnia.noDePaginas);
     System.out.println("O Pre�o do Livro �: " + CronicasDeNarnia.valorDeCompra);
	
	}
}

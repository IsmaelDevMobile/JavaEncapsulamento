
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
		 System.out.println("----------------- Meu Livro Senhor Dos Anéis: --------------------");	
		 System.out.println("----------------- Livro de Ficção e Fantazia ---------------------");
		 System.out.println("O Titulo do Livro é: " + getTitulo());
	     System.out.println("O Autor do Livro é: " + getAutor());
		 System.out.println("O ISBN do Livro é: " + getISBN());
		 System.out.println("O Número de Páginas do Livro é: " + getNoDePaginas());
		 System.out.println("O Preço do Livro é: " + getValorDeCompra());
		 System.out.println("---------------- Meu Livro Crônicas de Nárnia: -------------------");	
		}
	
	public static void main(String[] args) throws Exception {
	livros SenhorDosAneis = new livros();
	SenhorDosAneis.mostraLivro();
				
	livros CronicasDeNarnia = new livros();
	
	CronicasDeNarnia.titulo = "O Leão, a Feiticeira e o Guarda-Roupa";
	CronicasDeNarnia.autor = "C. S. Lewis";
	CronicasDeNarnia.ISBN = "9780064404990";
	CronicasDeNarnia.noDePaginas = 208;
	CronicasDeNarnia.valorDeCompra = "R$ 74,10";
	
	 System.out.println("----------------- Livro de Ficção e Fantazia ---------------------");
	 System.out.println("O Titulo do Livro é: " + CronicasDeNarnia.titulo);
     System.out.println("O Autor do Livro é: " + CronicasDeNarnia.autor);
     System.out.println("O ISBN do Livro é: " + CronicasDeNarnia.ISBN);
     System.out.println("O Número de Páginas do Livro é: " + CronicasDeNarnia.noDePaginas);
     System.out.println("O Preço do Livro é: " + CronicasDeNarnia.valorDeCompra);
	
	}
}

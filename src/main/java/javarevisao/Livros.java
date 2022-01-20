package javarevisao;

public class Livros {
	
	public int codigo;
	public String titulo;
	public String autor;
	public double preco;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public Livros() {
		
	}
	
	public Livros(int codigo, String titulo, String autor, double preco) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Livros [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}
	
	
	
}

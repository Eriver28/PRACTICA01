package Practica01;

public abstract class Libro {

   private String titulo;
   private String cod;
   private String tema;
   private String autor;


   public Libro(String titulo, String cod, String tema, String autor) {
      this.titulo = titulo;
      this.cod = cod;
      this.tema = tema;
      this.autor = autor;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getCod() {
      return cod;
   }

   public void setCod(String cod) {
      this.cod = cod;
   }


   public String getTimPrestamo() {
      return tema;
   }

   public void setTimPrestamo(int timPrestamo) {
      this.tema = tema;
   }

   public String getAutor() {
      return autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public abstract int tiempoPrestamo();
   public abstract int tiempoMaximoPrestamo();
   public abstract int multaPordia();


   @Override
   public String toString() {
      return "Libro\n{" +
              "titulo='" + titulo + '\'' +
              ", cod='" + cod + '\'' +
              ", tema=" + tema +
              ", autor='" + autor + '\'' +
              "}\n";
   }
}

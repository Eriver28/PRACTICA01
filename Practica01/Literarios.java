package Practica01;

public  class Literarios extends Libro {
    public Literarios(String titulo, String cod, String tema, String autor) {
        super(titulo, cod, tema, autor);
    }

    @Override
    public int tiempoPrestamo() {
        return 5;
    }

    @Override
    public int tiempoMaximoPrestamo() {
        return 6;
    }

    @Override
    public int multaPordia() {
        return 5;
    }
}



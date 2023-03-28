package Practica01;

public  class Texto extends Libro {
    public Texto(String titulo, String cod, String tema, String autor) {
        super(titulo, cod, tema, autor);
    }

    @Override
    public int tiempoPrestamo() {
        return 8;
    }

    @Override
    public int tiempoMaximoPrestamo() {
        return 9;
    }

    @Override
    public int multaPordia() {
        return 2;
    }

}
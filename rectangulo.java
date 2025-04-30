public class rectangulo {
    protected int _ancho;
    protected int _alto;

    public void setAncho(int ancho){
        _ancho = ancho;
    }

    public void setAlto(int alto) {
        _alto = alto;
    }

    public int getAncho(){
        return _ancho;
    }

    public int getAlto(){
        return _alto;
    }

    public int getArea(){
        return _ancho * _alto;
    }
}
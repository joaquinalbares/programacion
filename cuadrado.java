class cuadrado extends rectangulo{
    public void setAncho(int ancho){
        _ancho = ancho;
    }

    public void setAlto(int alto) {
        _alto = alto;
        _ancho = alto;
    }
}
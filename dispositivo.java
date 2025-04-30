interface Dispositivo {
    void encender();
    void apagar();
    void print();
}

class Impresora implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Impresora encendida");
    }
    
    @Override
    public void apagar() {
        System.out.println("Impresora apagada");
    }
    
    @Override
    public void print() {
        System.out.println("Imprimiendo...");
    }
}

class Lampara implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Lámpara encendida");
    }
    
    @Override
    public void apagar() {
        System.out.println("Lámpara apagada");
    }
    
    @Override
    public void print() {
        throw new UnsupportedOperationException("Las lámparas no imprimen");
    }
}
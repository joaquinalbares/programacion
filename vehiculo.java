class Vehiculo {
    public void arrancaMotor() {
        System.out.println("Motor funcionando");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void arrancaMotor() {
        throw new UnsupportedOperationException("Las bicicletas no tienen motor");
    }
}
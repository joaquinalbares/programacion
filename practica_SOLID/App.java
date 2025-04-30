public class App {
    public static void main(String[] args) throws Exception {
            rectangulo r = new cuadrado();
            // rectangulo r = new rectangulo();
            //no funciona igual si r es un rectangulo o si es un cuadrado
            r.setAncho(5); 
            r.setAlto(10);
            System.out.println(r.getArea()); 
    }
}

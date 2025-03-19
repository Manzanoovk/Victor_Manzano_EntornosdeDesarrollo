public class Main {
    public static void main(String[] args) {

        VMB_Circulo circulo1 = new VMB_Circulo("verde", 3, 5);
        VMB_Rectangulo rectangulo1 = new VMB_Rectangulo("rojo", 3, 5, 7);
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area rectangulo: " + area1);
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);

        System.out.println("Rectangulo: " + rectangulo1);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}

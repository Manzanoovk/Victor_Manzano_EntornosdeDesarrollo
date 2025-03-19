public class VMB_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    public VMB_Rectangulo() {
    }

    public VMB_Rectangulo(String color, int id, double ladoA, double ladoB) {
        this.color = color;
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VMB_Rectangulo{");
        sb.append("id=").append(id);
        sb.append(", ladoA=").append(ladoA);
        sb.append(", ladoB=").append(ladoB);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

}

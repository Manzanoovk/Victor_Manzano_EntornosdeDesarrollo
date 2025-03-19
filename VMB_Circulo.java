public class VMB_Circulo {

    private int id;
    private double radio;
    private String color;

    public VMB_Circulo() {
        this.radio = 0.0;
        this.color = "Blanco";
    }

    public VMB_Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public VMB_Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VMB_Circulo{");
        sb.append("id=").append(id);
        sb.append(", radio=").append(radio);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

}

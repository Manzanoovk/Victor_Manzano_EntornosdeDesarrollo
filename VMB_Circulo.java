public class VMB_Circulo {
    private int id;
    private double radio;
    private String color;

    // Aqui esta el Constructor
    public VMB_Circulo() {
    }

    public VMB_Circulo(String color, int id, double radio) {
        this.color = color;
        this.id = id;
        this.radio = radio;
    }

    // Aqui estan los getter u setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Aqui esta el toString
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
public class Triangulo implements FormaGeometrica {
    @Override
    public void calcularArea(double base, double altura) {
        double area = (base*altura)/2;
        System.out.println("O tamanho da área desse triangulo é: " + area);
    }
}

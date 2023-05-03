public class Quadrado implements FormaGeometrica{
    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;

        System.out.println("O tamanho da área desse quadrado é: " + area);
    }
}

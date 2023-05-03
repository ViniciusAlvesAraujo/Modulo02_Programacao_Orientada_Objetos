public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public Veiculo (){}
    public Veiculo (int id, int velocidadeMaxima, int precisaoEmCurvas){

    }

    public void acelerar(){}
    public void desacelerar(){}
    public void ligarFarol(){}

    public abstract void utilizarHabilidadeEspecial();

}

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<Operario> operarios;

    public Fabrica() {
        this.operarios = new ArrayList<>();
    }

    public void adicionarOperario(Operario operario){
        this.operarios.add(operario);
    }
    public void iniciarExperiente(){
        for (Operario operario : this.operarios){
            operario.trabalhar();
        }
    }
}

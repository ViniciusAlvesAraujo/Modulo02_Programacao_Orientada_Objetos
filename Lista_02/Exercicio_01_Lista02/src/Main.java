import java.util.Scanner;

public class Main {
    static String idade(int idade1){
        if (idade1 >= 5 && idade1 <= 7){
            return "Infatil A";
        }else if (idade1 >=8 && idade1 <= 10){
            return "Infantil B";
        }else if(idade1 >=11 && idade1 <= 13) {
            return "Juvenil A";
        }else if (idade1 >= 14 && idade1 <= 17){
            return "Juvenil B";
        }else if (idade1 >= 18){
            return "Adulto";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite a idade do nadador: ");
        int idadeNadador = scanner.nextInt();

        String retornoIdade = idade(idadeNadador);

        System.out.println("Categoria " + retornoIdade);

    }
}
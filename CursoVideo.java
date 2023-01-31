import java.util.Date; // importa a biblioteca do java que controla datas

public class CursoVideo{
    public static void main(String[] args) {
        Date hora = new Date();
        System.out.println("A hora é:");
        System.out.println(hora.toString()); // transforma o objeto data para uma string
    }
}
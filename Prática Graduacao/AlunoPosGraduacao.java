import java.util.Scanner;
import java.io.Serializable;
public class AlunoPosGraduacao extends Aluno implements Serializable 
{
    private String graduacao;
    private String instituicao;
    private CursoPosGraduacao curso;
    
    public boolean setGraduacao(String graduacao)
    {
        if (graduacao.length() > 0) {
            this.graduacao = graduacao;
            return true;
        }
        else {
            System.out.println("Dado invalido!");
            return false;
    }
    }
    public boolean setInstituicao(String instituicao)
    {
        if (instituicao.length() > 0) {
            this.instituicao = instituicao;
            return true;
        }
        else {
            System.out.println("Dado invalido!");
            return false;
        }
    }
    public void lerDados() {
        super.lerDados();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a Graduaçao do :");
        while (!setGraduacao(s.nextLine()));
        
        System.out.println("Digite o nome do funcionário:");
        while (!setInstituicao(s.nextLine()));
        this.curso = new CursoPosGraduacao();
        this.curso.lerDados();
    }
    
    public void mostrarDados()
   {
        
        System.out.println("Grauação: "+this.graduacao);
        System.out.println("Instituição: "+this.instituicao);
        this.curso = new CursoPosGraduacao();
        this.curso.mostrarDados();
   }
    public AlunoPosGraduacao(CursoPosGraduacao c)
   {
        curso = c;
   }
    public AlunoPosGraduacao(){}
}

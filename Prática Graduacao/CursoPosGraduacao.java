import java.util.Scanner;
import java.io.Serializable;
public class CursoPosGraduacao extends Curso implements Serializable 
{
    private String nomec;
   private String codigo;
   private int duracao;
   
   public boolean setNomec(String nomec)
   {
    if (nomec.length() > 0){
        this.nomec = nomec;
        return true;
    }
    else {
        System.out.println("Dado inválido!");
        return false;
    }
    }
    
   public boolean setCodigo(String codigo)
   {
    if (codigo.length() > 0){
        this.codigo = codigo;
        return true;
    }
    else {
        System.out.println("Dado inválido!");
        return false;
    }
    }
    
    public boolean setDuracao(int duracao)
   {
    if (duracao > 0){
        this.duracao = duracao;
        return true;
    }
    else {
        System.out.println("Dado inválido!");
        return false;
    }
    }
   
   public void lerDados() {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite o nome do curso:");
       while (!setNomec(s.nextLine()));
       
       System.out.println("Digite o codigo do curso:");
       while (!setCodigo(s.nextLine()));
       
       System.out.println("Digite a duração do curso:");
       while (!setDuracao(s.nextInt()));

    } 
    
       public void mostrarDados()
   {
        System.out.println("Curso Pós Graduação: "+this.nomec);
        System.out.println("Código do curso: "+this.codigo);
        System.out.println("Duração do curso: "+this.duracao+" anos");
        
    }  
}

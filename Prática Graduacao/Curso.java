import java.util.*;
import java.io.Serializable;
public abstract class Curso implements Serializable 
{
   private String nomec;
   private String codigo;
   private int duracao;
   
   public String getCodigo(){
        return codigo;
    }
   
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
   
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
        System.out.println("Curso: "+this.nomec);
        System.out.println("Código do curso: "+this.codigo);
        System.out.println("Duração do curso: "+this.duracao+" anos");
        
    } 
      
      public void adicionarDisciplina(Disciplina d){
          disciplinas.add(d);
        }
        public void mostrarDisciplinas(){
            //percorrer o arraylist “disciplinas� chamando mostrarDados() de 
            //cada disciplina
            for (Disciplina d: disciplinas)
            d.mostrarDados();
        }
        public void removerDisciplina(Disciplina d) {
            //remover um objeto “d�? do arraylist de disciplinas
            disciplinas.remove(d);
        }  
}

import java.util.Scanner;
import java.io.Serializable;
public class Disciplina implements Serializable 
{
    private String nome;
    private String codigo;
    private int carga_horaria;
    private Curso curso;
    private Professor professor;
    
     public String getCodigo(){
        return codigo;
    }
    
    public boolean setNome(String nome)
    {
        if (nome.length() > 0){
            this.nome = nome;
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
    
    public boolean setCarga_horaria(int carga_horaria)
    {
        if (carga_horaria > 0){
            this.carga_horaria = carga_horaria;
            return true;
        }
        else {
            System.out.println("Dado inválido!");
            return false;
        }
    }
   
    public void lerDados()
    {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome da disciplina");
        while (!setNome(s.nextLine()));
        
        System.out.println("Digite o código da disciplina:");
        while (!setCodigo(s.nextLine()));
        
        System.out.println("Digite a carga horária:");
        while (!setCarga_horaria(s.nextInt()));
    }
    
    public void mostrarDados()
   {
        System.out.println("Nome da Disciplina: "+this.nome);
        System.out.println("Código: "+this.codigo);
        System.out.println("Carga Horária: "+this.carga_horaria);
        
    }
    public Disciplina(){}
    public Disciplina(Curso c)
    {
        curso = c;
    }
}
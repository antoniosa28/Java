import java.util.Scanner;
import java.io.Serializable;
public class AlunoGraduacao extends Aluno implements Serializable 
{
  
    private String matricula;
    private byte situacao;
    private CursoGraduacao curso;
   
    
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0){
            this.matricula = matricula;
            return true;
        }
        else {
            System.out.println("Matricula inválida!");
            return false;
        }
    }
    
    public boolean setSituacao(String situacao)
    {
        if (situacao == "M" || situacao == "m"){
            this.situacao = 1;
            return true;
        }else if(situacao == "T" || situacao == "t") {
            this.situacao = 2;
            return true;        
        }
        else if(situacao == "D" || situacao == "d") {
            this.situacao = 3;
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
        
        System.out.println("Digite a matricula do aluno:");
        while (!setMatricula(s.nextLine()));
        
        System.out.println("Digite a situacao do aluno:");
        while (!setSituacao(s.nextLine()));
        
        System.out.println("Digite os dados do curso do aluno:");
        this.curso = new CursoGraduacao();
        this.curso.lerDados();
    }
    
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("Matrícula: "+this.matricula);
        
        if (this.situacao == 1){
        System.out.println("Matriculado");
        
        }
        if (this.situacao == 2){
        System.out.println("Trancado");
        
        }
        if (this.situacao == 3){
        System.out.println("Desligado");
        
        }
        this.curso = new CursoGraduacao();
        this.curso.mostrarDados();
    }
    public AlunoGraduacao(CursoGraduacao n){
       curso = n;
    }
    public AlunoGraduacao(){}
    
}

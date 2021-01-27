import java.util.*;
import java.io.Serializable;
public class Aluno extends Pessoa implements Pesquisador,Serializable {
    
    private byte situacao;
    private String matricula;
    private Curso curso;
    private Disciplina disciplina;
    
    public String getMatricula(){
        return matricula;
    }
    
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public void adicionarCurso(Curso c){
        cursos.add(c);
    }
    public void mostrarDisciplinas(){
        //percorrer o arraylist cursos chamando mostrarDados() de 
        //cada curso
        for (Curso c: cursos)
        c.mostrarDados();
    }
    public void removerCurso(Curso c) {
        //remover um objeto curso do arraylist de cursos
        cursos.remove(c);
    }
    public void setCurso(Curso curso){
        this.curso = curso;
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
    
    public boolean setMatricula(String matricula)
    {
        if (matricula.length() > 0){
            this.matricula = matricula;
            return true;
        }
        else {
            System.out.println("Matricula invalida!");
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
        
        System.out.println("Digite os dados do curso:");
        
        
    }
    
    public void mostrarDados()
   {
        super.mostrarDados();
        System.out.println("Matricula: "+this.matricula);
        
        if (this.situacao == 1){
        System.out.println("Matriculado");
        
        }
        if (this.situacao == 2){
        System.out.println("Trancado");
        
        }
        if (this.situacao == 3){
        System.out.println("Desligado");
        
        this.curso.mostrarDados();
        }
    }
    public String getTipo(){
       this.getClass().getName();
    return this.getClass().getName() ;
    }
}
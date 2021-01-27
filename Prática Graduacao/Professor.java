import java.util.Scanner;
import java.io.Serializable;
public class Professor extends Funcionario implements Pesquisador,Serializable 
{
    private String titulacao;
    private String area_de_pesquisa;
    int numeroHorasAula;
    int valorHoraAula;
    
     public String getTitulacao(){
        return titulacao;
    }
    public String getTipo(){
       this.getClass().getName();
    return this.getClass().getName() ;
    }
    
    public boolean setTitulacao(String titulacao)
    {
        if (titulacao.length() > 0) {
            this.titulacao = titulacao;
            return true;
        }
        else {
            System.out.println("Dado inválido!");
            return false;
        }
    }
    
    public boolean setArea_de_pesquisa(String area_de_pesquisa)
    {
        if (area_de_pesquisa.length() > 0) {
            this.area_de_pesquisa = area_de_pesquisa;
            return true;
        }
        else {
            System.out.println("Dado inválido!");
            return false;
        }
    }
    public void lerDados()
    {
        super.lerDados();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a titulação:");
        while (!setTitulacao(s.nextLine()));
        System.out.println("Digitea área de pesquisa:");
        while (!setArea_de_pesquisa(s.nextLine()));
    }
    
    public void mostrarDados()
    {
        System.out.println("titulacao: "+this.titulacao);
        System.out.println("area_de_pesquisa: "+this.area_de_pesquisa);
        
    }
    public double calcSalario(){
        salario = numeroHorasAula * valorHoraAula;
        return salario;
    }
    
}
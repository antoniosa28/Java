
import java.util.ArrayList;
public class FolhaPagamento{
    private double totalFolha=0;
    public double somaFolha(ArrayList<? extends Funcionario> funcionarios) {
      for ( Funcionario func : funcionarios){
        this.totalFolha = 0;
        this.totalFolha += func.calcSalario();
        System.out.printf("\n Nome: \n Salario: \n Categoria: \n", func.getNome(),func.getSalario(), func.getClass().getName());
      }
      return 0;
    }
    public double getTotalFolha(){
        return this.totalFolha;
    }
    public double getTotalEncargos(){
        //Suponha que o total de encargos 
        //é 33,78% sobre o 
        //salário de cada funcionário. 
        return (this.totalFolha * 0.3378);
    }
    public double calcIRRF(Funcionario f){
        if (f.calcSalario() > 3000){ 
            System.out.println("Salario(com IRRF):"+ f.calcSalario()*0.275);
            return f.calcSalario()*0.275;
        }
        else if (f.calcSalario() > 1500)
        {   System.out.println("Salario(com IRRF):"+ f.calcSalario()*0.15);
            return f.calcSalario()*0.15;
        }
        else
        {  
            return 0;
        }
        
    }
    public double calcInss(Funcionario f){
       
        System.out.println("Salario(com INSS):"+ f.calcSalario()*0.11);
        return f.calcSalario()* 0.11;
    }
     
    public void mostrarDados(Funcionario f){
        System.out.println("Salario Liquido:" + f.calcSalario());
        System.out.println("");
    }
}


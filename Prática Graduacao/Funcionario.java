import java.util.*;

public abstract class Funcionario extends Pessoa 
{
    private String ctps;
    double salario;
    private static double pisoSalarial;
    
    private Professor professor;
    private Tecnicos tecnicos;
    public boolean setCtps(String ctps) 
   {
      if (ctps.length() > 0){
        this.ctps = ctps;
        return true;
        } 
        else{
            System.out.println("Dados invalidos!");
            return false;
        }
    }
    public boolean setSalario(double salario){
        if (salario > 0) {
           this.salario = salario;
           return true;
        }
        else {
            System.out.println("Salario invalido!");
            return false;
        }
    
    }
    public void lerDados() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a CTPS do funcionario:");
        while (!setCtps(s.nextLine()));
        System.out.println("Digite o salario do funcionario:");
        while (!setSalario(s.nextDouble()));
    }
   public void mostrarDados()
   {        
        System.out.println("CTPS: "+this.ctps);
        
        System.out.println("Salario: "+this.salario);
        
    }
    
    public abstract double calcSalario();
    
    public double getSalario(){
        return this.salario;
    }
}


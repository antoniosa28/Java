import java.util.*;
import java.io.Serializable;
public  class Tecnicos extends Funcionario implements Serializable 
{
    private String cargo;
    private String departamento;
    private double salarioBase;
    private double quantidadeHoraExtra;
    private static double valorHoraExtra;
    
    public String getCargo(){
        return cargo;
    }
    
    public boolean setCargo(String cargo)
    {
        if (cargo.length() > 0) {
            this.cargo = cargo;
            return true;
        }
        else {
            System.out.println("Dado invalido!");
            return false;
        }
    }
    
    public boolean setDepartamento(String departamento)
    {
        if (departamento.length() > 0) {
            this.departamento = departamento;
            return true;
        }
        else {
            System.out.println("Dado invalido!");
            return false;
        }
    }
    public void lerDados()
    {
        super.lerDados();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o Cargo:");
        while (!setCargo(s.nextLine()));
        
        System.out.println("Digite o Departamento:");
        while (!setDepartamento(s.nextLine())); 
        System.out.println("Digite o Salario Base:");
        this.salarioBase = s.nextInt();
        System.out.println("Digite o valor da hora extra:");
        this.valorHoraExtra = s.nextInt();
        System.out.println("Digite o a quntidade de hora extra:");
        this.quantidadeHoraExtra = s.nextInt();
    }
    
    public void mostrarDados()
   {
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Departamento: "+this.departamento);
        
    }
    
    public double calcSalario()
    {
       
       salario = salarioBase + (valorHoraExtra * quantidadeHoraExtra ); 
       return salario;
    }
}
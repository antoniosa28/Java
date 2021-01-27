import java.util.Scanner;
import VerificaCPF.ValidaCPF; 
    public abstract class Pessoa
{
        private String nome;
        private String cpf;
        private String endereco;
        private String telefone;
        
        public boolean setNome(String nome)
        {
            if (nome.length() > 0) {
                this.nome = nome;
                return true;
            }
            else {
                System.out.println("Nome invalido!");
                return false;
            }
        }
        public String getNome(){
            return this.nome;
        }
        public boolean setCpf(String cpf)
        {
            if (ValidaCPF.isCPF(cpf) == true){
               this.cpf = cpf;
               return true;
            }
               else System.out.printf("Erro, CPF invalido !!!\n");
               return false;
            }
        public String getCpf(){
            return this.cpf;
        }
        public boolean setEndereco(String endereco)
        {
            if (endereco.length() > 0){
                this.endereco = endereco;
                return true;
            }
            else {
                System.out.println("Endereco invalido!");
                return false;
            }
        }
        public boolean setTelefone(String telefone)
        {
            if (telefone.length() > 0) {
                this.telefone = telefone;
                return true;
            }
            else {
                System.out.println("Telefone invalido!");
                return false;
            }
        }
        
    public void lerDados() {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o nome da pessoa:");
            while (!setNome(s.nextLine()));
            System.out.println("Digite o endereco da pessoa:");
            while (!setEndereco(s.nextLine()));
            System.out.println("Digite o telefone da pessoa:");
            while (!setTelefone(s.nextLine()));
            System.out.println("Digite o CPF da pessoa:");
            while (!setCpf(s.nextLine()));
            

        }
        public void mostrarDados()
    {    
     System.out.println("Nome:"+this.nome);  
     System.out.println("CPF:"+this.cpf);       
     System.out.println("Endereco:"+this.endereco);
     System.out.println("Telefone:"+this.telefone);
    }
}
import java.util.*;
public class ProjetoPesquisa extends Pessoa 
{
    private String codigo;
    private String titulo;
    private Date inicio;
    private Date fim;
    private String profResp;
    
    ArrayList<Pesquisador> equipe = new ArrayList<Pesquisador>();
    
    public void cadastrar(Pesquisador p){
            this.equipe.add(p);
            System.out.println("Total de Alunos PosGrad. inseridos...: ");
            System.out.println(this.equipe.size());
        }
        
        public void listar(){
                        for (Pesquisador objeto: this.equipe) {
                                   objeto.getClass().getName();  
                                 //todo mostrarDados() ja¡ implementado na pratica anterior
                                }
                            }
                            
        public Pesquisador buscar(String cpf)  {
            Pesquisador a = null;
                  for ( Pesquisador objeto: this.equipe)  {                        
                      if (objeto.getCpf().equals(cpf))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
        public boolean excluir(String cpf){
            Pesquisador a = this.buscar(cpf);
                if (a != null)  {
                this.equipe.remove(a);
                return true;
              }
                else {
                    return false;
                       }
                   }
}

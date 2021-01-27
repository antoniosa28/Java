
import java.util.*;
import Persistencia.*;
import EntradaDeDados.*;
public class DadosDisciplina extends Disciplina
{
    private static ArrayList<Disciplina>disciplina = new ArrayList<Disciplina>();
    
            public void cadastrar(Disciplina a) {
                                this.disciplina.add(a); //ADICIONA O CURSO NO ARRAY 
                                System.out.println("Total de disciplinas inseridas...: ");
                                System.out.println(this.disciplina.size());
                                boolean r = Persist.gravar(disciplina, "disciplina.dat");
                            }
                         //método mostrarDados() já implementado na prática anterior
             public void listar(){
                        for (Disciplina objeto: this.disciplina) {
                                   objeto.mostrarDados();  
                                 //método mostrarDados() já implementado na prática anterior
                                }
                            }
                            //este método retorna o objeto Disciplina caso encontrado, ou null, caso não encotrado
 public Disciplina buscar(String codigo)  {
            Disciplina a = null;
                  for ( Disciplina objeto: this.disciplina)  {                        
                      if (objeto.getCodigo().equals(codigo))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
                          //este método usa o método buscar já implementado
 public boolean excluir(String codigo){
   Disciplina a = this.buscar(codigo);
        if (a != null)  {
          this.disciplina.remove(a);
          return true;
          }
          else {
              return false;
                       }
                   }
                   static{
        disciplina = (ArrayList<Disciplina>)Persist.recuperar("disciplina.dat"); 
        if (disciplina == null)
            disciplina = new ArrayList<Disciplina>();
    }    
}

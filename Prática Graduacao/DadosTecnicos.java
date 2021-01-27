import java.util.*; 
import Persistencia.*;
import EntradaDeDados.*;
public class DadosTecnicos extends Tecnicos
{
       
    private static ArrayList<Tecnicos>tecnicos = new ArrayList<Tecnicos>();
    
            public void cadastrar(Tecnicos a) {
                                this.tecnicos.add(a); //ADICIONA O CURSO NO ARRAY 
                                System.out.println("Total de tecnicos inseridos...: ");
                                System.out.println(this.tecnicos.size());
                                boolean r = Persist.gravar(tecnicos, "tecnicos.dat");
                            }
                         //método mostrarDados() já implementado na prática anterior
             public void listar(){
                        for (Tecnicos objeto: this.tecnicos) {
                                   objeto.mostrarDados();  
                                 //método mostrarDados() já implementado na prática anterior
                                }
                            }
                            //este método retorna o objeto Tecnicos caso encontrado, ou null, caso não encotrado
 public Tecnicos buscar(String cargo)  {
            Tecnicos a = null;
                  for ( Tecnicos objeto: this.tecnicos)  {                        
                      if (objeto.getCargo().equals(cargo))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
                          //este método usa o método buscar já implementado
 public boolean excluir(String cargo){
  Tecnicos a = this.buscar(cargo);
        if (a != null)  {
          this.tecnicos.remove(a);
          return true;
          }
          else {
              return false;
                       }
                   }
                   static{
        tecnicos = (ArrayList<Tecnicos>)Persist.recuperar("cursos.dat"); 
        if (tecnicos == null)
            tecnicos = new ArrayList<Tecnicos>();
    }    
}

import java.util.*; 
import Persistencia.*;
import EntradaDeDados.*;
public class DadosProfessores extends Professor
{
       
    private static ArrayList<Professor>professor = new ArrayList<Professor>();
    
            public void cadastrar(Professor a) {
                     this.professor.add(a); //ADICIONA O CURSO NO ARRAY 
                     System.out.println("Total de Professores inseridos...: ");
                     System.out.println(this.professor.size());
                     boolean r = Persist.gravar(professor, "professor.dat");
                            }
                         //todo mostrarDados() ja� implementado na pratica anterior
             public void listar(){
                        for (Professor objeto: this.professor) {
                                   objeto.mostrarDados();  
                                 //todo mostrarDados() ja� implementado na pratica anterior
                                }
                            }
                            //este método retorna o objeto Tecnicos caso encontrado, ou null, caso não encotrado
 public Professor buscar(String titulacao)  {
            Professor a = null;
                  for ( Professor objeto: this.professor)  {                        
                      if (objeto.getTitulacao().equals(titulacao))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
                          //este método usa o método buscar já implementado
 public boolean excluir(String titulacao){
  Professor a = this.buscar(titulacao);
        if (a != null)  {
          this.professor.remove(a);
          return true;
          }
          else {
              return false;
                       }
                   }
                   static{
        professor = (ArrayList<Professor>)Persist.recuperar("professor.dat"); 
        if (professor == null)
            professor = new ArrayList<Professor>();
    }    
   
}

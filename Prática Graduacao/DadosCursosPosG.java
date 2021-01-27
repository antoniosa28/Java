import java.util.*;
import Persistencia.*;
import EntradaDeDados.*;
public class DadosCursosPosG extends CursoPosGraduacao 
{
    private static ArrayList<CursoPosGraduacao>cursos = new ArrayList<CursoPosGraduacao>();
    
    public void cadastrar(CursoPosGraduacao a) {
                     this.cursos.add(a); //ADICIONA O CURSO NO ARRAY 
                     System.out.println("Total de cursos inseridos...: ");
                     System.out.println(this.cursos.size());
                     boolean r = Persist.gravar(cursos, "cursosPG.dat");
    }
    
    public void listar(){
                        for (CursoPosGraduacao objeto: this.cursos) {
                                   objeto.mostrarDados();  
                                 //todo mostrarDados() ja¡ implementado na pratica anterior
                                }
                            }
    
    public CursoPosGraduacao buscar(String codigo)  {
            CursoPosGraduacao a = null;
                  for ( CursoPosGraduacao objeto: this.cursos)  {                        
                      if (objeto.getCodigo().equals(codigo))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
                         
    public boolean excluir(String codigo){
        CursoPosGraduacao a = this.buscar(codigo);
            if (a != null)  {
                this.cursos.remove(a);
                return true;
            }
            else {
              return false;
                       }
                   }  
                    static{
        cursos = (ArrayList<CursoPosGraduacao>)Persist.recuperar("cursosPG.dat"); 
        if (cursos == null)
            cursos = new ArrayList<CursoPosGraduacao>();
    }    
}

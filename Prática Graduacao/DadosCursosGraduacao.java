import java.util.*;
import Persistencia.*;
import EntradaDeDados.*;
public class DadosCursosGraduacao extends CursoGraduacao 
{
    private static ArrayList<CursoGraduacao>cursos = new ArrayList<CursoGraduacao>();
    
    public void cadastrar(CursoGraduacao a) {
                     this.cursos.add(a); //ADICIONA O CURSO NO ARRAY 
                     System.out.println("Total de cursos inseridos...: ");
                     System.out.println(this.cursos.size());
                     boolean r = Persist.gravar(cursos, "cursosG.dat");
    }
    
    public void listar(){
                        for (CursoGraduacao objeto: this.cursos) {
                                   objeto.mostrarDados();  
                                 //todo mostrarDados() ja¡ implementado na pratica anterior
                                }
                            }
    
    public CursoGraduacao buscar(String codigo)  {
            CursoGraduacao a = null;
                  for ( CursoGraduacao objeto: this.cursos)  {                        
                      if (objeto.getCodigo().equals(codigo))  {
                       a = objeto;
                       break;   
                                     }
                               }
            return a;                        
                          }
                         
    public boolean excluir(String codigo){
        CursoGraduacao a = this.buscar(codigo);
            if (a != null)  {
                this.cursos.remove(a);
                return true;
            }
            else {
              return false;
                       }
                   } 
                   static{
        cursos = (ArrayList<CursoGraduacao>)Persist.recuperar("cursosG.dat"); 
        if (cursos == null)
            cursos = new ArrayList<CursoGraduacao>();
    }    
}

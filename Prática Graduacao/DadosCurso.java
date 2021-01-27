import java.util.*; 
import Persistencia.*;
import EntradaDeDados.*;
class DadosCurso extends Curso{
    
    private static ArrayList<Curso>cursos = new ArrayList<Curso>();
    
            public void cadastrar(Curso a) {
                                this.cursos.add(a); //ADICIONA O CURSO NO ARRAY 
                                System.out.println("Total de cursos inseridos...: ");
                                System.out.println(this.cursos.size());
                                boolean r = Persist.gravar(cursos, "cursos.dat");
                            }
                            
                        
             public void listar(){
                        for (Curso objeto: this.cursos) {
                                   objeto.mostrarDados();  
                                 //método mostrarDados() já implementado na prática anterior
                                }
                            }
                            //este método retorna o objeto Curso caso encontrado, ou null, caso não encotrado
            public Curso buscar(String codigo)  {
                Curso a = null;
                  for ( Curso objeto: this.cursos)  {                        
                      if (objeto.getCodigo().equals(codigo))  {
                       a = objeto;
                       break;   
                                     }
                               }
                return a;                        
                          }
                          //este método usa o método buscar já implementado
                          public boolean excluir(String codigo){
                              Curso a = this.buscar(codigo);
                              if (a != null)  {
                                  this.cursos.remove(a);
                                  return true;
                                }
                                else {
                                    return false;
                       }
                   }
                   static{
        cursos = (ArrayList<Curso>)Persist.recuperar("cursos.dat"); 
        if (cursos == null)
            cursos = new ArrayList<Curso>();
    }    
  }

/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // Este atributo hace referencia al nombre del alimento
    private String nombre;
    // Este atributo hace refencia a las proteinas del alimento
    private float proteinas;
    // Este atributo hace referencia a los carbohidratos del alimento
    private float carbohidratos;
    // Este atributo hace referencia a las grasas del alimento
    private float grasas;
    // Este atributo hace referencia al total de calorias
    private float calorias;
    
    
    
    /**
     * Este constructor crea un objeto alimento
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas * 4f) + (carbohidratos * 4f ) + (grasas * 9f);
        
    }
  
    
    /**
     * Este constructor crea un objeto alimento
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre:                                                                             " + nombre);
        System.out.println("Proteinas por cada 100 gramos:                                                      " + proteinas);
        System.out.println("Carbohidratos por cada 100 gramos:                                                  " + carbohidratos);
        System.out.println("Grasas por cada 100 gramos:                                                         " + grasas);
        System.out.println("Calorias:                                                                           " + calorias);
        if(proteinas > carbohidratos & carbohidratos > grasas)
        {
            System.out.println("Componente/s mayoritario/s:                                                         Proteinas"      );
        }
        else
        {
            if(carbohidratos > proteinas & proteinas > grasas)
            {
               System.out.println("Componente/s mayoritario/s:                                                      Carbohidratos"      ); 
            }
            else
            {
                if(grasas > proteinas & proteinas > carbohidratos)
                {
                    System.out.println("Componente/s mayoritario/s:                                                 Grasas"      );
                }
                else
                {
                    if(proteinas == carbohidratos & carbohidratos == grasas)
                    {
                        System.out.println("Componente/s mayoritario/s:                                             Proteinas, carbohidratos y grasas"      );
                    }
                    else
                    {
                        if(proteinas == carbohidratos)
                        {
                            System.out.println("Componente/s mayoritario/s:                                         Proteinas y carbohidratos"      );
                        }
                        else
                        {
                            if(proteinas == grasas)
                            {
                                System.out.println("Componente/s mayoritario/s:                                     Proteinas y grasas"      );
                            }
                            else
                            {
                                System.out.println("Componente/s mayoritario/s:                                     Carbohidratos y grasas"      );
                            }
                        }
                    }
                }
            }
        
        }
    }
}
    
    



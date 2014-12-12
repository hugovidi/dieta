
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // Este atributo hace referencia al nombre del usuario
    private String nombre;
    // Este atributo hace referencia a la cantidad que se ha ingerido de ese alimento
    private float gramos;
    // Este atributo hace refencia a las proteinas
    private float proteinas;
    // Este atributo hace refencia a las ccarbohidratos
    private float carbohidratos;
    // Este atributo hace refencia a las grasas
    private float grasas;
    // Este atributo hace refencia a las calorias
    private float calorias;

    /**
     * Constructor del objetos de la clase usuario
     */
    public Usuario(String nombre,float gramos)
    {
        this.nombre = nombre;
    }
    
    
    /**
     * Metodo comer el cual simula que el usuario ingiere alimentos
     */
    public void comer(Alimento nombre, float gramos)

     {  float proteinas = 0.0f;
        float carbohidratos = 0.0f;
        float grasas = 0.0f;
        float calorias = 0.0f;
        proteinas = nombre.getProteinas() / 100 * gramos ;
        carbohidratos = nombre.getCarbohidratos() / 100 * gramos ;
        grasas = nombre.getGrasas() / 100 * gramos ;
        calorias = nombre.getCalorias() / 100 * gramos ;
    }

    /**
     * Metodo que imprime por pantallo los datos del usuario
     */
    public void mostrarDatos()
    {
        System.out.println("Nombre:                                                                             " + nombre);
        System.out.println("Gramos de proteinas ingeridos:                                                      " + proteinas);
        System.out.println("Gramos de carbohidratos ingeridos:                                                  " + carbohidratos);
        System.out.println("Gramos de grasas ingeridos:                                                         " + grasas );
        System.out.println("Calorias ingeridos:                                                                 " + calorias );
    }
    
    public float getPorcentajeProteinas()
    {
        float total = proteinas + grasas + carbohidratos;
        float prot = proteinas * total / 100;
        return prot;
    }
    
    public float getPorcentajeCarbohidratos()
    {
       float total = proteinas + grasas + carbohidratos;
       float carb = carbohidratos * total / 100;
       return carb;
    }
    
    public float getPorcentajeGrasas()
    {
        float total = proteinas + grasas + carbohidratos;
        float gras = grasas * total / 100;
        return gras;
        
    }
    
    /**
     * Metodo que imprime por pantallo los datos del usuario
     */
    public void mostrarDatosPorcentaje()
    {
        System.out.println("Nombre:                                                                             " + nombre);
        System.out.println("Gramos de proteinas ingeridos:                                                      " + getPorcentajeProteinas() + "%");
        System.out.println("Gramos de carbohidratos ingeridos:                                                  " + getPorcentajeCarbohidratos() + "%");
        System.out.println("Gramos de grasas ingeridos:                                                         " + getPorcentajeGrasas() + "%" );
        System.out.println("Calorias ingeridos:                                                                 " + calorias );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

/**
 *
 * @author development
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte entero;
        
        entero = 12;
        entero = 8;
         
        short enteroShort = -32766; // 16bits
        
        int enteroInt = -2132121321; //32 bits
                
        long enteroLong = -4564564555455464566L; // Important* the capital L
        
        double decimalDouble = 44564564578978978978978978978987987987987897987987987987987564564564654654654656546546546546546544654654654654654654654654654654654654654654546464646545645654654654654654654654654654656545646546546546546546546546546464654654654654654654654654654654654654654564654654654654654646546465465464646546546578789789.64; // 64bits
        float decimalFloat = 44564564565454645645465456645645646466.32f; // Important* The char F // 32 bits
                
        System.out.println(entero);
        System.out.println(enteroShort);
        System.out.println(enteroInt);
        System.out.println(enteroLong);
        
        System.out.println("double " + decimalDouble);
        System.out.println("float " + decimalFloat);
        
        char caracter;
        
        caracter = 'C'; // Simple quotes to define a char
        
        String cadena = "tia"; // Double quotes
        
        Boolean condicion = false;
        
        if(!condicion){
            System.out.println("condicion es: " + condicion);
        }
        
        //int primitivo = null; *Primitives types can store null
        
        // Integer is a no primitive data type
        Integer numero = null; // Can store null because si not primitive
        numero = 5;
        // En los datos no primitivo puedes aplicar metodos
        System.out.println(numero.byteValue());
        
        // String
        
        String palabra = "Hola que tal";
        
       
        
        
    }
    
}

package boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {
       Libro unLibro = new Libro();
       unLibro.setAutor("Jesus");
       unLibro.setAno(2003);
       unLibro.setPaginas((short)452);
       unLibro.setTitulo("El mundo en caos");
       unLibro.setValoracion(10);
       unLibro.amosar();
       
       Libro otroLibro = new Libro("Pablo","Las aventuras", 2020, (short)30);
       otroLibro.setValoracion(10);
       otroLibro.setAno(2022);
       otroLibro.amosar();
      
       
       Libro usuarioLibro = new Libro();
       Scanner sc = new Scanner(System.in);
        System.out.println("Dime un autor, luego un titulo, luego un año, luego el numPaginas y por ultimo la valoracion");
       String autor = sc.next();
       String titulo = sc.next();
       int año = sc.nextInt();
       short paginas = sc.nextShort();
       float valoracion = sc.nextFloat();
       
       //Podria modificar los sets para que cuando se hace pida al usuario el valor pero CREO que no es lo que se busca.
       
       usuarioLibro.setAutor(autor);
       usuarioLibro.setTitulo(titulo);
       usuarioLibro.setAno(año);
       usuarioLibro.setPaginas(paginas);
       usuarioLibro.setValoracion(valoracion);
       usuarioLibro.amosar();
        
       
       
    }
    
}

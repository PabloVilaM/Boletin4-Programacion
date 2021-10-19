package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
       Libro unLibro = new Libro();
       unLibro.setAutor("Lucas");
       unLibro.setAno(2003);
       unLibro.setPaginas((short)452);
       unLibro.setTitulo("El mundo en caos");
       unLibro.setValoracion(10);
       unLibro.amosar();
       
       Libro otroLibro = new Libro("Pablo","Las aventuras de Garus", 2020, (short)30);
       otroLibro.setValoracion(10);
       otroLibro.setAno(2022);
       otroLibro.amosar();
       
    }
    
}

package boletin4;

public class Libro {
    
    //Atributos
    private String autor;
    private String titulo;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //Constructores
    public Libro(){
    }
    
    public Libro(String autor, String titu, int a, short nump){
        this.autor = autor;
        titulo = titu;
        ano = a;
        numPaginas = nump;
    }
    
    //Metodos de acceso
    
    public void setAutor(String au){
        autor = au;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setTitulo(String ti){
        titulo = ti;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAno(int an){
        ano = an;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setPaginas(short pa){
        numPaginas = pa;
    }
    
    public short getPaginas(){
        return numPaginas;
    }
    
    public void setValoracion (float va){
        valoracion = va;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    
    public void amosar(){
        System.out.println("El libro fue escrito por : " + autor + "\n con título : " + titulo + "\n en el ano : " + ano + "\n compuesto por las siguientes paginas : " + numPaginas +"\n y teniendo la siguiente valoracion : " + valoracion);
    }
    //En un principio no uso los gets, pero me es util para repasar
}

public class videoJuego {
    public double precio;
    public String titulo ; 
    public String genero ;    
    public videoJuego(String titulo,String
            genero,double precio)
    {
        this.genero = genero;
        this.precio = precio ; 
        this.titulo = titulo ; 
    }
    public Object [] Mostrar ()
    {
        return new Object[] {titulo,genero,precio};
    }
    public double calcularigv()
    {
        return precio+(precio * 0.18);
    }
    public double calcularigv(double igv)
    {
        return precio +(precio*(igv/100));
    }
    
    public double calcularDescuento(double descuento)
    {
        return precio - (precio * (descuento / 100));
    }   
}

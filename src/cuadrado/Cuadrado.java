package cuadrado;


public class Cuadrado {
    
      
    int alto;
    int ancho;
    
    public Cuadrado(int alto, int ancho) {
        
        this.alto = alto;
        this.ancho = ancho;
    }
    
    public void setAlto(int alto) {
        
        this.alto = alto;
    }
   
    public void setAncho(int ancho) {
        
        this.ancho = ancho;
    }
   
    public int getAlto() {
        
        return alto;
    }
   
    public int getAncho() {
        
        return ancho;
    }
   
    public int getArea(){
        
        int area = getAlto()*getAncho();
        return area;
    }
  
    public int getPerimetro(){
        
        int perimetro = getAlto()+getAncho();
        return perimetro;
    }
}

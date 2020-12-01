
public class Piramide {

	public Piramide(){
        
    }
    
    public double calcula_a1(double h, double ab){
        double c = ( Math.pow(h, 2) ) + ( Math.pow(ab, 2) );
        double a1 = Math.sqrt(c);
        return a1;
    }
    
    public double calculaLitros(double area){
        double litros = area / 4.76;
        return litros;
    }
    
    public int calculaLatas(double litros){
        int latas = (int) litros / 18;
        return latas + 1;
    }
    
    public double calculaVolume(double h, double areaB){
        return (areaB * h) / 3;
    }
    
}

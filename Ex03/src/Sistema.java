import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Piramide p = new Piramide();
        System.out.println("Informe a altura da piramide: ");
        double h = s.nextDouble();
        System.out.println("Indorme ab: ");
        double ab = s.nextDouble();
        
        double a1 = p.calcula_a1(h, ab);
        double largBase = ab * 2;
        double areaBase = largBase * largBase;
        double areaParede = (largBase * a1) / 2;
        double areaTotal = areaBase + (4 * areaParede);
        double t1 = 127.9;
        double t2 = 258.98;
        double t3 = 344.34;
        int lt = 18;
        double vol = p.calculaVolume(h, areaBase);
        
        double litros = p.calculaLitros(areaTotal);
        double latas = p.calculaLatas(litros);
        double preco = 0;
        
        System.out.println("Informe o tipo de tinta: 1, 2 ou 3: ");
        int tipo = s.nextInt();

        switch(tipo){
            case 1:{
                preco = latas * t1;
                break;
            }
            case 2:{
                preco = latas * 12;
                break;
            }
            case 3:{
                preco = latas * t3;
                break;
            }
            default:{
                System.out.println("Informe um tipo válido de tinta.");
            }
        }
        System.out.println("ab: " + ab);
        System.out.println("h: " + h);
        System.out.println("a1 : " + a1);
        System.out.println("Area da parede: " + areaParede);
        System.out.println("Area da base: " + areaBase);
        System.out.println("Area total: " + areaTotal);
        System.out.println("Tipo de tinta: " + tipo);
        System.out.println("Litros: " + litros);
        System.out.println("Latas: " + latas);
        System.out.println("Preço: " + preco);
        System.out.println("Volume da piramide: " + vol);
        
        s.close();
}
}

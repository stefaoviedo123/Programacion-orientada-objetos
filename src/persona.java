
import java.util.Scanner; 

public class persona {
	
	public void main(String[] arts) {
		
		Scanner data=new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.println("Digite su estatura");
		peso = data.nextDouble();
		
		System.out.println("Digite su Altura");
		altura = data.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("Su indice de masa corporal es: " + imc);		
		
		if(imc <= 18.5){
			System.out.println("Usted Se encuentra en bajo peso");
		}else if (imc >= 18.5 && imc <=24.5){
			
			System.out.println("Su indice de masa corporal se encuentra en los terminos normales");
		} else {
			System.out.println("Usted se encuentra con sobrepeso");
     }

}}
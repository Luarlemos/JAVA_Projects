package lanches;
import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;		
		
		System.out.println("Bem vindo(a) ao Lu's Gourmet !!!");
		System.out.println("Selecione o tipo de lanche: ");
		System.out.println("[1] Sanduíches  [2] Massas  [3] Bolos");
		opcao=teclado.nextInt();
		clearBuffer(teclado); //limpar o buffer do teclado
		if(opcao==1) {
			lanche=new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
		}
		else if(opcao==2) {
			lanche=new Massa();
			menuMassa((Massa) lanche);
		}
		else if(opcao==3) {
			lanche=new Bolo();
			menuBolo((Bolo) lanche);
		}
		
		System.out.println("Obrigado(a) pela preferência !!!");
	}
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes=new String[10];
		String ingrediente = "";
		int cont=0;
		int distancia;
		
		System.out.println("Você escolheu a opção sanduíches");
		System.out.println("Escolha até 10 ingredientes (Digite 0 para finalizar sua escolha)");
		cont=0;
		while(cont<10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[cont]=ingrediente;
			//System.out.println(ingredientes[cont]);
			cont++;
		}
		lanche.setIngredientes(ingredientes);
		if(cont<10) {
			cont=cont-1;	
		}
		
		System.out.println("Você escolheu "+cont+" ingredientes");
		//System.out.println(ingredientes[0]);
		System.out.println("Qual é a sua distância do restaurante em km? ");
		distancia=teclado.nextInt();
		clearBuffer(teclado); //limpar o buffer do teclado
		lanche.setPreco(cont);
		System.out.println("Seu pedido será de: R$"+lanche.getPreco());
		System.out.println("Seu pedido vai demorar "+lanche.calcularTempo(distancia)+" min para chegar ao destino final");
	}
	public static void menuMassa(Massa lanche) {
		int opcao2;
		int distancia;
		System.out.println("Você escolheu a opção massas");
		System.out.println("Selecione o tipo de massa: ");
		System.out.println("[1] Macarrão  [2] Pizza  [3] Lasanha");
		opcao2=teclado.nextInt();
		clearBuffer(teclado); //limpar o buffer do teclado
		if(opcao2==1) {
			lanche=new Macarrao();
		}
		else if(opcao2==2) {
			lanche=new Pizza();
		}
		else if(opcao2==3) {
			lanche=new Lasanha();
		}
		System.out.println("Qual molho você gostaria para massa escolhida? ");
		lanche.setMolho(teclado.nextLine());
		System.out.println("A Massa escolhida possui molho de "+lanche.getMolho());
		System.out.println("Qual é a sua distância do restaurante em km? ");
		distancia=teclado.nextInt();
		clearBuffer(teclado); //limpar o buffer do teclado
		System.out.println("Seu pedido será de: R$"+lanche.getPreco());
		System.out.println("Seu pedido vai demorar "+lanche.calcularTempo(distancia)+" min para chegar ao destino final");
	}
	public static void menuBolo(Bolo lanche) {
		int distancia;
		System.out.println("Você escolheu a opção bolos");
		System.out.println("Digite o sabor da Massa do bolo: ");
		lanche.setMassa(teclado.nextLine());
		System.out.println("Digite o sabor do Recheio do bolo: ");
		lanche.setRecheio(teclado.nextLine());
		System.out.println("Digite o sabor da Cobertura do bolo: ");
		lanche.setCobertura(teclado.nextLine());
		System.out.println("O bolo possui Massa de "+lanche.getMassa()+", Recheio de "+lanche.getRecheio()+" e Cobertura de "+lanche.getCobertura());
		System.out.println("Qual é a sua distância do restaurante em km? ");
		distancia=teclado.nextInt();
		clearBuffer(teclado); //limpar o buffer do teclado
		System.out.println("Seu pedido será de: R$"+lanche.getPreco());
		System.out.println("Seu pedido vai demorar "+lanche.calcularTempo(distancia)+" min para chegar ao destino final");
	}
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

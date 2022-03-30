package OrientaçãoAoObjeto;

public class ClienteExercicio {

	public static void main(String[] args) {

		Cliente c1 = new Cliente ();
		
		c1.nome = "Lucas Pereira";
		c1.idade = 30;
		c1.email = "Lucas123@gmail.com";
		
		c1.colocarIdade();
		c1.colocarEmail();
		c1.comprarProduto();
		
		System.out.println("Nome do cliente: " + c1.nome);
		System.out.println("Idade do cliente: " + c1.idade);
		System.out.println("E-mail do cliente: " + c1.email);
		}

}

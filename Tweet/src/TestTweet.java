import java.util.Scanner;

public class TestTweet extends Usuario{

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		Tweet tweet = new Tweet();
		usuario.setLogin("alex");
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("login:");
		String login = input.nextLine();
		System.out.println("senha:");
		String senha = input.nextLine();
		
		if((login.equalsIgnoreCase(login))&&(senha.equalsIgnoreCase(usuario.getSenha()))) {
			
			System.out.println("Acesso autorizado");
			
			System.out.println("Tweet:");
			tweet.setDescricao(input.nextLine());
			usuario.tweets.add(tweet);
			
			System.out.println("Deseja continuas S/N:");
			String resposta =input.nextLine();
			
			while(resposta.equalsIgnoreCase("S")) {
				System.out.println("Tweet:");
				tweet.setDescricao(input.nextLine());
				usuario.tweets.add(tweet);
				System.out.println("Deseja continuas S/N:");
				resposta =input.nextLine();
			}
			tweet.getDescricao();
			usuario.listar();
		}else {
			System.out.println("Senha incorreta");
		}

	}

}

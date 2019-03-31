import java.util.ArrayList;

public class Usuario {
	private String login;
	private String senha;
	public ArrayList<Tweet> tweets;
	
	
	//construtor
	public Usuario() {
		this.senha = "OOP";
		this.tweets = new ArrayList<>();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void listar() {
		System.out.println("Login:"+ this.login);
		for(int i=0; i< this.tweets.size();i++) {
		System.out.println("Tweet :"+this.tweets.get(i).getDescricao());
		
	}}
	
}

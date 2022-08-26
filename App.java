/*Criar uma API que traga os nomes dos melhores filmes, suas respectivas notas e suas imagens identificadoras contidos no site do IMDB*/
/*Importando packages que irão nos auxilixar no momento de conexão HTTPS*/

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;

import java.util.List;
import java.util.Map;

public class App
{
	public static void main(String args[]) throws Exception
	{
		/*1º Passo fazer uma conexão https e buscar os filmes*/
		
		String resposta_https = "https://alura-filmes.herokuapp.com/conteudos";// Criei uma variavel String que recebe a hhtp onde se encontra o JSON
		URI endereco = URI.create(resposta_https);//Criado um novo URI 'ID de URL' que recebe como parametro a url
		
		/* Pode utilizar 'var cliente = HttpClient.newHttpClient();' para reduzir repetição de código */
		HttpClient cliente = HttpClient.newHttpClient();//Solicitação para envio de requisição
		HttpRequest requisicao = HttpRequest.newBuilder(endereco).GET().build();//Traz a requisição 
		HttpResponse<String> response = cliente.send(requisicao, BodyHandlers.ofString());//Envia a requisição e manipula o body para o tipo string
		String body = response.body();//String recebe o body manipulado para o tipo convertido
		
		/*2º Passo selecionar e extrair os dados necessários(título, notas e imagens)*/
		var parser = new JsonParser();
		List<Map<String, String>> listaDeFilmes = parser.parse(body);/*Associar uma chave com o valor <Tipo da chave, tipo do valor da chave> */
		System.out.println("*****LISTA MELHORES "+listaDeFilmes.size()+" FILMES*****");
		System.out.println();
		
		/*Manipular e exibir isso*/
		for (Map<String, String> map : listaDeFilmes) 
		{
			System.out.println("Filme: "+map.get("title"));
			System.out.println("Ranking: "+map.get("rank"));
			System.out.println("Poster: "+map.get("image"));
			System.out.println("Avaliação: "+map.get("imDbRating"));
			System.out.println();
		}
	}
}



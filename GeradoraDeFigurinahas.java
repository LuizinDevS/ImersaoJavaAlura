import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class GeradoraDeFigurinahas 
{
	public void cria() throws Exception
	{
		//Ler a imagem 
		BufferedImage imagemOriginal = ImageIO.read(new File("entrada/file/TheGodFather.jpg"));
		
		//Criar nova imagem em memória com transparência
		int largura = imagemOriginal.getWidth();/*Variavel que recebe largura da imagemOriginal*/
		int altura = imagemOriginal.getHeight();/*Variavel que recebe altura da imagemOriginal*/
		int novaAltura = altura + 200;//Nova variavel que recebe a altura original do arquivo + 200 pixels de altura
		BufferedImage novaImagem = new BufferedImage(largura, altura, novaAltura);//novaImagem é do tipo BufferedImage e o novo Buffer de imagem recebe:
																				  //largura e altura original + nova altura 
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();//graphics recebe os graficos que trouxemos da novaImagem
		
		//Escrever uma frase na nova imagem
		
		//Escrever a nova imagem em um arquivo
	}
}
/*		{"id":"tt0068646","rank":"2","title":"The Godfather","fullTitle":"The Godfather (1972)","year":"1972",
"image":"https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,1,128,176_AL_.jpg",
"crew":"Francis Ford Coppola (dir.), Marlon Brando, Al Pacino","imDbRating":"9.2","imDbRatingCount":"1785900"}		*/
package practice;
import java.io.*;
import java.net.*;
import java.util.*;


public class FirstJavaProject {
	public static void main(String []args) throws IOException{
			URL url = new URL("http://vernonfm.org/playingnow.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = null;
			List firstSong = null;
			List songList = null;
			int x = 0;
			int l = 0;
			String currentSong = null;
			
			for(int i = 0; i < 10; ++i)
				inputLine = in.readLine();
				songList.add(1 , inputLine);
				l += 1;
			/*while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
				songList.add(x, inputLine);
				x += 1;
			in.close();	*/	
			System.out.println(songList);
			//List<String> splitList = Arrays.asList(songList.split(","));
			//firstSong = split(songList);
			//currentSong = (String) firstSong.get(0);
			//System.out.println(currentSong);
	}

	private static List split(String songList) {
		// TODO Auto-generated method stub
		return null;
	}
}

package BTTournaments.BTPlayer;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс - ресурс для хранения игроков
 */

public class BTPlayerStoreSourceFile implements IBTPlayerStoreSource {
    private File file;

    public boolean isEmpty(){
        return file == null;
    }

    public BTPlayerStoreSourceFile(String fileName){
        file = new File(fileName);
    }


    public void saveBTPlayer(IBTPlayer btPlayer) {
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.print(btPlayer.getFirstName());
            pw.printf("\r\n");
            pw.print(btPlayer.getLastName());
            pw.printf("\r\n");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadBTPlayer(int playerID, IBTPlayer player){
        if(file.exists()){
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                player.setFirstName(br.readLine());
                player.setLastName(br.readLine());
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<IBTPlayer> loadAllBTPlayers(){

        return new ArrayList<IBTPlayer>();
    }

    public void updatePlayer(int playerID, IBTPlayer btPlayer){

    }
}

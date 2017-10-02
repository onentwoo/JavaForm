import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by yomtovn on 10/2/2017.
 */
class Simple{
    public static void main(String args[]) throws IOException {
        System.out.println("Insert credentials:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String u = br.readLine();
        String p = br.readLine();
        System.out.println("Insert password:");
        UserDetails details = new UserDetails(u,p);



    }
}
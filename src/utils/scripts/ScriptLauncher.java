package utils.scripts;

import utils.scripts.Scripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class ScriptLauncher {

    // scriptLauncher(Scripts.PLAY_PAUSE.getCommand());

    public static void scriptLauncher(String command){

        try {
            ProcessBuilder pb = new ProcessBuilder("osascript","-e",command);
            pb.directory(new File("/usr/bin"));
            System.out.println(command);
            StringBuffer output = new StringBuffer();
            Process p = pb.start();
            p.waitFor();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine())!= null) {
                output.append(line + "\n");
            }
            // print command:
            // System.out.println(output);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void setMasterVolume(int vol) {
        //proporzione: il massimo e' 7.0f
        float value = (vol*7.0f)/100;
        String command = Scripts.set_volume + value;
        scriptLauncher(command);
    }

}

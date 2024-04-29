package scripts;

import utils.Constants;

public class Scripts {


    public final static String mute_unmute = "set curVolume to get volume settings\n" +
            "if output muted of curVolume is false then\n" +
            "\tset volume with output muted\n" +
            "else\n" +
            "\tset volume without output muted\n" +
            "end if";


    // example: "set volume output volume 20"
    public final static String increase_volume_by_5 =
            "set vol to output volume of (get volume settings)\n" +
            "set vol to vol +" + Constants.volumeStep + "\n" +
            "set volume output volume vol";

    public final static String decrease_volume_by_5 =
            "set vol to output volume of (get volume settings)\n" +
                    "set vol to vol - "+Constants.volumeStep + "\n" +
                    "set volume output volume vol";
    
}

package utils.scripts;

public class Scripts {


    public final static String mute_unmute = "set curVolume to get volume settings\n" +
            "if output muted of curVolume is false then\n" +
            "\tset volume with output muted\n" +
            "else\n" +
            "\tset volume without output muted\n" +
            "end if";

    public final static String set_volume = "set volume ";

}

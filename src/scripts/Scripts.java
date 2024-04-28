package scripts;

public class Scripts {


    public final static String mute_unmute = "set curVolume to get volume settings\n" +
            "if output muted of curVolume is false then\n" +
            "\tset volume with output muted\n" +
            "else\n" +
            "\tset volume without output muted\n" +
            "end if";

    public final static String set_volume = "set volume ";

    public final static String copy = "on run\n" +
            "    tell application \"System Events\"\n" +
            "        keystroke \"c\" using command down\n" +
            "    end tell\n" +
            "\n" +
            "    tell application \"Finder\"\n" +
            "        set x to the clipboard\n" +
            "        set x to \"Today \" & x & \" a sunny day\"\n" +
            "        set the clipboard to x\n" +
            "    end tell\n" +
            "\n" +
            "    tell application \"System Events\"\n" +
            "        keystroke \"v\" using command down\n" +
            "    end tell\n" +
            "end run";
}

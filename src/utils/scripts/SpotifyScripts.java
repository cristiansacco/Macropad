package utils.scripts;

public class SpotifyScripts {

    public final static String activate_spotify = "activate application \"Spotify\"";

    public final static String spotify_play_pause = "using terms from application \"Spotify\"\n" +
            "\ttell application \"Spotify\" to playpause\n" +
            "end using terms from";

    public final static String spotify_nextTrack = "tell application \"Spotify\"\n" +
            "\tnext track\n" +
            "end tell";




}

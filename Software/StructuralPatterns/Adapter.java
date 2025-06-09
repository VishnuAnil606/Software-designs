interface MediaPlayer {
    void play(String fileName);
}

class AudioPlayer implements MediaPlayer {
    public void play(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}

class VideoPlayer {
    void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}

class VideoAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer = new VideoPlayer();

    public void play(String fileName) {
        videoPlayer.playVideo(fileName);
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        MediaPlayer video = new VideoAdapter();

        audio.play("song.mp3");
        video.play("movie.mp4");
    }
}
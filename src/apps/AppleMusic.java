package apps;

import system.AudioPlayer;

public class AppleMusic implements AudioPlayer {
    private String audio;
    private int audioLength;
    private int audioPosition;
    private int volume;
    private boolean isMuted;
    private boolean isPaused;
    private boolean isShuffled;
    private boolean isRepeated;
    private Song[] playlist;
    private int currentSong;
    private int totalSongs;

    private class Song {
        private String name;
        private String artist;
        private String album;
        private int duration;

        public Song(String name, String artist, String album, int duration) {
            this.name = name;
            this.artist = artist;
            this.album = album;
            this.duration = duration;
        }

        public Song() {
            this.name = "Música";
            this.artist = "Artista";
            this.album = "Álbum";
            this.duration = 0;
        }
    }

    public AppleMusic() {
        System.out.println("Apple Music iniciado");
        this.playlist = new Song[10];
        this.currentSong = 0;
        this.totalSongs = 0;
        this.isPaused = false;
        this.isRepeated = false;
        this.isShuffled = false;

        this.playlist[0] = new Song("Música 1", "Artista 1", "Álbum 1", 180);
        this.playlist[1] = new Song("Música 2", "Artista 2", "Álbum 2", 200);
        this.playlist[2] = new Song("Música 3", "Artista 3", "Álbum 3", 220);
        this.playlist[3] = new Song("Música 4", "Artista 4", "Álbum 4", 240);
        this.playlist[4] = new Song("Música 5", "Artista 5", "Álbum 5", 260);
        this.playlist[5] = new Song("Música 6", "Artista 6", "Álbum 6", 280);
        this.playlist[6] = new Song("Música 7", "Artista 7", "Álbum 7", 300);
        this.playlist[7] = new Song("Música 8", "Artista 8", "Álbum 8", 320);
        this.playlist[8] = new Song("Música 9", "Artista 9", "Álbum 9", 340);
        this.playlist[9] = new Song("Música 10", "Artista 10", "Álbum 10", 360);

        this.totalSongs = 10;
        this.currentSong = 0;
        this.audio = this.playlist[this.currentSong].name;
    }

    @Override
    public void play(String audio) {
        this.audio = audio;
        this.audioPosition = 0;
        this.isPaused = false;

        System.out.println("Tocando " + playlist + " no Apple Music");
    }

    public void playPlaylist() {
        while (this.currentSong < this.totalSongs) {
            this.play(this.playlist[this.currentSong].name);
            this.audioLength = this.playlist[this.currentSong].duration;
            this.audioPosition = 0;
            this.isPaused = false;
            this.currentSong++;
        }
    }

    @Override
    public void pause() {
        this.isPaused = false;

        System.out.println("Música pausada");
    }

    @Override
    public void stop() {
        this.audio = null;
        this.isPaused = false;
        this.isRepeated = false;
        this.isShuffled = false;

        System.out.println("Música parada");
    }

    @Override
    public void next() {
        if (this.currentSong < this.totalSongs - 1) {
            this.play(this.playlist[++this.currentSong].name);
        } else {
            this.currentSong = 0;
            this.play(this.playlist[this.currentSong].name);
        }

        System.out.println("Tocando próxima música");
    }

    @Override
    public void previous() {
        if (this.currentSong > 0) {
            this.play(this.playlist[--this.currentSong].name);
        } else {
            this.currentSong = this.totalSongs - 1;
            if (this.currentSong >= 0) {
                this.play(this.playlist[this.currentSong].name);
            }
        }

        System.out.println("Tocando música anterior");
    }

    @Override
    public void forward() {
        if (this.audioPosition <= this.audioLength - 10) {
            this.audioPosition += 10;
        } else {
            this.next();
        }

        System.out.println("Avançar");
    }

    @Override
    public void rewind() {
        if (this.audioPosition >= 10) {
            this.audioPosition -= 10;
        } else {
            this.previous();
        }

        System.out.println("Retroceder");
    }

    @Override
    public void repeat() {
        this.isRepeated = !this.isRepeated;

        System.out.println("Repetir música");
    }

    @Override
    public void shuffle() {
        this.isShuffled = !this.isShuffled;
        for (int i = 0; i < this.totalSongs; i++) {
            int randomIndex = (int) (Math.random() * this.totalSongs);
            Song temp = this.playlist[i];
            this.playlist[i] = this.playlist[randomIndex];
            this.playlist[randomIndex] = temp;
        }

        System.out.println("Aleatório");
    }

    @Override
    public void volumeUp() {
        this.volume += 2;

        System.out.println("Aumentando volume");
    }

    @Override
    public void volumeDown() {
        this.volume -= 2;

        System.out.println("Diminuindo volume");
    }

    @Override
    public void mute() {
        this.isMuted = true;

        System.out.println("Aúdio mutado");
    }

    @Override
    public void unmute() {
        this.isMuted = false;

        System.out.println("Áudio desmutado");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;

        System.out.println("Volume definido em " + volume);
    }

    public void openApp() {
        this.totalSongs = this.playlist.length;
        this.currentSong = 0;
        this.volume = 20;

        System.out.println("Aplicativo Apple Music aberto");
    }

    public void closeApp() {
        this.totalSongs = 0;
        this.currentSong = 0;
        this.volume = 0;

        System.out.println("Aplicativo Apple Music fechado");
    }

    public void showPlaylist() {
        System.out.println("Exibindo playlist");

        System.out.println("Playlist");
        for (int i = 0; i < this.totalSongs; i++) {
            System.out.println(i + 1 + ". " + this.playlist[i]);
        }

    }

    public void showSettings() {
        System.out.println("Exibindo configurações");

        System.out.println("Configurações");
        System.out.println("Volume: " + this.volume);
        System.out.println("Repetir: " + (this.isRepeated ? "Sim" : "Não"));
        System.out.println("Aleatório: " + (this.isShuffled ? "Sim" : "Não"));
        System.out.println("Mudo: " + (this.isMuted ? "Sim" : "Não"));
        System.out.println("Pausado: " + (this.isPaused ? "Sim" : "Não"));
        System.out.println("Música atual: " + this.audio);
        System.out.println("Playlist: ");
        this.showPlaylist();
    }
}

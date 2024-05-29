# Desafio Java Poo - iPhone

## Descrição
De acordo com o que foi exibido no vídeo de lançamento do iPhone, o desafio era criar uma diagramação e as classes de java que representassem o iPhone, seus apps e funcionalidades.

Foram criados ao todo 3 aplicativos:
- Dialer
- Safari
- AppleMusic

## Diagramação

```mermaid
classDiagram
    class FileManager {
      +openFile(String path) : file
      +closeFile(String path) : void
      +readFromFile(String path) : String
      +writeToFile(String path, String content) : void
      +deleteFile(String path) : void
      +copyFile(String sourcePath, String destinationPath) : void
      +moveFile(String sourcePath, String destinationPath) : void
      +renameFile(String path, String newName) : void
      +findFile(String path, String name) : String
    }

    class InternetBrowser {
        +browse() : void
        +search(String query)
        +setUrl(String url)
    }

    class Safari {
        - String url
        - String query
        - int[] tabs
        - int activeTab
        - String homePage

        +openNewTab()
        +closeTab()
        +switchTab()
        +setHomePage(String url)
    }

    InternetBrowser <|-- Safari

    class Dial {
        +call(String number) : void
        +answer() : void
        +reject() : void
        +end() : void
        +callHistory() : void
        +switchMute() : void
        +switchSpeaker() : void
        +voiceMail() : void
    }

    class ContactList {
        +addContact(String name, String number) : void
        +removeContact(String name) : void
        +updateContact(String name, String number) : void
        +searchContact(String name) : void
        +listContacts() : void
        +callContact(String name) : void
        +messageContact(String name, String message) : void
        +blockContact(String name) : void
    }

    class Dialer {
        - String number;
        - String status;
        - String duration;
        - String date;

    }

    Dial <|-- Dialer
    ContactList <|-- Dialer

    class AudioPlayer {
        +play(String audio) : void
        +pause() : void
        +stop() : void
        +next() : void
        +previous() : void
        +forward() : void
        +rewind() : void
        +repeat() : void
        +shuffle() : void
        +volumeUp() : void
        +volumeDown() : void
        +mute() : void
        +unmute() : void
        +setVolume(int volume) : void
    }


    class Song {
        - String name;
        - String artist;
        - String album;
        - int duration;

    }

    class AppleMusic {
        - String audio;
        - int audioLength;
        - int audioPosition;
        - int volume;
        - boolean isMuted;
        - boolean isPaused;
        - boolean isShuffled;
        - boolean isRepeated;
        - Song[] playlist : Song
        - int currentSong;
        - int totalSongs;

        +playPlaylist(String playlist)
        +openApp()
        +closeApp()
        +showPlaylist()
        +showSettings()
    }

    AudioPlayer <|-- AppleMusic



    class iPhone {
        - AppleMusic appleMusic
        - Safari safari
        - Dialer dialer
        - FileManager fileManager

        + openApp(String app)
        + closeApp(String app)
    }

    iPhone *-- Dialer
    iPhone *-- Safari
    iPhone *-- AppleMusic
    iPhone *-- FileManager



```


package system;

public interface Dial {

    void call(String number);

    void answer();

    void reject();

    void end();

    void callHistory();

    void switchMute();

    void switchSpeaker();

    void voiceMail();
}

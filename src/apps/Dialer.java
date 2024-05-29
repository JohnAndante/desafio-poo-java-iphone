package apps;

import system.Dial;

public class Dialer implements Dial {
    private String numberDialing;
    private String voiceMailNumber;
    private boolean isMute;
    private boolean isSpeakerOn;
    private Call[] history = new Call[10];

    private class Call {
        private String number;
        private String status;
        private String duration;
        private String date;

        public Call() {
            this.date = new java.util.Date().toString();
        }
    }

    private Call[] callHistory;

    public void call(String number) {
        this.numberDialing = number;
        Call call = new Call();
        call.number = number;
        call.status = "Chamando";
        call.duration = "00:00";

        System.out.println("Chamando " + number);
    }

    @Override
    public void answer() {
        Call call = new Call();
        call.number = this.numberDialing;
        call.status = "Atendida";
        call.duration = "00:00";

        System.out.println("Atendendo chamada de " + this.numberDialing);
    }

    @Override
    public void reject() {
        Call call = new Call();
        call.number = this.numberDialing;
        call.status = "Rejeitada";
        call.duration = "00:00";

        System.out.println("Rejeitando chamada de " + this.numberDialing);

    }

    @Override
    public void end() {
        Call call = new Call();
        call.number = this.numberDialing;
        call.status = "Encerrada";
        call.duration = "01:30";

        System.out.println("Encerrando chamada de " + call.number);

    }

    @Override
    public void callHistory() {
        System.out.println("Histórico de chamadas");

        for (Call call : this.history) {
            if (call != null) {
                System.out.println("Número: " + call.number);
                System.out.println("Status: " + call.status);
                System.out.println("Duração: " + call.duration);
                System.out.println("Data: " + call.date);
            }
        }
    }

    @Override
    public void voiceMail() {
        System.out.println("Caixa postal");

        this.call(this.voiceMailNumber);
    }

    @Override
    public void switchMute() {
        this.isMute = !this.isMute;
        System.out.println("Mudo " + (this.isMute ? "ativado" : "desativado"));
    }

    @Override
    public void switchSpeaker() {
        this.isSpeakerOn = !this.isSpeakerOn;
        System.out.println("Alto-falante " + (this.isSpeakerOn ? "ativado" : "desativado"));
    }

}

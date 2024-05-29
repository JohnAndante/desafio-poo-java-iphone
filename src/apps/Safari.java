package apps;

import system.InternetBrowser;

public class Safari implements InternetBrowser {
    private String url;
    private String query;
    private int[] tabs;
    private int activeTab;
    private String homePage;

    public Safari() {
        System.out.println("Safari iniciado");
        this.tabs = new int[10];
        this.url = null;

        this.openNewTab();
    }

    @Override
    public void browse() {
        System.out.println("Navegando no Safari");

    }

    @Override
    public void search(String query) {
        this.query = query;
        this.url = "https://www.google.com/search?q=" + query;
        this.browse();

        System.out.println("Pesquisando por " + query + " no Safari");
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
        this.browse();

        System.out.println("URL definida para " + url);
    }

    public void openNewTab() {
        this.activeTab++;
        this.tabs[this.activeTab] = this.activeTab;

        this.url = this.homePage;
        System.out.println("Nova aba aberta");
    }

    public void closeTab() {
        this.tabs[this.activeTab] = 0;
        this.activeTab--;

        System.out.println("Aba fechada");
    }

    public void switchTab(int tabNumber) {
        this.activeTab = tabNumber;

        System.out.println("Alternando entre abas");
    }

    public void setHomePage(String url) {
        this.homePage = url;

        System.out.println("Página inicial definida para " + url);
    }

}

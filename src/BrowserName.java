import java.util.ArrayList;

public class BrowserName {
    private String browser;
    private ArrayList<Tabs> tabsArrayList;

    public BrowserName() {

        this.tabsArrayList = new ArrayList<Tabs>();
    }

    public ArrayList<Tabs> getTabsArrayList() {
        return tabsArrayList;
    }

    public void setTabsArrayList(ArrayList<Tabs> tabsArrayList) {
        this.tabsArrayList = tabsArrayList;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void addTabs(Tabs aTab){
        tabsArrayList.add(aTab);
    }
}

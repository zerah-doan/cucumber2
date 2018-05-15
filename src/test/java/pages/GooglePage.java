package pages;

public class GooglePage extends BasePage {
    public SearchFragment searchFragment;
    public ResultFragment resultFragment;

    public GooglePage() {
        this.searchFragment = new SearchFragment();
        this.resultFragment = new ResultFragment();
    }
}

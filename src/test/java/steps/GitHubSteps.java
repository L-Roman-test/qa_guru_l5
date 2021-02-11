package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GitHubSteps {

    @Step("Open repository")
    public void openGitHubRepository() {
        open("https://github.com/L-Roman-test/qa_guru_l5");
    }

    @Step("Open tab \"Issue\"")
    public void openIssueTab () {
        $("[data-content=Issues]").click();
    }

    @Step("Find issue by name {issueName}")
    public void checkIssue (String issueName) {
        $("#issue_1").shouldHave(text(issueName));
    }
}

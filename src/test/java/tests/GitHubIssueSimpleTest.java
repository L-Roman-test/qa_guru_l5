package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubIssueSimpleTest extends BaseTest {
    String issueName = "Homework Issue";

    @Test
    @DisplayName("Check github issue")
    public void gitHubIssueTest() {
        open("https://github.com/L-Roman-test/qa_guru_l5");
        $("[data-content=Issues]").click();
        $("#issue_1").shouldHave(text(issueName));
    }
}

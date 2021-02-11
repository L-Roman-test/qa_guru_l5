package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import settings.BaseTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitHubIssueWithLambdaTest extends BaseTest {
    String issueName = "Homework Issue";

    @Test
    @DisplayName("Check github issue")
    public void gitHubIssueTest() {
        step("Open repository", (step) -> {
            open("https://github.com/L-Roman-test/qa_guru_l5");
        });
       step("Open tab \"Issue\"", (step) -> {
           $("[data-content=Issues]").click();
       });
        step("Find issue by name {issueName}", (step) -> {
            $("#issue_1").shouldHave(text(issueName));
        });
    }
}

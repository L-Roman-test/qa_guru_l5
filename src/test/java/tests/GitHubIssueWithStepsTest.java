package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import settings.BaseTest;
import steps.GitHubSteps;

public class GitHubIssueWithStepsTest extends BaseTest {
    GitHubSteps steps = new GitHubSteps();
    String issueName = "Homework Issue";

    @Test
    @DisplayName("Check github issue")
    public void gitHubIssueTest() {
        steps.openGitHubRepository();
        steps.openIssueTab();
        steps.checkIssue(issueName);
    }
}

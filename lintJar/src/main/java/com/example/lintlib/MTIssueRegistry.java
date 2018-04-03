package com.example.lintlib;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import java.util.Arrays;
import java.util.List;

public class MTIssueRegistry extends IssueRegistry {
    @Override
    public synchronized List<Issue> getIssues() {
        System.out.println("==== MT lint start ====");
        return Arrays.asList(
                //IntentExtraKeyDetector.ISSUE,
                //FragmentArgumentsKeyDetector.ISSUE,
                LogDetector.ISSUE
        );
    }
}
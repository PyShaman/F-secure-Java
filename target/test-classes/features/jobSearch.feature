Feature: Job search

    Scenario: User is meant to navigate to Careers tab and search for specific job offer
        Given User is on main page
        When User navigates to Careers page
        Then User is on Careers page
        When User clicks on See our positions button
        Then User is navigated to list of all jobs
        When User selects Poznan from drop down menu
        Then Job list is filtered to the one city
        When User search for Software Engineer in Tests
        And Clicks on View job
        Then new browser tab with Quality Engineer job details opens
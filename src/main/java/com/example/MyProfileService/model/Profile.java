package com.example.MyProfileService.model;

public class Profile {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final int yearsOfExperience;
    private final String companyName;
    private final String designation;
    private final String githubID;
    private final String linkedInID;
    private final String twitterID;
    private final String instagramID;
    private final String portfolioWebsite;

    public Profile(String firstName, String lastName, String email, String phoneNumber, int yearsOfExperience, String companyName, String designation, String githubID, String linkedInID, String twitterID, String instagramID, String portfolioWebsite) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.companyName = companyName;
        this.designation = designation;
        this.githubID = githubID;
        this.linkedInID = linkedInID;
        this.twitterID = twitterID;
        this.instagramID = instagramID;
        this.portfolioWebsite = portfolioWebsite;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGithubID() {
        return githubID;
    }

    public String getLinkedInID() {
        return linkedInID;
    }

    public String getTwitterID() {
        return twitterID;
    }

    public String getInstagramID() {
        return instagramID;
    }

    public String getPortfolioWebsite() {
        return portfolioWebsite;
    }
}

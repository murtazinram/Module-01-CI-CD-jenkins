# jenkins-task

**Module 01 - CI CD**

_Course Links_ 

•	Jenkins Essential Training - https://learn.epam.com/detailsPage?id=b22370a3-e602-48eb-b951-fc668b67f584 

•	Continuous Integration: Tools - https://learn.epam.com/detailsPage?id=379ac5a0-cffb-4b5b-b040-c3e8933e8f31 

**Books** 

•	Jenkins: The Definitive Guide, John Smart 

•	Git in Practice, by Mike McQuaid

Additional links 

•	Jenkins tutorial 

•	[RU] Jenkins CI and CD video 

•	https://www.atlassian.com/git/tutorials/advanced-overview 

**[Home Task]** 
_CI/CD using Jenkins_

    2.1 Setup Jenkins locally 
    2.2 For CI/CD you should use project from build tools home work 
    2.3 Use names for job described in brackets (name: $nameOfJob) 
    2.4 Create build job (name: release) - 0.5 points
        2.4.1 Should build when SCM has changes 
        2.4.2 Job should be parameterized with maven or grade (user should be able to choose it in job parameter) 
        2.4.3 Use promotion plugin. Should be available two promo stars 
            2.4.3.1 First stars should be applied automatically to successful build (QA) 
            2.4.3.2 Second stars should be applied manually (Prod) 
    2.5 Create continuous Job (name: continuous) - 0.5 points 
        2.5.1 Should build every night at 2:00 AM 
    2.6 Create Deploy Job (name: deploy) - 0.5 points 
        2.6.1 Should be parameterized with artifacts prompted with QA star 
        2.6.2 Use Container Deploy plugin 

    1. Extra mile: 1 point  
        1.1 Git hooks 
            1.1.1 Specify template of commit message and provide it for developer. 
            1.1.2 Check that build of new version is successful before committing changes. 
            1.1.3 Before pushing change to remote repository – check that there are no uncommitted changes. 
        1.2 Copy task folder to brand new repository with saving git history 
    2. Extra mile: 1 point 
        2.1. Customize version generation in following way 
            2.1.1. Running Build job should increment minorVersion in GIT after successful build. 
            2.1.2. Use Git tags for each version. 
            2.1.3. Configure job to check if version should be incremented (e.g. changes in source/test code presented after last increment) 
            2.2. Send email notification about failed builds/deploys to you and your mentor. Email notification should have a link to this failed Jenkins job; 

# User Profile Service
To join the community Real Dev Squad, follow the instructions below and you will get the Discord Invite Link to join the server.

## What are you building?
Profile Service is your own service which will contain all the data of yours which will be used for building your profile in Real Dev Squad.
It will be linked to Real Dev Squad Service which is managing the changes of your Profile Service.

## Pre-requisites
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) or [Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2022-03/R/eclipse-inst-jre-win64.exe)
- [Git](https://git-scm.com/downloads)
- Account on [Heroku](https://signup.heroku.com/)
- [Postman](https://www.postman.com/)
- [JDK 11](https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html)

## Steps to Follow :

### Step 1:
Fork the Template Repository from top right corner
![image](https://user-images.githubusercontent.com/78433013/165909283-fc0793e4-b0c3-4bc5-8d95-e10eeab1bd07.png)

### Step 2:
Create a new fork, ensure that `Owner` is selected as your GitHub username and repository name can be named as : 
```
<YOUR_NAME>'s-profile-service

Example : rohan's-profile-service
``` 
![image](https://user-images.githubusercontent.com/78433013/165998794-0fb87f2a-7f49-45be-ac6e-01140f832409.png)

### Step 3:
Now when you have forked the repository. 
Clone the template repository using the below command in your command terminal
```
git clone https://github.com/rohan09-raj/profile-service
```

### Step 4:
Open the cloned repository in your local IDE (IntelliJ IDEA / Eclipse).

### Step 5:
Now that you have the code in your local. Next thing to do is: `Complete all the TODOs` present in the repository except one i.e. `Paste your Chaincode here`.
We will do this remaining part in `Step-15`. 

### Step 6:
Run the code locally using the following command:
```
mvn spring-boot:run
```

### Step 7:
After you have started your JAVA application running, go to Postman, ensure that you are logged in.
On Home page, you will be able to find `Send Request` button as shown below. Click on it
![image](https://user-images.githubusercontent.com/78433013/166111296-322fcaf3-3c3f-4cae-85cf-443f1ba66d79.png)

After clicking, a new tab will appear something like below
![image](https://user-images.githubusercontent.com/78433013/166111370-fa0edff7-bb72-4b19-acd5-dd573cb4fd33.png)
There is a field called `Enter Request URL`. Copy and paste the below URL
```
http://localhost:8080/health
```
Then, click on `Send` button
![image](https://user-images.githubusercontent.com/78433013/166111448-44d7a061-0d18-4786-9a4d-e8b3f30e8e07.png)

You will be able to see a response body `status: UP`
![image](https://user-images.githubusercontent.com/78433013/166111504-61195f9a-5ae3-41ce-b1d3-6a99a41a0744.png)

Wohooo!!!! 🥳 🎉 🎉 Congratulations you have tested your first API.

### Step 8:
Now, further test the remaining one API i.e. `/profile`. Now we will be changing the Request URL to:
```
http://localhost:8080/profile
```
![image](https://user-images.githubusercontent.com/78433013/166112104-37ab209f-9f42-4b54-b680-0088f67d7ac5.png)

Click on the `Send` button and you will get your own details that you have entered something like below.

![image](https://user-images.githubusercontent.com/78433013/166113586-713e1a76-efde-47d5-8426-372cf4a1ba7c.png)

### Step 9:
Great 🎉 🎉, you have tested your APIs successfully, now we need to host your service, so that you can verify your Real Dev Squad account.
You can host your service on any dynamic hosting platforms. We will be using `Heroku` here, so make sure to create an account on Heroku.

### Step 10:
Cool, now that you have created your account, and logged in you will see your Heroku account dashboard something like below.
![image](https://user-images.githubusercontent.com/78433013/172591791-017ab48a-1f85-4b2b-9cd9-66da30f6ac1e.png)

Click on `New` and you will see dropdown having two options i.e. `Create New App` and `Create New Pipeline`
![image](https://user-images.githubusercontent.com/78433013/172592073-19a8a831-551b-49b8-a18e-7b3019ec424c.png)

Click on `Create New App`

### Step 11:
Now, you will be directed to a new page where you have to create your new heroku app
![image](https://user-images.githubusercontent.com/78433013/172592488-920384c1-d144-462d-acf2-75c35cbebab5.png)

Enter the valid app name as per your choice, make sure you have entered a name relevant to the app and available on Heroku.
![image](https://user-images.githubusercontent.com/78433013/172592969-e4c810d5-8cf0-47e5-94a5-7fd442e523b8.png)

Then click on `Create App`.
Wohoo!! you have successfully created your Heroku app, now you have to deploy the code in your local to Heroku.

### Step 12:
Now you will seeing your deploy section of the Heroku app as below.
![image](https://user-images.githubusercontent.com/78433013/172593891-762a00e6-b78d-44f1-b560-480229903a31.png)

In the middle of the page, you will be able to see various deployment methods like Heroku Git or GitHub etc.
You can use either of them, mostly we use Heroku Git or GitHub one.

If you select `Heroku Git`, there will be instructions given just below the options to execute in your Terminal/Command Line Interface

Follow the instructions as per in the given order
![image](https://user-images.githubusercontent.com/78433013/172601479-d89232d7-2273-4148-8c69-e70e7569f15c.png)

After you have run this command `git push heroku master`
Wait for few minutes or seconds to get the deployment done
Awesome 🥳 🎉, your service is deployed and you can access your deployed service with the provided url by Heroku

### Step 13:
Now, comes the part where you will link your profile service with your Real Dev Squad account.
Go to [Real Dev Squad](https://www.realdevsquad.com/) website and click on `Sign In With GitHub` button in the navbar as shown below.
![image](https://user-images.githubusercontent.com/78433013/172817107-594451b4-eaeb-4997-8043-ece470218cbb.png)
Link your GitHub account, and complete the `SignUp` steps.
**Note** : Only for users who don't have an account on Real Dev Squad website or who haven't linked their GitHub account on Real Dev Squad website.
 
### Step 14:
Go to [My Site](https://my.realdevsquad.com/) or you can simply click the user greeting as shown below (this is after you have Signed In with your GitHub account)
![image](https://user-images.githubusercontent.com/78433013/172818612-d5adc735-ce31-49b3-a490-004fff9670b2.png)

Once you landed on my-site, you will have to go to [Identity](https://my.realdevsquad.com/identity) Tab (P.S. you can directly click on this hyperlink to get you to the desired page).

### Step 15:
You get to see something like the below form
![image](https://user-images.githubusercontent.com/78433013/172821914-024038d6-d886-4463-9e25-c4882b671261.png)
Click on `Generate Chaincode`, an alert will appear, click `OK` to generate the chaincode.
![image](https://user-images.githubusercontent.com/78433013/172822474-30441e6a-e0a8-4f9d-9e78-1edbb0906a3c.png)

Click on `Copy` to copy the chaincode and paste it where a `TODO` was left, mentioned in `Step-5` now when the changes are done. Check that everything looks good and all the TODOs are complete.
Run these commands in your terminal to push the code to your deployed service through the Heroku CLI
```git add .```
```git commit -am "<ENTER_YOUR_COMMIT_MESSAGE>"```
```git push heroku master ```
If you were using the second method of `GitHub` to deploy your service
```git add .```
```git commit -am "<ENTER_YOUR_COMMIT_MESSAGE>"```
If your branch name is `master` then use this
```git push origin master ```
Otherwise,
```git push origin <ENTER_YOUR_BRANCH_NAME> ```

### Step 16:
Now that you have pushed your code with the chaincode. Enter your deployed service URL here.
![image](https://user-images.githubusercontent.com/78433013/172825385-a4e9000c-c4c2-4a43-a541-558098bad442.png)
And click on `Save`.
After that `Check` the checkbox to ensure that you have done both the steps correctly.
Then, click on `Link Chaincode`. Woooh, now wait for few seconds or minutes to get your service verified by the Real Dev Squad service.
Once you are verified you will get to see a verification message that your verification is completed.
![image](https://user-images.githubusercontent.com/78433013/172826282-140d4b22-ae5f-4f11-93cf-289b40deff73.png)
Awesome, Congratulations 🥳 🎉 on becoming a user in Real Dev Squad and
### Welcome to Real Dev Squad 🥳 🎉
<A Quick Intro or some catchy line about Real Dev Squad>

**Note : ** If you are unable to verify your service or their are some errors that you get encountered. Please reach out to members of Real Dev Squad from [here](https://members.realdevsquad.com/) 

 







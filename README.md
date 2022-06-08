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
Now that you have the code in your local. Next thing to do is: `Complete all the TODOs` present in the repository.

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

### Step 9
Great 🎉 🎉, you have tested your APIs successfully, now we need to host your service, so that you can verify your Real Dev Squad account.
You can host your service on any dynamic hosting platforms. We will be using `Heroku` here, so make sure to create an account on Heroku.

### Step 10
Cool, now that you have created your account, and logged in you will see your Heroku account dashboard something like below.
![image](https://user-images.githubusercontent.com/78433013/172591791-017ab48a-1f85-4b2b-9cd9-66da30f6ac1e.png)

Click on `New` and you will see dropdown having two options i.e. `Create New App` and `Create New Pipeline`
![image](https://user-images.githubusercontent.com/78433013/172592073-19a8a831-551b-49b8-a18e-7b3019ec424c.png)

Click on `Create New App`

### Step 11
Now, you will be directed to a new page where you have to create your new heroku app
![image](https://user-images.githubusercontent.com/78433013/172592488-920384c1-d144-462d-acf2-75c35cbebab5.png)

Enter the valid app name as per your choice, make sure you have entered a name relevant to the app and available on Heroku.
![image](https://user-images.githubusercontent.com/78433013/172592969-e4c810d5-8cf0-47e5-94a5-7fd442e523b8.png)

Then click on `Create App`.
Wohoo!! you have successfully created your Heroku app, now you have to deploy the code in your local to Heroku.

### Step 12
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







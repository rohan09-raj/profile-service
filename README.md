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
Now, further test the remaining two API's. Now we will be changing the Request URL to:
```
http://localhost:8080/profile
```
![image](https://user-images.githubusercontent.com/78433013/166112104-37ab209f-9f42-4b54-b680-0088f67d7ac5.png)

Click on the `Send` button and you will get your own details that you have entered something in this format.

![image](https://user-images.githubusercontent.com/78433013/166113586-713e1a76-efde-47d5-8426-372cf4a1ba7c.png)




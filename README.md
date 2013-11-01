android-apps
============

android

Hello,

I hope you will like the app. Here are the commands that i have used.

//for getting conection with a remote repository
git remote add origin https://github.com/pcescipion/android-apps.git

+++for the UI_development+++

//to create a new branch 
git branch UI_development

//for switching from the master to the UI_development branch
git checkout UI_development

//for adding the changes into the staging area
git add TripSort*.*

//for tracking what we have changed
git status

//for storing the staged changes I run the commit command with a message
git commit -m "modifying the BoardingCards classes"


//for pushing and saving the changes that we stored in the previous step
git push -u origin UI_development
//after this command you have to type the user and password



+++for the develop branch+++

//to create a new branch
git branch UI_development

//for switching from the UI_development branch to the develop branch
git checkout develop

//for adding the changes into the staging area 
git add TripSort*.*

//for tracking what we have changed
git status

//for storing the staged changes I run the commit command with a message
git commit -m "sorting algorithm upload"

//for pushing and saving the changes that we stored in the previous step 
git push -u origin UI_development
//after this command you have to type the user and password

//for doing the merge i have used
git merge UI_development
git merge develop


# Flying-Chicken-Game
Flying Chicken Java Game 

Hi guys, This is my term project in Ankara University.(COM244 Object Oriented Programming)<br>
We tried to develop a game in NetBeans with using Java.<br><br>

### General lines
- The main character is chicken(Actually a chick :D)Can move up,down,left and right
- The chick can throw eggs. Every collepse between eggs and targets ,your score increase.
- Cat is main bad character. they are flying in the screen randomly. You have to escape them.<br>
If you collide with them, game over.
- We have two kind of target. One of them is more valuable.
- We have some levels depends on amount of score

### Screenshots
Optinally you can use two kind of game.:
<br> * Basic version is we have only one type of target.
<br> * Second version is we have two type of target
<br>*Default is second one. But if you delete **TargetSmall.java** file, you can reach the first one -mean basic version-*

![FlyingChicken](https://user-images.githubusercontent.com/50207648/72217577-00c0c080-3541-11ea-903b-e08ef8751762.png)
![FlyChi2](https://user-images.githubusercontent.com/50207648/72217578-00c0c080-3541-11ea-8ead-8d9a9e673d08.png)


### How can we run the program? 
* You should make a new java project in NetBeans.
* Add files and images(jpg and png)
* Optionally, you can change character or background images in your game. But at the same time you have to change their paths.
For example if you wanna change background image. <br>
First of all you should visit Background.java file.<br>
Open it and find **initBackground()** function. <br>
You will see **loadImage("src/javaoyunum7/bg.png")** in there. <br>
*src* means our source files which is made by NetBeans. *javaoyunum7* is our project name.<br>
You should upload a new .png or .jpg file as you wish in this project. (eg: newBackGround.jpg)<br>
Finally Change the path: **loadImage("src/javaoyunum7/newBackGround.jpg")** 
* You can run the project with Board.java


### Imagination
You can add components as you wish when developing a game. For example can be a second bad character like  dog.java<br>
Or level and interface logic is improvable.. <br>
Have fun! :))

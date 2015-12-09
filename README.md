# Space Invaders

![img](https://github.com/GeekyMoose/spaceinvaders/blob/master/screenshots/gif/general_demo.gif)

<!-- *********************************************************************** -->
## Description
February 2015

SpaceInvaders is a personal project realized during my second year of Bachelor of Computer Science. 


## Why this project?
My goal was to focus on one element: learn how to create dynamic events like explosions and movements. 
<br/>
For sure, using gif images could have been a solution but I wanted to learn and try how to program it entirely and in a 'nicely' way. Learn how to move elements and interacte with them (Collisions management, display an explosion etc)

Obviously, it was benefic for many other skills. Manage the keyboard for instance, or play sounds (Although the sounds library I created here is very basic, maybe an another project!)

University projects are always interesting. It's a great experience to work in small team with rules to follow. Personal projects, on the other hand, lets the freedom to focus on specific problematic I'm particulary interested in. We didn't had to create anymation so far. 
<br/>
An another benefic (Particulary important for me) is to be able to try new things (Like software architecture) without any risk of having a bad mark for that, or just disturbing the team by unceasing changes!


<!-- *********************************************************************** -->
## Installation
Clone this project on your computer using `git clone https://github.com/GeekyMoose/spaceinvaders.git`


<!-- *********************************************************************** -->
## Execute
#### On Linux
To run the project, use the script `exec.sh`
<br/>
The script must have the executable right (use `chmod 755 exec.sh`)

* Execute project with `./exec.sh`
* Execute and create a jar with `./exec.sh -j`

#### On Windows
Execute the jar file `spaceinvaders.jar`

#### On MAC
It the same procedure than for Linux but, to be honest, I haven't try. I know some people had issues with that (Probable because of the space encoding in the exec.sh script which invalidate this script)

#### Warning
I developed this game with Java 8 and I didn't check the compatibility with other version.


<!-- *********************************************************************** -->
## Explosion and animation

![img](https://github.com/GeekyMoose/spaceinvaders/blob/master/screenshots/gif/explosions.gif);

The explosions manager can be compared to an automata with a specific number of states.

* Each state is an image. (Even if `EvenApp` can theorically manage any type)
* When `EvenApp` start, a timer set a push delay which call next state.
* `DynamicEven` Extends `EvenApp` and add a position (x:y) behavior
* `ExplosionEvent` extends `DynamicEven` and create the specific explosion behavior

Note: I reused this library later, for the battleship project for example.


<!-- *********************************************************************** -->
## Death punishment
![img](https://github.com/GeekyMoose/spaceinvaders/blob/master/screenshots/gif/death_punishment.gif)

If an alien projectile hurt the player, we lose one life. A game break is created to marke this terrible event (Using Java Thread)

<!-- *********************************************************************** -->
## Screenshots
A full list of screenshots can be found in the [screenshots folder](https://github.com/GeekyMoose/spaceinvaders/tree/master/screenshots)


<!-- *********************************************************************** -->
## Bugs
* I noticed that, sometimes, the very first projectile (Sent by an alien) move slowler than expected. I didn't check for an explanation but it might be from the timer behavior. 

* We can notice a small display bug if we pause the game while an explosion is performed. When we go back to the game, the explosion disappear. As my first goal was to create explosions and dynamic events, I didn't try to fix that but it might comes from the thread behavior. (The automata continue)

* Note that the 'save' mode was finally not created. I wanted to add this option but, I fucused my work on dynamic events instead.

* [crit] This bug appear if we try to pause the game while we are dying! As a thread break is done to mark the death, the break thread won't be successfully applied.


<!-- *********************************************************************** -->
## Author
* Constantin MASSON [GeekyMoose](https://github.com/GeekyMoose)


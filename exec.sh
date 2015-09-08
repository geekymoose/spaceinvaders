#!/bin/bash
#
# Start the space invaders program
# create a folder build with .class, delete old if exists

# Create the build folder
function create_build_folder(){
	if [[ -e "build" ]];then
		rm -rf build
	fi
	mkdir build
	cp -r src/sounds build/ #copy sounds
	cp -r src/img build/ #copy images
}

# Launch program (javac + java)
function execute_program(){
	javac -d build -sourcepath src src/com/spaceinvaders/main/Main.java
	java -cp build com.spaceinvaders.main.Main
}


create_build_folder
execute_program

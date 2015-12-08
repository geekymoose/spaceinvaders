#!/bin/bash
#
# Author: Constantin MASSON
#
# Start the space invaders program
# create a folder build with .class, delete old if exists
#
# EXECUTE
# Just set the execut right and execute this script
# With j param, a jar will be created as well
#
declare param_j # Used for jar creation


# *****************************************************************************
# General program functions
# *****************************************************************************

#
# Function to process parameters
#
function process_parameters(){
	while getopts "xj" optname; do
		case "$optname" in
			"j") param_j=1 ;;
			"?") echo "Error"; exit 0;;
			":") echo "Error"; exit 0;;
			*) echo "Error"; exit 0;;
		esac
	done
	return $OPTIND
}

#
# Launch program (javac + java)
# Call jar creation if required
#
function main(){
	process_parameters "$@"
	create_build_folder
	javac -d build -sourcepath src src/com/spaceinvaders/main/Main.java
	java -cp build com.spaceinvaders.main.Main &

	# If jar required, create it
	if [[ ! -z $param_j ]];then
		create_jar
	fi
}

# *****************************************************************************
# Function for folders management
# *****************************************************************************

#
# Create the jar file
# In order to do that, manifest file will be created as well
#
function create_jar(){
	# First, create the manifest file
	echo "Manifest-Version: 1.0" > "build/manifest.mf"
	echo "Main-Class: com.spaceinvaders.main.Main" >> "build/manifest.mf"
	echo -e "\n\n\n" >> "build/manifest.mf"

	# Then, create the jar file
	cd build #place in build for jar creation
	jar -cfm spaceinvaders.jar manifest.mf com/* sounds/*
	cd .. #go back
	cp build/spaceinvaders.jar . #copy root directory
	# Note: img/* is not required since the img are recovered from data/img folder
}

# *****************************************************************************
# Function for folders management
# *****************************************************************************
# Create the build folder
function create_build_folder(){
	if [[ -e "build" ]];then
		rm -rf build
	fi
	mkdir build
	cp -r data/sounds build/ #copy sounds
	cp -r data/img build/ #copy images
}


main "$@" # START PRORAM


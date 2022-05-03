#!/bin/bash

#User input to script 

tech="${1}"

case "$tech" in
	"Java")
		echo " Its Java backed course "
		;;
	"SQL")
		echo "Its SQL database managmeent course"
		;;
	"Unix")
		echo "Unix basics and Unix scripting course"
		;;
	"ITIL")
		echo "IT managment process framework course"
		;;
	*)
		echo "you entered a invalid argument `basename ${1}`"
		echo "`basename ${0}` :  valid arguments are Java SQL Unix ITIL"
		exit 1
		;;
esac


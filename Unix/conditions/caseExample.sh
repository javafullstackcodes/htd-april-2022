#!/bin/bash

#User input to script 
echo "enter the technology"
read tech

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
		echo "Course not found"
		;;
esac


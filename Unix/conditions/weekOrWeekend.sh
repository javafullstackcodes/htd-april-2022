#!/bin/bash

day=$(date +"%u") 
TIME=$(date +"%p")

if [ $day -le 5 ]
then
	echo " today is weekday"
	if [ $TIME == "AM" ]
	then
		echo " It is Mornig "
	else	
		echo " It is Afternoon "
	fi
else
	echo "Its weekend not worry about time"
fi

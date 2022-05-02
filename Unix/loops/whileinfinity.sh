#!/bin/bash

#LIST=`ls -l|grep total | awk '{print $2}'`
DATE=`date +%M`
while [ $DATE -le 22 ]
do
	echo "time ticking"	
	echo $DATE
	DATE=`date +%M`
done

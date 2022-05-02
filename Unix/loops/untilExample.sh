#!/bin/bash
DATE=`date +%M`

until [ $DATE -eq 30 ]
do
	echo "Please focus on class"
	DATE=`date +%M`
done

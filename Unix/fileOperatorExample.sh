#!/bin/bash

#this is example script for file operator

echo "Please enter a file name"
read fileName

if [ -e $fileName ]
then
	echo "$fileName File exists"
	ls -l $fileName
else
	echo "$fileName File not exist"
fi

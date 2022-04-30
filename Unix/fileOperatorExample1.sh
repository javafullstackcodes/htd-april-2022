#!/bin/bash

#this is example script for file operator

echo "Please enter a file name"
read fileName

if [ -x $fileName ]
then
	echo "$fileName File have execute permissions"
	ls -l $fileName
else
	echo "$fileName File don't have execute permissions"
fi

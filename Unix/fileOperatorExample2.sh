#!/bin/bash

#this is example script for file operator

echo "Please enter directory name"
read directory

if [ -d $directory ]
then
	echo "$directory directory exists"
	ls -ld $directory
else
	echo "$directory directory not exist"
fi

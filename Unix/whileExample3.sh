#!/bin/bash

echo "enter the number where you want to start printing"
read START
echo "enter the last number you want to print"
read LAST

while [ $START -le $LAST ]
do
	echo $START
	START=`expr $START + 2`
done

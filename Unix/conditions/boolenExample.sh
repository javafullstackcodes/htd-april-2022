#!/bin/bash
#Boolen example
echo "enter the age"
read a

echo "Are you holding Indian citizenship? "
read b

if [  $a -ge 18  -a  $b == 'yes'  ]
then
	echo "Valid voter"
else
	echo "Not a valid voter"
fi

#!/bin/bash
#Boolen example
echo "enter the age"
read a

echo "Are you holding Indian citizenship? "
read b

if [  $a -ge 18  -o  $b == 'yes'  ]
then
	echo "Valid Individual for applying driving license"
else
	echo "Can't be applied for driving license"
fi

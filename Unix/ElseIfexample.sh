#! /bin/bash
echo " enter a value"
read a
echo " enter b value"
read b

if [ $a == $b ]
then
	echo "Both are equal"
elif [ $a -lt $b ]
then 
	echo "A is smaller"
elif [ $a -gt $b ]
then
	echo "A is bigger"
else
	echo "relation not found"
fi

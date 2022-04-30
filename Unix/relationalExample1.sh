#!/bin/bash
#Author : Surendra
# email :

echo "enter a value"
read a
echo "enter b value"
read b

if [ $a -eq $b ]
then
	echo "Condition :1 They are equal"
fi

if [ $a -ne $b ]
then
	echo "Condition :2 They are not equal"
fi

if [ $a -lt $b ]
then
	echo "Condition :3 A is smaller"
fi

if [ $a -gt $b ]
then
	echo "Condition :4 A is bigger"
fi

if [ $a -ge $b ]
then
	echo "Condition :5 A is greater or equal to B"
fi

if [ $a -le $b ]
then
	echo "Condition :6 A is smaller or equal to B"
fi

#!/bin/bash

day=$(date | awk '{print $1}')


if [ $day == Sun ]
then
	echo "It's Sunday"
elif [ $day == Mon ]
then
	echo "It's Monday"
elif [ $day == Tue ]
then
	echo "It's Tuesday"
elif [ $day == Wed ]
then
	echo "It's Wedsday"
elif [ $day == Thu ]
then
	echo "It's Thursday"
elif [ $day == Fri ]
then
	echo "It's Friday"
elif [ $day == Sat ]
then
	echo "It's Saturday"
else
	echo "date command not working as expected"
fi


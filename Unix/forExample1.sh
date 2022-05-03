#!/bin/bash

for I in `ls -l | awk '{print $9}'`
do
	if [ -x $I  -a  -f $I ]
	then
		echo "$I"
	fi
done

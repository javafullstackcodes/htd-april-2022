#!/bin/bash

#check if the atom binary exist?

ls -l /usr/bin/atom >/dev/null 2>&1
if [ $? -eq 0 ]
then
	echo " Launching atom editor application .........."
	/usr/bin/atom

else
	echo "atom application not found"
	exit 14
fi


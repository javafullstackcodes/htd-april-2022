#!/bin/bash

#check if the atom binary exist?

ls -l /usr/bin/atom1
if [ $? -eq 0 ]
then
	echo " Launching atom editor application .........."
	/usr/bin/atom

else
	echo "atom application not found"
fi


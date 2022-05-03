#!/bin/bash

#Define the first function
a=${1}
b=${2}

HelloWorld () {
   if [ ${1} > ${2} ]
   then
	   echo "A is bigger"
   else
	   echo "B is Bigger"
   fi
}

echo "Start the program"
HelloWorld

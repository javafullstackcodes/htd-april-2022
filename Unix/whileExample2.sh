#!/bin/bash

a=10

while [ $a -le 20 ]
do
	echo $a
	a=`expr $a + 2`
done
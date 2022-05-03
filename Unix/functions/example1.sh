#!/bin/bash

number1 () {
 echo "This is first function"
 number2
}

number2 () {
	echo "this is second function"
}

number1

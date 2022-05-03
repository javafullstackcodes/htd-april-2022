#!/bin/bash
#

#This needs source and destination directories as arguments
#Print the current working directory
SOURCE=${1:?sourceDirectoryMissing}
DEST=${2:?destDirectoryMising}

echo "current working directory is $SOURCE "

#Check if it is a dirctory and contains files

file_check () {
	if [ -d $SOURCE -a -d $DEST ]
	then
		file_count=`ls -l $SOURCE |head -1 |awk '{print $2}'`
		echo $file_count
		if [ $file_count -ne "0" ]
		then
			files=exist
			echo "$SOURCE contains files"
		else
			files=notExist
			echo "$SOURCE not contains files"
			exit 100
		fi
	else
		echo "given source is not a directory"
		exit 11
	fi

}

backup () {
	if [ $files != null ]
	then
		echo "taking tar backup"
		tar -czf "$SOURCE.tz" $SOURCE
	else
		echo "no files exist exiting "
		exit 13
	fi
}

copy_backup () {
	echo "copy the backup file to destination"
	cp -rp "$SOURCE.tz" $DEST
}

remove_files_in_source () {
	echo "removing the files from source directory"
	rm -rf "$SOURCE"
	mkdir $SOURCE
}

clean_tar () {
	echo "cleaning the backup file after copy"
	rm -rf "$SOURCE.tz"
}
#main program
file_check
backup
copy_backup
remove_files_in_source
clean_tar
#end of main program


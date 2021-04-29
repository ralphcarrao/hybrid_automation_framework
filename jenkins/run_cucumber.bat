@echo off
echo Set parameters..
set app=%1
set tags==%2
echo Execute cucumber gradle command
gradle cucumber_%app% -Ptags=%tags%
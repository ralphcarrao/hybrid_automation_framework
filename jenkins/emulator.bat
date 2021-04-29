@echo off
echo Set parameters..
set deviceName=%1
echo Start emulator..
emulator -avd %deviceName%
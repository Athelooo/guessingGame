#!/bin/bash

echo "Athena Hosseinis program"

LAB="Athena_Hosseini_labb"
mkdir -p "$LAB"
cp *.java "$LAB"/
cd "$LAB" || exit 1

echo "Running game from $(pwd)"
echo "compiling..."
javac *.java || { echo "Compiliation failed"; exit 1; }

echo "running..."
java GuessingGame

echo "Done!"
echo "Removing class files..."
rm -f *.class
ls -1


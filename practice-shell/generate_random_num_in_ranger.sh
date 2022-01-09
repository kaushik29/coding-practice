#!/bin/bash

if [ $# -ne 1 ]; then
  echo "E.g. $0  50"
  exit 1
fi

range=$1

echo $range
echo $(( ( RANDOM % $range )  + 1 ))

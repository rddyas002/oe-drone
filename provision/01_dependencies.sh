#!/bin/bash

sudo apt-get update -y

sudo apt-get install -y \
build-essential \
chrpath \
diffstat \
gawk \
git \
libncurses5-dev \
pkg-config \
subversion \
texi2html \
texinfo \
python2.7

sudo ln -sf /usr/bin/python2.7 /usr/bin/python

sudo dpkg-configure dash

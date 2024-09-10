# QSET Yocto
This repository contains the required yocto project code to build a custom linux image used on our OBC.

# Usage
From the project root, run `docker build -t <image-name> -f docker/dockerfile .`, then `docker run -it <image-name>` to run the container interactively.

## Building
Once in the interactive container, run any bitbake commands you want to build an image, typically `bitbake core-image-base`.

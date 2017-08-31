#!/usr/bin/env bash

GREEN='\033[0;32m'
CYAN='\033[0;36m'
NC='\033[0m' # No Color

# First, we clean up a little
lein monolith each clean
# then we install a "non-lein-v-ed" version to our local M2 repository so the with-all job can grab all the dependencies from there.
lein monolith each with-profiles +install-for-with-all-repl install
echo
echo
printf "${GREEN}Congratulations${NC}: Now you can start your REPL with '${CYAN}lein monolith with-all repl${NC}'"
echo
FROM ubuntu:latest
LABEL authors="leona"

ENTRYPOINT ["top", "-b"]
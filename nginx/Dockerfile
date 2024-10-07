ARG VERSION=1.27.2
FROM arm64v8/nginx:${VERSION}

RUN apt-get update

COPY ./default.conf /etc/nginx/conf.d/default.conf

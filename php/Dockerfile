FROM php:fpm-alpine
RUN apk add --no-cache $PHPIZE_DEPS openssl-dev
RUN pecl install mongodb
RUN docker-php-ext-enable mongodb

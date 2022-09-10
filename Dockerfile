FROM httpd
COPY reverse_proxy/conf/httpd.conf /usr/local/apache2/conf/httpd.conf
CMD ["httpd", "-D", "FOREGROUND"]

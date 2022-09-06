### REVERSE_PROXY MANUAL CHANGES ####
In ideal world Dockerfile should not have any problem while running but 
due to some unknown error i was unable to make it work. I would list
the step which were manually did. 
* Pulled latest httpd
* Run the httpd container 
* Copy the httpd.conf file to /usr/local/apache2/conf
* update the image with new name 
 `-> docker commit <Container Name>`<BR>
 `-> docker tag <newly created image id> <new name for the image e.g:rp>`
 `-> docker run --name reverse_Proxy -d -p 80:80 rp:latest`

and then browse the  http://localhost/app/hello which successfully show helloworld application greeting message. 

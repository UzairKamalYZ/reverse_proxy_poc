# reverse_proxy_poc
POC which shows how we can put a reverse proxy in front of application. <BR>
`HelloWorld` application which return a greeting message by calling /app/hello and is exposed on port `9999`<BR>
`reverse_proxy` redirects user to `HelloWorld` application of a request starting with /app. 

Note: The number of examples will grow with time and would be well documented. 

### Example 1 

Any user call to /app to gets result from 'HelloWorld'application. <Br> 
``http://localhost/app/hello   --> http://localhost:9999/app/hello `` 

const http = require('http');

// Create server
http.createServer((req,res) => {
    // Write a response
    res.write('Hello World');
    res.end()

})
.listen(5000, () => console.log('Server Running...'));
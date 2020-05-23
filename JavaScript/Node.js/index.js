const http = require('http');
const path = require('path');
const fs = require('fs');

const server = http.createServer((req, res) => {
    // if(req.url === '/'){
    //     fs.readFile(path.join(__dirname, 'public', 'index.html'), (err, content) => {
    //         res.writeHead(200, {'Content-Type': 'text/html'});
    //         res.end(content);

    //         if (err) throw err;
    //     })
    // }

    if(req.url === '/api/users'){
    const users = [
        {name: 'Bob John', age: 40},
        {name: 'Dan Nath', age: 30}
    ];

    // res.writeHead(200, {'Content-Type': 'application/json'});
    // res.end(JSON.stringify(users));

    // }

    let filePath = path.join(__dirname, 'public', req.url === '/' ? 'index.html' : req.url);

    // Extention of file
    let extname = path.extname(filePath);

    // Initial content type
    let contenType = 'text/html';

    switch(extname) {
        case '.html':
            contentType = 'text/html';
            break;
    }

    //Read file
    fs.readFile(filePath, (err, content) => {

        if (err){
        if (err.code === 'ENOENT') {
            // 404 not found
            fs.readFile(path.join(__dirname, 'public', '404.html'), (err, content) => {
                res.writeHead(200, {'Content-Type': 'text/html'}); 
                res.end(content, 'utf8');  
            })
        } else {
            // server error code
            res.writeHead(500);
            res.end(`Server Error: ${err.code}`);
            }
        } else {
            // Success
            res.writeHead(200, {'Content-Type': contentType});
            res.end(content, 'utf8');
        }

    })

});

// Run on server port or Default 5000
const PORT = process.env.PORT || 5000;

server.listen(PORT, () => console.log(`Server running on port: ${PORT}`));

